package NTTDATA.accounts.service;

import NTTDATA.accounts.entity.CurrentAccount;
import NTTDATA.accounts.repository.CurrentAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class CurrentAccountService {

    @Autowired
    CurrentAccountRepository currentAccountRepository;

    public Flux<CurrentAccount> findAll(){
        return currentAccountRepository.findAll();
    }

    public Flux<CurrentAccount> getCurrentByClientId(int clintId){
        return currentAccountRepository.findByClientId(clintId);
    }

}
