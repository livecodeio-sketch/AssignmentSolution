package Week_1_Set_1;

public class RobotAssistant {
    public static void main(String[] args) {
        int a = 5, b = 7;
        char op = '*';
        switch (op){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
        }
    }
}
