
import java.util.ArrayList;

public class LinkedPriorityQueue implements PriorityQueue {

    ArrayList list[];

    public LinkedPriorityQueue(int levels) {
        list = new ArrayList[levels];
        for (int i = 0; i < levels; i++) {
            list[i] = new ArrayList();

        }
    }

    public void enqueue(Object o, int priority) {
        list[priority].add(o);
    }

    public Object peekFront() {

        for (int i = 0; i < list.length; i++) {
            if (list[i].size() > 0) {
                return list[i].get(0);
            }

        }
        throw new IllegalStateException("Queue is empty");

    }

    @Override
    public Object dequeue() {
        for (int i = 0; i < list.length; i++) {
            if (list[i].size() > 0) {
                return list[i].remove(0);
            }

        }
        throw new IllegalStateException("Queue is empty");
    }

    @Override
    public void enqueue(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return list.length;
    }

    public boolean hadData() {
        for (int i = 0; i < list.length; i++) {
            if (list[i].size() > 0) {
                return true;
            }
        }
        return false;
    }

}
