package Week_2_Set_1;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 1221;
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if (rev == temp) {
            System.out.println(temp + " is a Palindrome");
        } else {
            System.out.println(temp + " is not a Palindrome");
        }
    }
}
