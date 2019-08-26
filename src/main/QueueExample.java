package main;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue queue1 = new LinkedList();

        queue1.add("ABC");  //head
        queue1.add(123);
        queue1.add("XYZ");
        queue1.add(23);
        queue1.add("Etech");  //tail

        System.out.println(queue1);

        System.out.println(".element(): " + queue1.element());
        System.out.println("Queue after .element():" + queue1);

        System.out.println(".remove(): " + queue1.remove());
        System.out.println("Queue after .remove():" + queue1);

        System.out.println(".peek(): " + queue1.peek());
        System.out.println("Queue after .peek():" + queue1);

        System.out.println(".poll(): " + queue1.poll());
        System.out.println("Queue after .poll():" + queue1);




    }
}
