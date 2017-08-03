package strategy;

import java.util.List;

public class FlightModel {
	private Model flightStrategy;

	public void setFlightStrategy(Model flightStrategy) {
		this.flightStrategy = flightStrategy;
	}
	
	public  long getRevenue(List<Flight>flight){
		 return flightStrategy.getRevenue(flight);
	}

}
