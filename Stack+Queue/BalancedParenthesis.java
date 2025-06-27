import java.util.*;

public class BalancedParenthesis {
    
    public static boolean isBalanced(String s) {
        Stack<Character> stk = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stk.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stk.isEmpty()) return false;
                char top = stk.pop();
                if ((ch == ')' && top != '(') || 
                    (ch == ']' && top != '[') || 
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stk.isEmpty();
    }

    public static void main(String[] args) {
        String expr = "([{}])";
        if (isBalanced(expr)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
