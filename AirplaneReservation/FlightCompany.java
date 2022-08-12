package AirplaneReservation;

import java.util.List;

public class FlightCompany {
    private String companyName;
    private List<Flight> listOfFlights;

    public FlightCompany(String companyName, List<Flight> listOfFlights) {
        this.companyName = companyName;
        this.listOfFlights = listOfFlights;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void showFlights(){
        listOfFlights.stream().forEach(flight -> System.out.println(flight));
    }


}
