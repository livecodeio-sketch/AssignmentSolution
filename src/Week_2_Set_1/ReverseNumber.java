package Week_2_Set_1;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
