package main;


import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {


        PriorityQueue<Character> pq1 = new PriorityQueue<>();
        pq1.add('C');
        pq1.add('Z');
        pq1.add('A');
        pq1.add('B');
        pq1.add('Y');

        System.out.println(pq1);


//        Comparator<Integer> length = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o1.equals(o2))
//                    return 1;
//                else return 0;
//
//            }
//        };


        PriorityQueue<Integer> numbers = new PriorityQueue<Integer>(new CustomComparator());
        numbers.add(199);
        numbers.add(34);
        numbers.add(56);
        numbers.add(12);

        System.out.println(numbers);


        PriorityQueue<Student> studentQueue = new PriorityQueue<>(5, new StudentComparator());
        studentQueue.add(new Student("Preetha", 34));
        studentQueue.add(new Student("Akshatha", 31));
        studentQueue.add(new Student("Harsha", 40));


        for (Student student : studentQueue) {
            System.out.println("Student: " + student.name + " Marks: " + student.marks);
        }


    }
}
