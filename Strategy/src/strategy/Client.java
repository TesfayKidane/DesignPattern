package strategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Flight>flight= new ArrayList<>();
		flight.add(new Flight(233));
		flight.add(new Flight(300));
		flight.add(new Flight(200));
		flight.add(new Flight(188));
		FlightModel model= new FlightModel();
		model.setFlightStrategy(new SinglePrice());
		
		System.out.println(model.getRevenue(flight));
		model.setFlightStrategy(new TwoClasses());
		System.out.println(model.getRevenue(flight));
		model.setFlightStrategy(new MultiClass());
		System.out.println(model.getRevenue(flight));
	}

}
