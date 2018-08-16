package com.hibernate.dto;

import org.hibernate.annotations.AccessType;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

/**
 * Created by Nageswar on 7/11/2018.
 */
@Entity
@Table(name = "EMPLOYER")
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLOYER_ID")
    private long id;
    @Column(name = "EMPLOYER_NAME")
    private String name;
    @Column(name = "EMPLOYER_SALARY")
    private double salary;
    @OneToOne(fetch = FetchType.LAZY,mappedBy = "employer")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private Address address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
