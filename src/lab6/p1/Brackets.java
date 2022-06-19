package lab6.p1;

import java.util.HashMap;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        String string = "([{}]){}";
        System.out.println(string);
        HashMap<String, Integer> openBrackets = new HashMap<String, Integer>() {{
            put("{", 0);
            put("[", 1);
            put("(", 2);
        }};
        HashMap<String, Integer> closeBrackets = new HashMap<String, Integer>() {{
            put("}", 0);
            put("]", 1);
            put(")", 2);
        }};
        Stack<String> stack = new Stack<String>();
        String result = "correct";

        for (int i = 0; i < string.length(); i++) {
            Character character = string.charAt(i);
            String symbol = character.toString();

            if (openBrackets.containsKey(symbol)) {
                stack.push(symbol);
            } else if (closeBrackets.containsKey(symbol)) {
                if (stack.empty() || !openBrackets.get(stack.pop()).equals(closeBrackets.get(symbol))) {
                    result = "incorrect";
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
