package com.example.multipleEntitites.controller;

import com.example.multipleEntitites.entity.Address;
import com.example.multipleEntitites.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping("/getAddress")
    public List<Address> getEmployeesAddress(){
        return addressRepository.findAll();
    }
}
