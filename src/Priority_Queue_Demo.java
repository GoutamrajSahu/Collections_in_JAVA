import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue_Demo {
        public static void main(String[] args) {
            PriorityQueue<Integer> PQ = new PriorityQueue<>();
//            PriorityQueue<Integer> PQ = new PriorityQueue<>(Comparator.reverseOrder());  //<--- By using this line we can implement Max Heap, where the first element will be the bigger one.

            //offer() method.
            PQ.offer(40);
            PQ.offer(12);
            PQ.offer(24);
            PQ.offer(36);
            System.out.println("PQ: "+ PQ); // The elements in PQ arranged according to Mean Heap, where the smallest element will be at first.

            //poll() method:
            System.out.println("The element got polled from PQ is: "+ PQ.poll());
            System.out.println("After applying poll() method on PQ: "+ PQ);

            //peek() method:
            System.out.println("Getting the next coming element using peek() method: "+ PQ.peek());
        }
}
