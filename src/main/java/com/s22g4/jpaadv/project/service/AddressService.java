package com.s22g4.jpaadv.project.service;

import com.s22g4.jpaadv.project.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> findAll();
    Address find(int id);
    Address save(Address address);
    void delete(Address address);
}
