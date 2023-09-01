package com.s22g4.jpaadv.project.dao;

import com.s22g4.jpaadv.project.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
