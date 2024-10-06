import java.util.Stack;


public class IsEmptyStack {

    public static void main(String[] args){
        Stack<Integer> input =  new Stack<>();
        input.push(1);
        input.pop();
        System.out.println("Is the stack empty: " + input.isEmpty());
    }
}