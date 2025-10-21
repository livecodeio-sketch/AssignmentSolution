package Week_4_Set_1;

interface Payment {
    boolean pay(double amount);
    boolean refund(double amount);
}

class CreditCardPayment implements Payment {
    private String cardNumber;
    public CreditCardPayment(String cardNumber){ this.cardNumber = cardNumber; }
    @Override
    public boolean pay(double amount){
        System.out.printf("Charging %.2f to card %s%n", amount, cardNumber);
        return true; // simulate success
    }
    @Override
    public boolean refund(double amount){
        System.out.printf("Refunding %.2f to card %s%n", amount, cardNumber);
        return true;
    }
}

class UPIPayment implements Payment {
    private String vpa;
    public UPIPayment(String vpa){ this.vpa = vpa; }
    @Override
    public boolean pay(double amount){
        System.out.printf("Sending %.2f via UPI to %s%n", amount, vpa);
        return true;
    }
    @Override
    public boolean refund(double amount){
        System.out.printf("Refunding %.2f via UPI to %s%n", amount, vpa);
        return true;
    }
}

public class PaymentDemo {
    public static void main(String[] args){
        Payment p1 = new CreditCardPayment("4111-xxxx-xxxx-1111");
        Payment p2 = new UPIPayment("goms@bank");
        p1.pay(2500);
        p2.pay(99.99);
        p1.refund(100);
    }
}
