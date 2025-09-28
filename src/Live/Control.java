package Live;
abstract class Remotes {
    abstract void turnOn();
    abstract void brandIntructions();
    abstract void modelNumber();
    void add(){
        System.out.println();
    }
}

abstract class TvRemotes extends Remotes{
    @Override
    void turnOn(){
        System.out.println("Turning Tv On");
    }
}

class LgTv extends TvRemotes{
    @Override
    void brandIntructions(){
        System.out.println("LG TV Instructions");
    }
    @Override
    void modelNumber(){
        System.out.println("Model Number: 3452");
    }
}


//class AcRemote extends Remotes{
//    @Override
//    void turnOn(){
//        System.out.println("Turning AC On");
//    }
//}

public class Control {
    public static void main(String[] args) {
        Remotes r = new LgTv();
        // r = new SamsungTv();
        r.turnOn();
        //r = new AcRemote();
        r.brandIntructions();
    }
}
