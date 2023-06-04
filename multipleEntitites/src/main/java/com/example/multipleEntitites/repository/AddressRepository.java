package com.example.multipleEntitites.repository;

import com.example.multipleEntitites.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
