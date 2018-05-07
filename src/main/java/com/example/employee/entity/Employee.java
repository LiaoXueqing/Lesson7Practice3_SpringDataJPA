package com.example.employee.entity;
import javax.persistence.Entity;

@Entity
public class Employee {
    @Id
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private Integer companyId;
    private Integer salary;



}
