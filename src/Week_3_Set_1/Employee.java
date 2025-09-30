package Week_3_Set_1;

class Employee {
    private String name;
    private int id;
    private double salary;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("John");
        e.setId(101);
        e.setSalary(75000);

        e.displayEmployee();
    }
}