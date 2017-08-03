package strategy;

import java.util.List;

public class SinglePrice implements Model {
 
	@Override
	public long getRevenue(List<Flight> flight) {
		return (long) (getTotalPassengers(flight) * baseTicketPrice - totalFlyCost);
	}

}
