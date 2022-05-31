package NTTDATA.accounts.service.implemt;

import NTTDATA.accounts.entity.CurrentAccount;
import NTTDATA.accounts.repository.CurrentAccountRepository;
import NTTDATA.accounts.service.CurrentAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CurrentAccountServiceImpl implements CurrentAccountService {

    @Autowired
    private CurrentAccountRepository currentAccountRepository;

    @Override
    public Mono<CurrentAccount> saveCurrentAccount(CurrentAccount currentAccount) {
        return currentAccountRepository.save(currentAccount);
    }

    @Override
    public Mono<CurrentAccount> findById(int id) {
        return currentAccountRepository.findById(id);
    }

    @Override
    public Flux<CurrentAccount> findAll() {
        return currentAccountRepository.findAll();
    }

    @Override
    public Flux<CurrentAccount> findByClientId(String clientId) {
        return currentAccountRepository.findByClientId(clientId);
    }
}
