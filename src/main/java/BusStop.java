import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int queueCount(){
        return queue.size();
    }

    public void addToQueue(Person person){
        queue.add(person);
    }

    public Person removeFromQueue(){
        return this.queue.remove(0);
    }
}
