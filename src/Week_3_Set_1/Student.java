package Week_3_Set_1;

class Student {
    private String name;
    private int rollNumber;
    private int marks;

    Student(String n, int r, int m) {
        name = n;
        rollNumber = r;
        marks = m;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, 85);
        Student s2 = new Student("Bob", 102, 92);
        Student s3 = new Student("Charlie", 103, 78);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
