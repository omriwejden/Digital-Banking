package tn.backend.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import tn.backend.entities.AccountOperation;

import java.util.List;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {
    //retourner les opération d'un compte
    List<AccountOperation> findByBankAccountId(String accountId);
    Page<AccountOperation> findByBankAccountIdOrderByOperationDateDesc(String accountId, Pageable pageable);

}
