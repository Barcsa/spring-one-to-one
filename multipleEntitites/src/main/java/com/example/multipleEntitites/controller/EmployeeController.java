package com.example.multipleEntitites.controller;

import com.example.multipleEntitites.entity.Employee;
import com.example.multipleEntitites.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/saveEmployees")
    public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> employeeDetails){
        employeeRepository.saveAll(employeeDetails);
        return ResponseEntity.ok("Data saved");
    }

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();

    }
    @DeleteMapping ("/deleteEmployees/{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable Long id){
        employeeRepository.deleteById(id);
        return ResponseEntity.ok("Employee with id: " +id + " deleted.");
    }
}
