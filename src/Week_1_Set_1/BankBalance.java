package Week_1_Set_1;

public class BankBalance {
    public static void main(String[] args) {
        int balance = -89;
        if(balance > 0){
            System.out.println("Positive Balance");
        }
        else{
            if(balance < 0){
                System.out.println("Overdraft");
            }
            else {
                System.out.println("Zero Balance");
            }
        }
    }
}
