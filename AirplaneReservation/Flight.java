package AirplaneReservation;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Flight {
    private int ID = 0;
    private static int nextID = 0;
    private String destination;
    private double clock;
    private Map<Flight, Seat> flightSeats;

    public Flight(String destination){
        this.ID = this.nextID;
        nextID++;
        this.clock = new Random().nextDouble(24);
        this.destination = destination;
        this.flightSeats = new HashMap<>();
    }

    public int getID() {
        return ID;
    }

    public double getClock() {
        return clock;
    }

    public String getDestination() {
        return destination;
    }

    public Map<Flight, Seat> getFlightSeats() {
        return flightSeats;
    }

    public void showAvailableSeats(Flight flight){
        for(Seat available : this.flightSeats.values()){
            this.flightSeats.values().forEach(seat -> System.out.println(available));
        }
    }

    public void bookSeat(Seat seat){
        if (!this.flightSeats.containsValue(seat)) {
            System.out.println("Seat has been booked.");
        } else {
            System.out.println("Seat number " + seat + " is booked.");
            this.flightSeats.remove(this, seat);
        }
    }

    @Override
    public String toString() {
        return "Flight information: \nDestination: "
                + getDestination() + "\nFlightID: "
                + getID() + "\nTime: "
                + getClock();

    }
}

