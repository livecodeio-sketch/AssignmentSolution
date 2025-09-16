package Week_1_Set_2;

public class ElectricityBillDiscount {
    public static void main(String[] args) {
        int billAmt = 1001;
        if(billAmt >1000)
            billAmt -= billAmt*10/100;
        else if (billAmt >500)
            billAmt -= billAmt*5/100;
        System.out.println("Amount to be paid: "+billAmt);
    }
}
