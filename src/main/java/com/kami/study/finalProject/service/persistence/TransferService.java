package com.kami.study.finalProject.service.persistence;

import com.kami.study.finalProject.model.Transfer;
import com.kami.study.finalProject.model.Users;

import java.util.List;

public interface TransferService extends DefaultService<Transfer> {
    List<Transfer> commitTransfer(Transfer transfer);
    boolean checkTransfer(Transfer transfer);
    Transfer create(Double amount, Users sender, Users recipient);
    Transfer create(Double amount, String senderCardOrAccountNumber, String recipientCardOrAccountNumber);
    List<Transfer> findByUserMail(String mail);
    List<Transfer> findByAccountId(Long id);

    List<Transfer> findByUserId(Long id);
}
