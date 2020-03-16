import java.util.HashMap;
import java.util.Stack;

public class InterviewPrepDay4 {
    public InterviewPrepDay4() {
    }

    public static void main(String[] args) {

//        printPerm("wxyz", "");

//        System.out.print(isValidCode("[{(){}[]}]("));
        CharTreeBuilder.makeXmasTree(8, '*', '|');
    }


    private static boolean isValidCode(String code) {
        Stack<Character> stack = new Stack<Character>();

        HashMap<Character, Character> brackets = new HashMap<Character, Character>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);

            if (brackets.keySet().contains(ch)) {
                stack.push(brackets.get(ch));
            } else if (brackets.containsValue(ch)) {
                if (!stack.isEmpty() && stack.peek().equals(ch))
                    stack.pop();
                else {
                    return false;
                }
            }
        }

        return stack.empty();
    }


}
