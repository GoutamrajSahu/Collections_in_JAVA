
import java.util.Stack;
public class Stack_Demo {
    public static void main(String[] args){
     Stack<String> animals = new Stack<>();

     //push() method:-
     animals.push("Lion");
     animals.push("Dog");
     animals.push("Horse");
     animals.push("Cat");
     System.out.println("After pushing or adding elements to animals stack using push() method: "+ animals);

     //peek() method:-
     System.out.println("Getting the top or last added element of the stack using peek() method: "+ animals.peek());

     //pop() method:-
     animals.pop();
     System.out.println("After popping or removing the top element from stack using pop() method: "+ animals);
    }
}
