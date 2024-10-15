package week07.prac105;

import java.util.ArrayList;

public class Manager extends Person {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();

        //both class instance can access to Person class
        Manager mng = new Manager();
        Employee emp = new Employee();

        emp.setName("Paul");
        emp.setAge(40);
        emp.setId("8781");

        empList.add(emp);

        System.out.println(empList.getFirst().getName());
        }
}