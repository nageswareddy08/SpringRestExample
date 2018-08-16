package com.hibernate.dto;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Nageswar on 7/11/2018.
 */
@Entity
@Table(name = "STUDENT_TAB",uniqueConstraints = {@UniqueConstraint(columnNames = {"STUDENT_ID"})})
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENT_ID",nullable =false,unique = true,length = 10)
    private int id;
    @Column(name = "STUDENT_NAME",length = 20)
    private String name;
    @Column(name = "STUDENT_ROLE",length = 20)
    private String role;
    @Column(name = "JOINING_DATE")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date creationDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
