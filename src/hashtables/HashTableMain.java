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
    }
}
