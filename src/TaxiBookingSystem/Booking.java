package TaxiBookingSystem;

public class Booking {
    private int bookingId;
    private int dropTime;
    private int amount;
    private Customer customer;

    Booking(int id, Customer customer, int dropTime, int amount){
        this.bookingId = id;
        this.customer = customer;
        this.dropTime = dropTime;
        this.amount = amount;
    }

    public int getBookingId() {
        return bookingId;
    }
    public int getCustomerId(){
        return customer.getCustomerId();
    }
    public char getPickUpPoint(){
        return customer.getPickup();
    }
    public char getDropPoint(){
        return customer.getDrop();
    }
    public int getPickUpTime(){
        return customer.getPickUpTime();
    }
    public int getDropTime(){
        return dropTime;
    }
    public int getAmount(){
        return amount;
    }

}
