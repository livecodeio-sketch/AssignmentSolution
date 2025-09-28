package Live;

class Remote {
    void turnOn(int age){
        System.out.println("Turning ON");
    }
}

public class TvRemote extends Remote {
    void turnOn(int age){
        System.out.println("Turning TV On");
    }
    int add(){
        return 1+3;
    }

    public static void main(String[] args) {
        Remote rem = new TvRemote();
        rem.turnOn(3);

    }
}
