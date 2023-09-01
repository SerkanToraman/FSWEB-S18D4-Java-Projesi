package com.s22g4.jpaadv.project.dao;

import com.s22g4.jpaadv.project.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
