package TaxiBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
    private int taxiId;
    private char currentSpot;
    private int freeTime;
    private int earnings;
    private List<Booking> bookings;

    Taxi(int id){
        this.taxiId = id;
        this.currentSpot = 'A';
        this.freeTime = 0;
        this.earnings = 0;
        this.bookings = new ArrayList<>();
    }

    public boolean isFreeAt(char pickUp, int pickUpTime){
        int travelTime = Math.abs(currentSpot-pickUp); // 65 - 67 = -2
        // int travelTime = distance*1;
        return (freeTime + travelTime) <= pickUpTime ;
    }

    public void assignBooking(Booking booking){
        this.bookings.add(booking);
        this.earnings += booking.getAmount();
        this.currentSpot = booking.getDropPoint();
        this.freeTime = booking.getDropTime();
    }

    public int getTaxiId(){
        return taxiId;
    }
    public char getCurrentSpot() {
        return currentSpot;
    }
    public int getFreeTime(){
        return freeTime;
    }
    public int getEarnings(){
        return earnings;
    }
    public List<Booking> getBookings(){
        return bookings;
    }
}
