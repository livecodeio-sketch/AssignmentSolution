package Week_1_Set_1;

public class ReportCard {
    public static void main(String[] args) {
        int marks = 87;
        if(marks >= 90)
            System.out.println("A");
        else if(marks >= 75)
            System.out.println("B");
        else if(marks >= 50)
            System.out.println("C");
        else
            System.out.println("Fail");
    }
}
