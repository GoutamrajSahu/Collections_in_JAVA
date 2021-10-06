import java.util.ArrayDeque;

public class ArrayDeque_Demo {
    public static void main(String[] args) {
        ArrayDeque adq = new ArrayDeque<>();

        //offer() method:
        adq.offer(23);

        //offerFirst() method:
        adq.offerFirst(12);

        //offerLast() method:
        adq.offerLast(45);

        adq.offer(10);

        System.out.println("After adding elements using offer(), offerFirst(), offerLast() methods in adq: "+ adq);

        //peek() method:
        System.out.println("Using peek() method we will get: "+ adq.peek());
        //peekFirst():
        System.out.println("Using peekFirst() method we will get: "+ adq.peekFirst());
        //peekLast():
        System.out.println("Using peekLast() method we will get: "+ adq.peekLast());

        System.out.println();

        //poll() method:
        adq.poll();
        System.out.println("After using poll() method: "+ adq);
        adq.pollFirst();
        System.out.println("After using pollFirst() method: "+adq);
        adq.pollLast();
        System.out.println("After using pollLast() method: "+adq);
    }
}
