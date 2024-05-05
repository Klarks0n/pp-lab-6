class Manager extends Worker {
    private double bonus;
    
    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    
    @Override
    public void work() {
        System.out.println(getName() + " is managing.");
    }
}