package AirplaneReservation;

import java.util.Random;

public class Flight {
    private String flightID;
    private double clock;
    private String destination;
    private Seat seatNumber;

    public Flight(String destination){
        this.flightID = "";
        this.clock = new Random().nextDouble();
        this.destination = destination;
        this.seatNumber = null;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public void setClock(double clock) {
        this.clock = clock;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setSeatNumber(Seat seatNumber) {
        this.seatNumber = seatNumber;
    }

}

