package TaxiBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    private List<Taxi> taxis;
    private int bookingId = 1;

    public BookingSystem(int taxiCount){
        taxis = new ArrayList<>();
        for(int i=1; i<=taxiCount; i++){
            taxis.add(new Taxi(i));
        }
    }

    int calculateCharges(char pickup, char drop){
        int distance = Math.abs(drop-pickup) * 15;
        int charges = 100;
        distance -= 5;
        charges = charges+ (distance*10);
        return charges;
    }

    Taxi findTaxi(char pickUp, int pickUpTime){
        List<Taxi> freeTaxis = new ArrayList<>();

        for(Taxi taxi: taxis){
            if(taxi.isFreeAt(pickUp, pickUpTime))
                freeTaxis.add(taxi);
        }

        if(freeTaxis.isEmpty())
            return null;

        int minDistance = 999999;
        for(Taxi t: freeTaxis){
            int distance = Math.abs(t.getCurrentSpot()-pickUp);
            if(distance < minDistance)
                minDistance = distance;
        }

        List<Taxi> closest = new ArrayList<>();
        for(Taxi t: freeTaxis){
            int distance = Math.abs(t.getCurrentSpot()-pickUp);
            if(distance == minDistance)
                closest.add(t);
        }

        Taxi selected = closest.get(0);
        for(Taxi t: closest){
            if(t.getEarnings() < selected.getEarnings())
                selected = t;
        }

        return selected;
    }

    void bookTaxi(Customer c){
        Taxi selected = findTaxi(c.getPickup(), c.getPickUpTime());
        if(selected == null){
            System.out.println("No Taxi found");
            return;
        }

        int distance = Math.abs(c.getDrop()- c.getPickup());
        int travelTravel = distance*1;
        int dropTime = c.getPickUpTime() + travelTravel;
        int amount = calculateCharges(c.getPickup(), c.getDrop());

        Booking booking = new Booking(bookingId, c, dropTime, amount);
        bookingId++;
        selected.assignBooking(booking);

        System.out.println("Taxi Allocated");
        System.out.println("Taxi "+selected.getTaxiId()+" Allocated");

    }

    void displayTaxi(){
        for(Taxi taxi: taxis){
            System.out.println();
            System.out.println();
            System.out.println("Taxi-"+taxi.getTaxiId()+"   Total Earnings: "+taxi.getEarnings());
            System.out.println("Booking Id\tCustomer Id\tFrom\tTo\tPickup Time\tDrop Time\tCharges");
            for(Booking b: taxi.getBookings()){
                System.out.println(b.getBookingId()+"\t\t"+b.getCustomerId()
                +"\t\t"+b.getPickUpPoint()+"\t\t"+b.getDropPoint()
                +"\t\t"+b.getPickUpTime()+"\t\t"+b.getDropTime()+"\t\t"
                +b.getAmount());
            }
            System.out.println();
        }
    }

}
