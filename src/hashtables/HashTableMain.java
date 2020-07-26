package hashtables;

import java.util.HashMap;
import java.util.Map;

public class HashTableMain {
    public static void main(String[] args) {
        //HashMap provided by java utils
        //HM can store null key and values
        Map<Integer, String> employee = new HashMap<>();
        employee.put(1,"Tushar");
        employee.put(2,"Saurabh");
        employee.put(3,"Prashant");
        employee.put(4,"Satya");
        System.out.println(employee.containsKey(4)); //O(1)
        System.out.println(employee.containsValue("Satya")); //O(n)
        System.out.println(employee);

        for(var item: employee.entrySet()){
            System.out.println(item.getKey()+" "+item.getValue());
        }

        CharFinder charFinder = new CharFinder();
        System.out.println(charFinder.findFirstNonRepeatingChar("a green apple"));
        System.out.println(charFinder.findFirstRepeatingChar("a green apple"));

        //1. Chaining -> add chain to linked list
        //2. Probing -> Linear Probing[hash(key) + i], Quadratic Probing [hash(key) + i]^2 % size
        //Double Hashing ->
        //Hash function1 (key) -> key % size
        //Hash function2 (key) -> prime - (key % prime)

        HashTable hashTable = new HashTable();
        hashTable.put(6,"A");
        hashTable.put(8,"B");
        hashTable.put(11,"C");
        hashTable.put(6,"A+");
        hashTable.remove(8);
        System.out.println(hashTable.get(6));
    }
}
