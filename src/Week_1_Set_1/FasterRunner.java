package Week_1_Set_1;

public class FasterRunner {
    public static void main(String[] args) {
        int time1 = 5;
        int time2 = 7;
        if(time1 < time2){
            System.out.println("Arjun is Faster");
        }
        else {
            if(time2 < time1){
                System.out.println("Varun is Faster");
            }
            else {
                System.out.println("Tie");
            }
        }
    }
}
