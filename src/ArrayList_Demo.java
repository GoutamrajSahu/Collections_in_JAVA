import java.util.ArrayList;

public class ArrayList_Demo {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        //add() method:-
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(10);
        numbers.add(5);
        System.out.println("After adding elements using add() method: "+numbers);

        //addAll() method:-
        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(11);
        newNumbers.add(15);
        numbers.addAll(newNumbers);
        System.out.println("After applying addAll() method to add another list: "+numbers);

        //get() method:-
        System.out.println("Getting the element of index 3 using get() method, element is: "+numbers.get(3));

        //remove() method:-
        numbers.remove(6);
        System.out.println("After removing index 6 using remove() method: "+ numbers);

        //set() method:-
        numbers.set(6,8);
        System.out.println("After setting index 6 with value 8 using set() method: "+ numbers);

        //contains() method:-
        System.out.println("Checking element 10 is in numbers or not using contains() method, and result is: "+ numbers.contains(10));

        //clear() method:-
        numbers.clear();
        System.out.println("After applying clear() method: "+ numbers);
    }
}
