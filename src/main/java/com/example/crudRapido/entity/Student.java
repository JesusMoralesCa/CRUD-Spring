package com.example.crudRapido.entity;

import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name = "tbl_Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentID;
    private String firstName;
    private String lastName;

    @Column(name = "emailAddress", unique = true, nullable = false)
    private String email;


}
