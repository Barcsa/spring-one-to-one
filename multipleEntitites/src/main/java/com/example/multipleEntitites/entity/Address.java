package com.example.multipleEntitites.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;


@Transactional
@Entity
@Data
@NoArgsConstructor
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "add_id")
    private Long addresId;
    private String city;
    private String addressType;

    @OneToOne(mappedBy = "address")
    private Employee employee;

}
