package com.kami.study.finalProject.repository;

import com.kami.study.finalProject.model.Account;
import com.kami.study.finalProject.model.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransferRepository extends JpaRepository<Transfer, Long> {
//    @Query("select t from Transfer t join Account a on a = t or a.id = t.recipient.id where a.id = ?1")
//    List<Transfer> getTransfersByAccountId(Long accountId);
    // todo: think about it. It should be.


    List<Transfer> getTransfersBySender(Account sender);

    List<Transfer> getTransfersByRecipient(Account recipient);

    @Query("select t from Transfer t join Account a on t.recipient.id = a.id or t.sender.id = a.id where a.id = ?1")
    List<Transfer> getTransfersByAccountId(Long accountId);
}
