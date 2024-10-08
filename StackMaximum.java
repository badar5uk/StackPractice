import java.util.Stack;

public class StackMaximum {
    /*
Implement a stack that supports the following two operations:

push(x) — Push element x onto the stack.

max() — Retrieve the maximum element in the stack at any given time.

Example Input: push(2); push(1); push(5); max();

Example Output: 5  // (maximum element is 5)
     */
   static Stack<Integer> numbers = new Stack<>();
    public static void main(String[]args){
        push(5);
        push(3);
        push(900);
        push(6);
        push(10);
        System.out.println("The Maximum element from the stack is: " + max());
    }
    public static void push(Integer n){
        numbers.addElement(n);
    }
    public static Integer max(){
        Integer max = 0;
        Object[] array = numbers.toArray();
        for (Integer x = 0; x< array.length; x++){
            if(numbers.get(x) > max){
                max = numbers.get(x);
            }
        }
        return max;
    }
}

