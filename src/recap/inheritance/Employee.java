package recap.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
    public int id;
    public BigDecimal salary;
    public int employeeNumber;

    public Employee(int id,BigDecimal salary, int employeeNumber) {
        this.id = id;
        this.salary = salary;
        this.employeeNumber = employeeNumber;
    }

    public Employee(int id,String name, String dob, BigDecimal salary, int employeeNumber) {
        super(id,name, dob);
        this.salary = salary;
        this.employeeNumber = employeeNumber;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }


    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", employeeNumber=" + employeeNumber +
                '}';
    }
}
