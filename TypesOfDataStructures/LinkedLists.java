package TypesOfDataStructures;

import java.util.LinkedList;

public class LinkedLists {

    // LinkedList = stores Nodes in 2 parts (data + address)
    // Nodes are in non-consecutive memory locations
    // Elements are linked using pointers
    //
    // Singly Linked List
    // Node Node Node
    // [data | address] -> [data | address] -> [data | address]
    //
    // Doubly Linked List
    // Node Node
    // [address | data | address] <-> [address | data | address]
    //
    // advantages?
    // 1. Dynamic Data Structure (allocates needed memory while running)
    // 2. Insertion and Deletion of Nodes is easy. O(1)
    // 3. No/Low memory waste

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();
        /*
         * linkedList.push("A");
         * linkedList.push("B");
         * linkedList.push("C");
         * linkedList.push("D");
         * linkedList.push("F");
         */

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4, "E");
        linkedList.remove("E");

        System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");
        linkedList.removeFirst();

        System.out.println(linkedList);

    }

}
