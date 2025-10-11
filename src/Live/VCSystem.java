package Live;

class Vechicle{
    void start() {

    }
    void stop() {

    }
}

class Bike extends Vechicle{
    @Override
    void start() {
        System.out.println("Bike Starts with a Kick.");
    }
    @Override
    void stop() {
        System.out.println("Bike Stops with a Hand-Break.");
    }

}
class Car1 extends Vechicle{
    @Override
    void start() {
        System.out.println("Cars Starts with an ignition key.");
    }
    @Override
    void stop() {
        System.out.println("Cars Stops with a ABS-Break.");
    }

}
public class VCSystem {
    public static void main( String[] args ) {
        Vechicle v;
        v = new Bike();
        v.start();
        v.stop();

        v = new Car1();
        v.start();
        v.stop();

    }

}
