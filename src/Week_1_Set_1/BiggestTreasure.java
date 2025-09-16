package Week_1_Set_1;

public class BiggestTreasure {
    public static void main(String[] args) {
        int a = 5, b = 7, c = 67;
        if(a > b && a > c){
            System.out.println(a);
        }
        else if(b>a && b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}
