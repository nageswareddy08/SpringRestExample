package com.corejava;

/**
 * Created by Nageswar on 7/15/2018.
 */
public class Employee extends Person {

    String name;
    int age;

    public Employee(String name)
    {
        super(name);
        System.out.println("Calling Employee class constructor");
        this.name="Martin";
    }
    public void workOnAssignment()
    {
        // Working on assignment
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void printName()
    {
        System.out.println("Printing default name from person class : "+this.name);
    }

    public static void main(String args[])
    {
        Employee e1=new Employee("John");
        System.out.println(e1.getName());
        e1.printName();
    }
}
