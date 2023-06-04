package com.example.multipleEntitites.repository;

import com.example.multipleEntitites.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
