package NTTDATA.accounts.controller;

import NTTDATA.accounts.entity.CurrentAccount;
import NTTDATA.accounts.service.CurrentAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/current")
public class CurrentAccountController {

    @Autowired
    CurrentAccountService currentAccountService;

    //Encontrar Todos
    @GetMapping()
    public Flux<CurrentAccount> getCurrentAccounts (){
        return currentAccountService.findAll();
    }

    @PostMapping()
    public Mono<CurrentAccount> saveCurrentAccount(@RequestBody CurrentAccount currentAccount){
        return currentAccountService.save(currentAccount);
    }

    @GetMapping("/{id}")
    public Mono<CurrentAccount> findById(@PathVariable("id") String id){
        return currentAccountService.findById(id);
    }

    //Encontrar por Id
    @GetMapping("/byclient/{clientId}")
    public Flux<CurrentAccount> getAccountCurrentsById(@PathVariable("clientId") String clientId){
        return currentAccountService.findByClientId(clientId);

    }

}
