package patterns.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hoang Phuong on 10/31/2016.
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<Employee>();
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public String toString() {
        return ("Employee: [ Name: " + name + ", Dept: " + dept + ", Salary: " + salary + " ]");
    }
}
