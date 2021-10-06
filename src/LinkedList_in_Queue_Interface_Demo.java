import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_in_Queue_Interface_Demo {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();

        //offer() method:-
        queue.offer(4);
        queue.offer(3);
        queue.offer(5);
        queue.offer(7);
        System.out.println("After adding element using offer() method inside queue: "+ queue);

        //poll() method:-
        queue.poll();
        System.out.println("After polling out an element from the queue using poll() method: "+ queue);

        //peek() method:-
        System.out.println("Peeking the element which will going to come out next from the queue using peek() method: "+ queue.peek());
    }
}
