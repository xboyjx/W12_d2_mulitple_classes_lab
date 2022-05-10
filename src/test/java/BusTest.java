import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person passenger;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Dunfermline", 3);
        passenger = new Person();
        busStop = new BusStop("Princes Street");
        busStop.addToQueue(passenger);
    }

    @Test
    public void busHasDestination(){
        assertEquals("Dunfermline", bus.getDestination());
    }

    @Test
    public void busHasCapacity(){
        assertEquals(3, bus.getCapacity());
    }

    @Test
    public void passengerStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassengerIfNotFull(){
        bus.addPassenger(busStop);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void wontAddPassengerIfFull(){
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        assertEquals(5,bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(busStop);
        bus.removePassenger();
        assertEquals(0,bus.passengerCount());
    }
}
