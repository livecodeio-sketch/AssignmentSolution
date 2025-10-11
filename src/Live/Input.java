package Live;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // eat the left over
        //System.out.println(age);

        System.out.println("Enter you str: ");
        String greet = scanner.nextLine(); // next line
        System.out.println(greet);

        scanner.close();
    }
}
