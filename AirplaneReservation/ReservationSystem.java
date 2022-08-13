package AirplaneReservation;

public class ReservationSystem {
    public static void main(String[] args) {

        Flight oslo = new Flight("Oslo");
        Flight bergen = new Flight("bergen");
        Flight Stavanger = new Flight("Stavanger");
        Flight Trysil = new Flight("Trysil");
        Flight Drammen = new Flight("Drammen");
        Flight Trondheim = new Flight("Trondheim");

        System.out.println(bergen);
        System.out.println(oslo);
        System.out.println(Trondheim);


    }
}
