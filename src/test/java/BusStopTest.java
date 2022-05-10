import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Princes Street");
        person = new Person();
    }

    @Test
    public void hasName(){
        assertEquals("Princes Street", busStop.getName());
    }

    @Test
    public void queueEmptyToStart(){
        assertEquals(0, busStop.queueCount());
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addToQueue(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addToQueue(person);
        busStop.removeFromQueue();
        assertEquals(0,busStop.queueCount());
    }


}
