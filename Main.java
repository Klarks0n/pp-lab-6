public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan", 1000);
        Worker worker2 = new Worker("Klara", 1200);
        Worker worker3 = new Worker("Olek", 1100);
        Worker worker4 = new Worker("Justyna", 1150);

        Manager manager = new Manager("Darek", 3000, 1500);

        System.out.println("Worker 1 salary: " + worker1.getSalary());
        worker1.work();
        
        System.out.println("Worker 2 salary: " + worker2.getSalary());
        worker2.work();
        
        System.out.println("Worker 3 salary: " + worker3.getSalary());
        worker3.work();
        
        System.out.println("Worker 4 salary: " + worker4.getSalary());
        worker4.work();
        
        System.out.println("Manager salary: " + manager.getSalary());
        manager.work();
    }
}