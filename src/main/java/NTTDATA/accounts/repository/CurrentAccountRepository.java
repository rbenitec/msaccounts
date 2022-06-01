package NTTDATA.accounts.repository;

import NTTDATA.accounts.entity.CurrentAccount;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface CurrentAccountRepository extends ReactiveMongoRepository<CurrentAccount,String> {
    Flux<CurrentAccount> findByClientId(String clientId);

    Mono<CurrentAccount> findById(String id);
}
