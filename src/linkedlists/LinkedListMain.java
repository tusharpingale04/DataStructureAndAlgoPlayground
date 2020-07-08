package linkedlists;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        System.out.println(list.contains(10));
        System.out.println(list.indexOf(10));
        System.out.println(list.size());
        System.out.println(list);

        //Dynamic implemented Linked list
        linkedlists.LinkedList linkedList = new linkedlists.LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addFirst(5);
        /*linkedList.removeFirst();
        linkedList.removeLast();*/
        linkedList.reverse();
        System.out.println(linkedList.indexOf(10));
        System.out.println(linkedList.contains(30));
        System.out.println(linkedList.size());
        System.out.println(linkedList.findKthFromTheEnd(1));
        System.out.println(Arrays.toString(linkedList.toArray()));
    }
}
