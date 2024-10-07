
import java.util.ArrayList;


public class StackUsingArray {

    /*
    Input: An Array that gets converted into a stack
    Output: printing stack
    Process: - Create an Array with Integer values
             - use the push(), pop(), peek(), and isEmpty() functions.
             - Example Input: push(10); push(20); push(30); pop(); peek();
               Example Output: 30 // (result of pop) 20 // (result of peek)   */

   static ArrayList<Integer> numbers = new ArrayList<>();
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        System.out.println("After push : " + numbers);
        //pop();
        peek();

    }
    public static void push(Integer n){
        numbers.addFirst(n);
    }
    public static void pop(){
        Integer x = numbers.getFirst();
        numbers.remove(0);
        System.out.println("Popped Element: " + x);
    }

    public static void peek(){
        Integer x = numbers.getFirst();
        System.out.println("The element on top is : "+ x);
    }
}
