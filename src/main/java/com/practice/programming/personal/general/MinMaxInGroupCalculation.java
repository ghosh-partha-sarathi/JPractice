package com.practice.programming.personal.general;

import com.practice.programming.entities.Employee;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Write a program to print maximum salary of each department from a list of Employee objects
 * using Java streams.
 */
public class MinMaxInGroupCalculation {
    public static void main(String[] args){
        List<Employee> inputEmployeeList = getEmployeeList();
        printDeptWiseMaxSalary(inputEmployeeList);
    }

    private static void printDeptWiseMaxSalary(List<Employee> listEmployee){
        Map<String, Optional<Employee>> deptSalaryMap =
                listEmployee.stream().collect(
                        Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(
                                Comparator.comparing(Employee::getSalary))));

        // deptSalaryMap.entrySet().forEach(entry -> System.out.println(entry.getKey()+ "::" +entry.getValue()));
        deptSalaryMap.forEach((dept, employee) -> System.out.println(dept+ "::" +employee));
    }

    private static List<Employee> getEmployeeList(){
        List<Employee> empList = new ArrayList<>();

        Employee emp1 = new Employee();
        emp1.setCode(1);
        emp1.setName("Alan Robles");
        emp1.setDepartment("Marketing");
        emp1.setSalary(55000);
        empList.add(emp1);

        Employee emp2 = new Employee();
        emp2.setCode(2);
        emp2.setName("Felicity Hoover");
        emp2.setDepartment("Marketing");
        emp2.setSalary(57000);
        empList.add(emp2);

        Employee emp3 = new Employee();
        emp3.setCode(3);
        emp3.setName("Daisy Coleman");
        emp3.setDepartment("Marketing");
        emp3.setSalary(59000);
        empList.add(emp3);

        Employee emp4 = new Employee();
        emp4.setCode(4);
        emp4.setName("Tristen Stuart");
        emp4.setDepartment("HR");
        emp4.setSalary(71000);
        empList.add(emp4);

        Employee emp5 = new Employee();
        emp5.setCode(5);
        emp5.setName("Stormi McKee");
        emp5.setDepartment("HR");
        emp5.setSalary(67000);
        empList.add(emp5);

        Employee emp6 = new Employee();
        emp6.setCode(6);
        emp6.setName("Ana Phillips");
        emp6.setDepartment("HR");
        emp6.setSalary(64000);
        empList.add(emp6);

        Employee emp7 = new Employee();
        emp7.setCode(7);
        emp7.setName("Sierra Terry");
        emp7.setDepartment("Sales");
        emp7.setSalary(81000);
        empList.add(emp7);

        Employee emp8 = new Employee();
        emp8.setCode(8);
        emp8.setName("Joy Jensen");
        emp8.setDepartment("Sales");
        emp8.setSalary(85000);
        empList.add(emp8);

        Employee emp9 = new Employee();
        emp9.setCode(9);
        emp9.setName("Kristian Shaw");
        emp9.setDepartment("Sales");
        emp9.setSalary(81000);
        empList.add(emp9);

        return empList;
    }
}
