package queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    LinkedList list = new LinkedList();

    void add(int num) {
        list.addFirst(num);
    }

    Object poll() {
        return list.removeLast();
    }

    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add(1);
        queue.poll();
    }
}
