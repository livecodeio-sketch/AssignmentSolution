package Week_2_Set_1;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is an Armstrong number");
        } else {
            System.out.println(temp + " is not an Armstrong number");
        }
    }
}
