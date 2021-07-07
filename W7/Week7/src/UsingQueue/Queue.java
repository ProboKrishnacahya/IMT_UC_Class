package UsingQueue;

import java.util.ArrayList;

/**
 *
 * @author Probo Krishnacahya (0706012010039)
 */
public class Queue {

    private ArrayList data = new ArrayList();

    public void enqueue(Object item) {
        data.add(item);
    }

    public Object dequeue() {
        return data.remove(0);
    }

    public Object peek() {
        if (data.size() > 0) {
            return data.get(0);
        } else {
            return "Queue is empty";
        }
    }

    public boolean isEmpty() {
        return (data.size() == 0);
    }
}
