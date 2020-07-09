package queues;

import java.util.Arrays;

public class ArrayQueue {

    private int[] items;
    private int rear;
    private int front;
    private int count;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    /**
     * using circular array to store elements
     * @param item
     */
    public void enqueue(int item){
        if(items.length == count){
            throw new IllegalArgumentException();
        }
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue(){
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "items=" + Arrays.toString(items) +
                ", count=" + count +
                '}';
    }
}
