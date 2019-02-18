package recap.inheritance;

import java.math.BigDecimal;

public class InheritanceMembersAndMethods {
    public static void main(String[] args) {
        Employee employee0 = new Employee(0,new BigDecimal(4800),666);
        System.out.println(employee0.getEmployeeNumber());
        System.out.println(employee0.getSalary());
        System.out.println(employee0.getDob());
        System.out.println(employee0.getName());
    }
}
