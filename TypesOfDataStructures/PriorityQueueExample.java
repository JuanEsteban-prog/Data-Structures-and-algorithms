package TypesOfDataStructures;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    // A data structure that serves elements based on priority, not insertion order

    public static void main(String[] args) {

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(1.0);
        queue.offer(2.0);
        queue.offer(3.0);
        queue.offer(4.0);
        queue.offer(3.5);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
