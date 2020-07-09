package stacks;

import java.util.Arrays;

public class Stack {
    private int[] items = new int[5];
    private int count;

    public void push(int item){
        if(items.length == count){
            throw new StackOverflowError();
        }
        items[count] = item;
        count++;
    }

    public int pop(){
        if(count == 0){
            throw new IllegalArgumentException();
        }
        count--;
        return items[count];
    }

    public int peek(){
        if(count == 0){
            throw new IllegalArgumentException();
        }
        return items[count - 1];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "items=" + Arrays.toString(Arrays.copyOfRange(items, 0, count)) +
                ", count=" + count +
                '}';
    }
}
