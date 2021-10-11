import java.util.Vector;

public class Vector_Demo {
    public static void main(String[] args){
        Vector<Integer> V = new Vector<>();

        //capacity() add() methods:-
        System.out.println("Default capacity of vector: "+ V.capacity());
        V.add(2);
        V.add(1);
        V.add(4);
        V.add(2);
        V.add(3);
        V.add(5);
        V.add(8);
        V.add(8);
        V.add(7);
        V.add(10);
        V.add(5);
        System.out.println("After adding more then 10 elements the capacity is: "+ V.capacity());

        System.out.println("The vector V is: "+ V);

        //size() method:-
        System.out.println("Getting the number of elements present in vector using size() method: "+ V.size());

        //addAll() method:-
        Vector<Integer> newV = new Vector<>();
        newV.add(12);
        newV.add(15);
        newV.add(9);
        V.addAll(newV);
        System.out.println("After appending a new vector(newV) with the old vector(V) using addAll() method: "+ V);

        //contains() & containsAll():-
        System.out.println("Checking 7 is present in the vector or not using contains() method: "+ V.contains(7));
        System.out.println("Checking vector newV elements are present in the vector V or not using containsAll() method: "+ V.containsAll(newV));

        //get() method:-
        System.out.println("Getting the index 4 element using get() method: "+V.get(4));

        //remove() & removeAll():-
        V.removeAll(newV);
        System.out.println("The Vector V After removing newV vector elements form it using removeAll() method: "+ V);
        V.remove(2);
        System.out.println("The vector V After removing the index 2 element using remove() method: "+V);
    }
}
