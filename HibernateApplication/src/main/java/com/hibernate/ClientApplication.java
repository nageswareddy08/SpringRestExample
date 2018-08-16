package com.hibernate;

import com.hibernate.dto.Address;
import com.hibernate.dto.Employee;
import com.hibernate.dto.Employer;
import com.hibernate.dto.Student;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

/**
 * Created by Nageswar on 7/8/2018.
 */
public class ClientApplication {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Employer emp = getTestEmployee();
        session.save(emp);
        long id = (Long) session.save(emp);
        System.out.println("1. Employee save called without transaction, id="+id);
        System.out.println(emp);
        HibernateUtil.shutdown();

    }
    private static Employer getTestEmployee() {
        Employer emp = new Employer();
        Address add = new Address();
        emp.setName("Test Emp");
        emp.setSalary(1000);
        add.setAddressLine("Test address1");
        add.setCity("Test City");
        add.setZipcode("12121");
        emp.setAddress(add);
        add.setEmployee(emp);
        return emp;
    }
}
