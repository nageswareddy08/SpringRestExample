package com.spring.core;

/**
 * Created by Nageswar on 6/19/2018.
 */
public class Employee {
    Student student;

    public void setStudent(Student student) {
        this.student = student;
        student.setId(1);
        student.setName("Hi");
    }
    public void getStudentDetails(){
        System.out.println("Student details ::"+student.getId()+"---"+student.getName());
    }
}
