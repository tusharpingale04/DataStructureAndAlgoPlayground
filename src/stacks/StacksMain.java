package stacks;

import java.sql.Statement;

/**
 * lIFO
 * last in first out
 * push add item in stack
 * pop remove item from top
 * peek tells top item without removing from stack
 * isEmpty tells if stack is empty
 * for eg: reversing or undo is the best implementation of stack
 */
public class StacksMain {
    public static void main(String[] args) {
        StringReverser reverser = new StringReverser();
        System.out.println(reverser.reversed("Tushar"));

        //Dynamic stack
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.toString());
        System.out.println(stack.peek());
    }


}
