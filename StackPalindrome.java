import java.util.Stack;

public class StackPalindrome {
    /*
    Input: A string that is a mirror of itself
    Output: A boolean output of True and False
    Process: - Takes a string input, uses a loop to check for each element of the string
             - Use a string builder to store the string with original.
             - print boolean value of true or false
     */
    static Stack<Character> stringSStack = new Stack<>();

    public static void main(String[] args) {
        Boolean isPalindrome = false;
        String original = "rAceCar";
        original = original.toLowerCase();
        push(original);
        if (original.equals(push(original))) {
            isPalindrome = true;
        }
        System.out.println(isPalindrome);
    }

    public static String push(String x) {
        StringBuilder comparitiveString = new StringBuilder();
        char[] charArray = x.toCharArray();
        for (Character testArray : charArray) {
            stringSStack.push(testArray);
        }
        for (Character testArray : charArray) {
            comparitiveString.append(stringSStack.pop());
        }
        String toString= comparitiveString.toString();
        return toString;
    }

}
