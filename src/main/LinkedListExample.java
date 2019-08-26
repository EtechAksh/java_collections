package main;

import java.util.Collections;
import java.util.LinkedList;


public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(12);
        numbers.add(34);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        System.out.println(numbers);

        for (Integer number : numbers) {
            int num = number;
            System.out.println(num);
        }

        numbers.addFirst(30);
        System.out.println("Using .addFirst() numbers: " + numbers);

        numbers.addLast(67);
        System.out.println("Using .addLast() numbers: " + numbers);

        numbers.remove(2);
        System.out.println("Using .remove(2) numbers: " + numbers);

        numbers.add(4,15);
        System.out.println("Using .add() to add in a particular index: " + numbers);

        numbers.set(4,99);
        System.out.println("Using .set() to replace in a particular index: " + numbers);

        numbers.removeFirst();
        System.out.println("Using .removeFirst() numbers: " +numbers);

        numbers.removeLast();
        System.out.println("Using .removeLast() numbers: " +numbers);


        //code to swap two numbers in specific positions
        Collections.swap(numbers, 2,4);
        System.out.println("After swapping: "+numbers);

    }


}
