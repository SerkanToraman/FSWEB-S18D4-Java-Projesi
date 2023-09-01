package com.s22g4.jpaadv.project.service;

import com.s22g4.jpaadv.project.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account find(int id);
    Account save(Account account);
    void delete(Account account);
}
