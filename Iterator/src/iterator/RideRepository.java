package iterator;

import java.util.ArrayList;
import java.util.List;

public class RideRepository implements Aggregate {

    private List<Ride> rides;

    public RideRepository() {
        rides = new ArrayList<>();
    }

    public void addRide(Ride ride) {
        this.rides.add(ride);

    }

    @Override
    public Iterator getIterator() {

        return new RideIterator();
    }

    public List<Ride> getRides() {
        return rides;
    }

    private class RideIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < getRides().size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return rides.get(index++);
            }
            return null;
        }

    }

}
