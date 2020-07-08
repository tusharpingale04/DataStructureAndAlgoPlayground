package arrays;

import java.util.ArrayList;

public class JavaArrayClasses {
    public static void main(String[] args) {
        //Vector -> Grows by 100% - synchronized
        //ArrayList -> Grows by 50% - not synchronized
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.remove(0);
        list.toArray();
        System.out.println(list);
    }
}
