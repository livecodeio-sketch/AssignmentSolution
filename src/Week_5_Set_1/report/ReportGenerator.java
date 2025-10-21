package Week_5_Set_1.report;

import java.util.Scanner;
import Week_5_Set_1.student.*;

public class ReportGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Enter city: ");
        String city = sc.nextLine();

        System.out.print("Enter state: ");
        String state = sc.nextLine();

        Address address = new Address(city, state);
        Student student = new Student(name, rollNo, marks, address);

        student.displayStudentDetails();

        sc.close();
    }
}
