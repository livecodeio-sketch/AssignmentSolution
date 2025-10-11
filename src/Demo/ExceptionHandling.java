package Demo;

import java.util.Scanner;

public class ExceptionHandling {
    int age = 0;
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ExceptionHandling n = null;
        int count = 0;
        try{
            count = 5/a;
            //System.out.println(arr[5]); // will not execute
            System.out.println(n.age);
        }
        catch (ArithmeticException e){
            System.out.println("Divide by Zero Exception"+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bounds");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Anyways");
        }


        System.out.println("Hello");
        System.out.println(count);
    }
}
