package ru.turulin.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.turulin.models.Account;

@Repository
public interface AccountRepo extends CrudRepository<Account, Long> {
    Account findByUsername(String username);
}
