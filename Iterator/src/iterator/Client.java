package iterator;

public class Client {
	public static void main(String[] args) {
		
		RideRepository repository=new RideRepository();
		Iterator iterator=repository.getIterator(); 
		Ride ride1= new Ride("Lwamhailu", "20", 13);
		Ride ride2= new Ride("fevenGoitom", "20", 14);
		Ride ride3= new Ride("AdulisAbun", "20", 15);
		repository.addRide(ride1);
		repository.addRide(ride2);
		repository.addRide(ride3);
		System.out.println("Iterator"+iterator.toString());
		
		while(iterator.hasNext()){
		System.out.println(iterator.next());
		}
	}

}
