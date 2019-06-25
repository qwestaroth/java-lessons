package lessons.constructors;

import lessons.domainmodel.Employee;


public class ConstructorsMain {

    public static void main(String[] args) {



        Employee employee = new Employee("cyberdrow", "developer", 50000);
        Employee employee1 = new Employee("John", "developer", 50000);
        System.out.println(employee);
        System.out.println(employee1);

    }

}
