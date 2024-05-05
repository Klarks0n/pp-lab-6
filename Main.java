import java.util.ArrayList;

import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan", 1000, 1, "2023-01-01", "Junior Developer");
        Worker worker2 = new Worker("Klara", 1200, 2, "2022-12-15", "Senior Developer");
        Worker worker3 = new Worker("Olek", 1100, 3, "2023-02-10", "QA Engineer");
        Worker worker4 = new Worker("Justyna", 1150, 4, "2023-03-05", "Project Manager");

        Manager manager = new Manager("Darek", 3000, 1500, 2, "2022-11-20", "Development Manager");
    
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

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());
        
        System.out.println(worker1.getName() + " equals manager: " + worker1.equals(manager));
        System.out.println(worker1.getName() + " equals worker2: " + worker1.equals(worker2));
        System.out.println(worker1.getName() + " equals worker3: " + worker1.equals(worker3));
    }
}