package arrays;

import java.util.Arrays;

public class BasicArray {
    public static void main(String[] args) {
        //create a basic array with size 3
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println(Arrays.toString(numbers));

        //Different Way
        int[] numbers1 = {10,20,30};
        System.out.println(numbers1.length);

        //Dynamic Array
        Array array = new Array(3);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.removeAt(2);
        array.print();
        System.out.println(array.indexOf(30));
    }
}
