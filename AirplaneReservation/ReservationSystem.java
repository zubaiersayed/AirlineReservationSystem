package AirplaneReservation;

import java.util.Date;

public class ReservationSystem {
    public static void main(String[] args) {
        System.out.println("hei");

        Customer cs = new Customer("Zubaier", new Date(), 200);
        System.out.println(cs.getID());
        System.out.println(cs.getID());
        System.out.println(cs.getID());

        Customer ps = new Customer("Peivaston", new Date(), 300);

        System.out.println(ps.getID());


    }
}
