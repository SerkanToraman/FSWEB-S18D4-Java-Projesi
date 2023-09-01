package com.s22g4.jpaadv.project.dao;

import com.s22g4.jpaadv.project.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
