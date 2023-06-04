package com.example.multipleEntitites.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Transactional
@Entity
@Data
@NoArgsConstructor
@Table(name = "employee_details")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long empId;
    private String empName;
    private Integer empAge;
    //address_add_id

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_add_id")

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_emp_id", referencedColumnName = "emp_id")
//    private List<Address> address;
    private Address address;
}
