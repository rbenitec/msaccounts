package NTTDATA.accounts.controller;

import NTTDATA.accounts.entity.CurrentAccount;
import NTTDATA.accounts.service.CurrentAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/current")
public class CurrentAccountController {

    @Autowired
    CurrentAccountService currentAccountService;

    //Encontrar Todos
    @GetMapping()
    public Flux<CurrentAccount> getAccountCurrents (){
        return currentAccountService.findAll();
    }

    //Encontrar por Id
    @GetMapping("/byclient/{clientId}")
    public Flux<CurrentAccount> getAccountCurrentsById(@PathVariable("clientId") int clientId){
        return currentAccountService.getCurrentByClientId(clientId);
    }

}
