package TaxiBookingSystem;

public class Customer {
    private int customerId;
    private char pickup;
    private char drop;
    private int pickUpTime;

    Customer(int id, char pickup, char drop, int pickUpTime){
        this.customerId = id;
        this.pickup = pickup;
        this.drop = drop;
        this.pickUpTime = pickUpTime;
    }

    public int getCustomerId(){
        return customerId;
    }
    public char getPickup(){
        return pickup;
    }
    public char getDrop(){
        return drop;
    }
    public int getPickUpTime(){
        return pickUpTime;
    }

}
