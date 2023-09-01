package com.s22g4.jpaadv.project.service;

import com.s22g4.jpaadv.project.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer find(int id);
    Customer save(Customer customer);
    void delete(Customer customer);
}
