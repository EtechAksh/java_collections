package main;


import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.push("ABC");
        stack1.push(123);
        stack1.push('C');
        stack1.push(23);
        stack1.push("XYZ");

        System.out.println(stack1);

        System.out.println("Popping out the topmost element/last added element:" + stack1.pop());
        System.out.println("Stack after .pop()" + stack1);

        System.out.println("Peeking at the topmost element/last added element:" + stack1.peek());
        System.out.println("Stack after .peek()" + stack1);



    }
}
