package TypesOfDataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    // Queue = LIFO data structure. First-In First-Out
    // A collection designed for holding elements prior to processing
    // Linear data structure

    // add = enqueue, offer()
    // remove = dequeue, poll()

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.peek());// Show the first element on the Linked List
        System.out.println(queue);

        System.out.println(queue.poll()); // Decueues the linked list
        System.out.println(queue.poll()); // Decueues the linked list

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));

        // Where are queues useful?
        // 1. Keyboard Buffer (letters should appear on the screen in the order they're
        // pressed)
        // 2. Printer Queue (Print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first search

    }

}
