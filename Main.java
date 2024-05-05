import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import company.abstracts.Employee;
public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan", 1000, 1, "2023-01-01", "Junior Developer");
        Worker worker2 = new Worker("Klara", 1200, 2, "2022-12-15", "Senior Developer");
        Worker worker3 = new Worker("Olek", 1100, 3, "2023-02-10", "QA Engineer");
        Worker worker4 = new Worker("Justyna", 1150, 4, "2023-03-05", "Project Manager");
        Worker worker5 = new Worker("Diana", 1000, 5, "2023-01-01", "Junior Developer");
        Worker worker6 = new Worker("Alicja", 1200, 5, "2023-05-15", "Senior Developer");
        Worker worker7= new Worker("Krzysztof", 1100, 6, "2023-07-10", "QA Engineer");

        Manager manager = new Manager("Darek", 3000, 1500, 2, "2022-11-20", "Development Manager");
        Manager manager2 = new Manager("Bartek", 3000, 2, "2023-11-20", "Development Manager");
    
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);
        
        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() + ", Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary() + ")");
        }

        System.out.println(worker5.getName() + " has code: " + worker5.hashCode());
        System.out.println(worker6.getName() + " has code: " + worker6.hashCode());
        System.out.println(worker7.getName() + " has code: " + worker7.hashCode());
        System.out.println(manager2.getName() + " has code: " + manager2.hashCode());
        
        System.out.println(worker5.getName() + " equals manager: " + worker5.equals(manager2));
        System.out.println(worker5.getName() + " equals worker2: " + worker5.equals(worker6));
        System.out.println(worker5.getName() + " equals worker3: " + worker5.equals(worker7));
        
    }
}