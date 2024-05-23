package com.practice.programming.personal.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FactoryMethodExample {
    public static void main(String... args) {
        List<Employee> empBaseList = new ArrayList<>();
        Employee emp1 = new Employee(1, "Partha", 38, "partha-sarathi.ghosh@capgemini.com");
        Employee emp2 = new Employee(2, "Anusha", 30, "anusha.h-k@capgemini.com");
        Employee emp3 = new Employee(3, "Shruti", 35, "shruti.mayank-jain@capgemini.com");
        Employee emp4 = new Employee(4, "Jashvant", 40, "jashvantha.v@capgemini.com");
        Employee emp5 = new Employee(5, "Saravanan", 25, "saravanan.sathyamoorthy@capgemini.com");
        Collections.addAll(empBaseList, emp1, emp2, emp3, emp4, emp5);

        List<Employee> unmodiableEmpList = Collections.unmodifiableList(empBaseList);
        /* trying to modify unmodifiable list */
        // unmodiableEmpList.remove(emp1);

        /* printing unmodifiable list after updating base list */
        empBaseList.remove(emp1);
        unmodiableEmpList.forEach(emp -> System.out.println(emp));
    }

    Employee emp6 = new Employee(6, "Nitesh", 45, "nitesh.f.kumar@capgemini.com");
    Employee emp7 = new Employee(7, "Vivek", 28, "vivek-ishwarlal.patil@capgemini.com");
    Employee emp8 = new Employee(8, "Deepak", 43, "alugu.deepak@capgemini.com");
}

class Employee {
    private int id;
    private String name;
    private int age;
    private String email;

    public Employee(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}

