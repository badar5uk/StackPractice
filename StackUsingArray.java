import java.util.Stack;

public class StackUsingArray {

    /*
    Input: An Array that gets converted into a stack
    Output: printing stack
    Process: - Create an Array with Integer values
             - use the push(), pop(), peek(), and isEmpty() functions.
             - Example Input: push(10); push(20); push(30); pop(); peek();
               Example Output: 30 // (result of pop) 20 // (result of peek)   */


    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        System.out.println("After push : " + numbers);
        System.out.println("The first element popped: " + numbers.pop());
        System.out.println("The element on top using th peak function: " + numbers.peek());

    }
}
