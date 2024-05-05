class Worker {
    private String name;
    private double salary;
    
    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void work() {
        System.out.println(name + " is working.");
    }
}