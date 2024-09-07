import java.util.Stack;
public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }

                char top = stack.peek();
                if ((top == '(' && c == ')') || (top == '[' && c == ']') || (top == '{' && c == '}')) {
                    stack.pop();
                } else return false;
            }
        }
        if (!stack.empty()) {
            return false;
        }
        return true;
    }
}
