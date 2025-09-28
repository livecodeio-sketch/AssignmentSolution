package Live;
// interface + interface = extends
// interface + class = implements
// class + class = extends
interface Car{
    void drive();
}

interface ElectricCar extends Car {
    @Override
    default void drive(){
        System.out.println("Electric Car is Driving");
    }
    default void batteryHealth(){
        System.out.println("Battery Health");
    }
}

interface PetrolCar extends Car {
    @Override
    default void drive(){
        System.out.println("Petrol Car is Driving");
    }
    default void fuelLeft(){
        System.out.println("Fuel Left");
    }
}

class HybridCar implements ElectricCar, PetrolCar {
    @Override
    public void drive(){
        ElectricCar.super.drive();
    }
}

public class IDemo {
    public static void main(String[] args) {
        HybridCar hb = new HybridCar();
        hb.drive();
    }
}
