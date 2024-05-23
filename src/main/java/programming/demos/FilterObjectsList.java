package programming.demos;

import com.practice.programming.entities.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FilterObjectsList {
    public static void main(String[] args) {
        FilterObjectsList objFilterList = new FilterObjectsList();
        List<Employee> listEmployee = objFilterList.getEmployeeList();

        /**
         * print list of employee names with salary more than 1500000
         */
        listEmployee.stream().filter(emp -> emp.getSalary()>1500000).forEach(emp->System.out.println(emp.getName()));
    }

    private List<Employee> getEmployeeList() {
        List<Employee> sampleEmployeeList = new ArrayList<>();

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();
        Employee emp5 = new Employee();

        emp1.setCode(111);
        emp1.setName("Partha");
        emp1.setDepartment("IT");
        emp1.setSalary(1800000);

        emp2.setCode(222);
        emp2.setName("Debasmita");
        emp2.setDepartment("ECE");
        emp2.setSalary(1000000);

        emp3.setCode(333);
        emp3.setName("Priya");
        emp3.setDepartment("DO");
        emp3.setSalary(700000);

        emp4.setCode(444);
        emp4.setName("Pinak");
        emp4.setDepartment("AI");
        emp4.setSalary(500000);

        emp5.setCode(555);
        emp5.setName("Sai");
        emp5.setDepartment("DO");
        emp5.setSalary(2000000);

        sampleEmployeeList.add(emp1);
        sampleEmployeeList.add(emp2);
        sampleEmployeeList.add(emp3);
        sampleEmployeeList.add(emp4);
        sampleEmployeeList.add(emp5);

        return sampleEmployeeList;
    }
}
