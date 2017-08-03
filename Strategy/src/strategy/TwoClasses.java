package strategy;

import java.util.List;

public class TwoClasses implements Model {

	@Override
	public long getRevenue(List<Flight> flight) {
		int totalPassengers = getTotalPassengers(flight);
		int bussinessPassengers = (1 / 3) * (totalPassengers);
		int coachPassengers = (2 / 3) * totalPassengers;
		double bussinessPassengersTotal = bussinessPassengers * 1.5 * baseTicketPrice;
		double coachPassengersTotal = coachPassengers * 0.75 * baseTicketPrice;
		return (long) (bussinessPassengersTotal + coachPassengersTotal - ((1.1) * totalFlyCost + totalFlyCost));
	}

}
