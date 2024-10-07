import java.util.Stack;

public class StackReverseString {

    /*
    Input: Take a string as a stack
    Output: print the string in reverse
    Process: - The stack will print it in another format
     */


    public static void main(String[] args) {
        Stack<Character> simpleString = new Stack<>();
        simpleString.push('h');
        simpleString.push('e');
        simpleString.push('l');
        simpleString.push('l');
        simpleString.push('o');
        StringBuilder builder = new StringBuilder();
        while (simpleString.size() != 0) {
            builder.append(simpleString.pop());
        }
        System.out.println(builder);

    }
}
