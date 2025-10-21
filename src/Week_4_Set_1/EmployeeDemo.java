package Week_4_Set_1;

class Employee {
    protected String name;
    protected double salary;
    public Employee(String name, double salary){ this.name=name; this.salary=salary; }
    public double getBonus(){ return salary * 0.05; } // default 5%
    @Override
    public String toString(){ return name + " (salary=" + salary + ")"; }
}

class Manager extends Employee {
    public Manager(String name, double salary){ super(name, salary); }
    @Override
    public double getBonus(){ return salary * 0.20; } // managers 20%
}

class Developer extends Employee {
    public Developer(String name, double salary){ super(name, salary); }
    @Override
    public double getBonus(){ return salary * 0.10; } // developers 10%
}

public class EmployeeDemo {
    public static void main(String[] args){
        Employee[] staff = new Employee[] {
                new Manager("Goms", 120000),
                new Developer("Code io", 85000),
                new Employee("Siva", 50000)
        };
        for(Employee e : staff){
            System.out.printf("%s -> Bonus = %.2f%n", e, e.getBonus());
        }
    }
}

