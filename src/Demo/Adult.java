package Demo;

class UnderAgeException extends Exception{
    UnderAgeException(String msg){
        super(msg);
    }
}

public class Adult {
    static void isAdult(int age) {
        try{
            if(age >= 18){
                System.out.println("Adult");
            }
            else{
                throw new UnderAgeException("Age below 18");
            }
        }
        catch (UnderAgeException u){
            System.out.println(u);
        }
    }
    public static void main(String[] args) {
        int age = 17;
        isAdult(age);


    }
}
