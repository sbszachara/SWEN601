package testprep;

public abstract class Employee {
    private String name;
    private double salary;

    public Employee(String n, double d) {
        this.name = n;
        this.salary = d;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return salary;
    }

    public abstract double calculateBonus();

    public static void main(String[] args) {
        Manager manager = new Manager("Bob", 200000.35);
        Developer devey = new Developer("Steven", 140500.45);

        manager.paySalary();
        devey.paySalary();

    }
    
}
