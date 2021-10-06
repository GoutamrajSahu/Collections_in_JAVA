import java.util.HashSet;

public class HashSet_Demo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //add() method:
        set.add(1);
        set.add(20);
        set.add(10);
        set.add(5);
        System.out.println("After adding elements to set: "+ set);

        //.remove() method:
        set.remove(20);
        System.out.println("After removing 20 from the set using remove() method: "+ set);

        //contains() method:
        System.out.println("Checking 10 is there or not using contains() method: "+ set.contains(10));

        //clear() method:
        set.clear();
        System.out.println("After applying clear() method to set: "+ set);

        //isEmpty() method:
        System.out.println("Checking set is empty or not: "+ set.isEmpty());
    }
}
