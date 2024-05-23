package programming.entities;

import lombok.Data;

@Data
public class Employee {
    private int code;
    private String name;
    private String department;
    private String designation;
    private String phoneNo;
    private long salary;
}
