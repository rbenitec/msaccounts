package NTTDATA.accounts.service;

import NTTDATA.accounts.entity.CurrentAccount;
import NTTDATA.accounts.repository.CurrentAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CurrentAccountService {

    //Guardar una cuenta
    Mono<CurrentAccount> save(CurrentAccount currentAccount);

    //Encontrar cuenta por id
    Mono<CurrentAccount> findById(String id);

    //Obtener todas la cuentas
    Flux<CurrentAccount> findAll();

    //Encontrar las cuentas por clientID
    Flux<CurrentAccount> findByClientId(String clientId);

    /*
    @Autowired
    CurrentAccountRepository currentAccountRepository;

    public Flux<CurrentAccount> findAll(){
        return currentAccountRepository.findAll();
    }

    public Flux<CurrentAccount> getCurrentByClientId(int clintId){
        return currentAccountRepository.findByClientId(clintId);
    }
    */


}
