package strategy;

import java.util.List;

public class MultiClass implements Model{

	@Override
	public long getRevenue(List<Flight> flight) {
		int totalPassengers = getTotalPassengers(flight);
	    int firstClassPassengers = (1/10)*totalPassengers;
	    double firstClassPassengersCost = firstClassPassengers*4*baseTicketPrice;
	    int bussinessClassPassengers = (1/5)*totalPassengers;
	    double bussinessClassPassengersCost = bussinessClassPassengers*1.5*baseTicketPrice;
	    int coachPassengers = (7/10)*totalPassengers;
	    double coachPassengersCost = coachPassengers*0.75*baseTicketPrice;
		return (long) (firstClassPassengersCost + bussinessClassPassengersCost + coachPassengersCost - (1.2*totalFlyCost + totalFlyCost));
	}

}
