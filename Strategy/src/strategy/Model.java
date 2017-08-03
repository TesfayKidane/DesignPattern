package strategy;

import java.util.List;

public interface Model {
	public final double baseTicketPrice=300;
	public final double totalFlyCost=50000;
	public  long getRevenue(List<Flight>flight);
	default public int getTotalPassengers(List<Flight>flight){
		return flight.stream().map(p->p.getPassengers()).reduce((x,y)->x+y).get();
	}

}
