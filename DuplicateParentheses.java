import java.util.Stack;

public class DuplicateParentheses {

    /*
    Given a string of parentheses, check if it contains any duplicate parentheses.
    For example, in the string "((a+b))", the parentheses around "a+b" are duplicated.
Example Input: "((a+b)+(c+d))"

Example Output: false

Example Input: "((a+b))"

Example Output: true
     */
    static Stack<Character> stringStack = new Stack<>();

    public static void main(String[] args) {
        StringBuilder comparitiveString = new StringBuilder();
        Boolean checker = false;
        String str = "((a+b))";
        char[] toCharArray = str.toCharArray();
        for (Character arraypush : toCharArray) {
            stringStack.push(arraypush);
        }
        for (Character testArray : toCharArray) {
            comparitiveString.append(stringStack.pop());
        }
        String toString = comparitiveString.toString();
        if (toString.contains("((") && toString.contains("))")) {
            checker = true;
        }
        System.out.println(checker);
    }
}
