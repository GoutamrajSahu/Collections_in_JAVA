import java.util.HashMap;
import java.util.Map;

public class HashMap_Demo {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        //put() method:-
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);

        System.out.println("After putting Key Value pairs into numbers: "+ numbers);

        System.out.println();

        //containsKey() method:-
        System.out.println("Checking the key \"One\" is in numbers or not: "+ numbers.containsKey("One"));

        System.out.println();

        //putIfAbsent() method:-
        numbers.putIfAbsent("Five", 5);
        numbers.putIfAbsent("Four", 40);
        System.out.println("After using putIfAbsent() for key \"Five\" and \"Four\": "+ numbers);

        System.out.println();

        //getKey(), getValue() and entrySet() methods:
        for(Map.Entry<String, Integer> e: numbers.entrySet()){
            System.out.println(e);
            System.out.println("Key: "+ e.getKey());
            System.out.println("Value: "+ e.getValue());
        }

        System.out.println();

        //keySet() method:
        for(String key: numbers.keySet()){
            System.out.println(key);
        }

        System.out.println();

        //values() method:
        for(Integer value: numbers.values()){
            System.out.println(value);
        }

        System.out.println();

        //remove() method:
        numbers.remove("Four");
        System.out.println(numbers);
    }
}
