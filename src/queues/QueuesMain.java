package queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * FIFO
 * First in first out
 * enqueue item in queue from back
 * dequeue item from front of queue
 * peek tells top item without removing from queue
 * isEmpty tells if queue is empty
 * for eg: printer printing jobs in queue
 * airport queue etc.
 * Linked List and Array Deque
 */
public class QueuesMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        reverse(queue);

        //Dynamic ArrayQueue
        ArrayQueue queue1 = new ArrayQueue(5);
        queue1.enqueue(100);
        queue1.enqueue(200);
        queue1.enqueue(300);
        queue1.enqueue(400);
        queue1.dequeue();
        queue1.dequeue();
        queue1.enqueue(500);
        queue1.enqueue(600);
        queue1.enqueue(700);
        System.out.println(queue1.toString());

        //Dynamic Stack Queues
        QueueWithStacks queueWithStacks = new QueueWithStacks();
        queueWithStacks.enqueue(10);
        queueWithStacks.enqueue(20);
        queueWithStacks.enqueue(30);
        queueWithStacks.enqueue(40);
        System.out.println(queueWithStacks);
    }

    private static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
        System.out.println(queue);
    }
}
