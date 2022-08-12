package AirplaneReservation;

import java.util.Date;

public class Customer {
    private static int ID = 0;
    private String name;
    private Date date;
    private double balance;

    public Customer(String name, Date date, double balance) {
        this.ID++;
        this.name = name;
        this.date = date;
        this.balance = balance;
    }

    public int getID(){
        return this.ID;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public double getBalance() {
        return balance;
    }

    // Cancel flight option
    // reserve flight option
    // search for flights


}
