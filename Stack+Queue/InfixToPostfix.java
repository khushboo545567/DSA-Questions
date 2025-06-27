import java.util.*;

public class InfixToPostfix{
    static int precedence(char ch){
        switch(ch){
            case'+':case'-': return 1;
            case '*' :case '/' : return 2;
            case '^' :return 3;
            default : return -1;
        }
    }
    public static String infixPostfix(String s){

    Stack<Character> stack = new Stack<>();
    StringBuilder ans = new StringBuilder();
    int i = 0;

        int n = s.length();

        while(i<n){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ans.append(ch);
            }
            else if(ch == '('){
                stack.push(ch);
            }
            else if(ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    ans.append(stack.pop());
                }
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
                else{
                    return "invalid expression";
                }
            }
            // operator
            else{
                while (!stack.isEmpty() && 
       (precedence(ch) < precedence(stack.peek()) || 
       (ch != '^' && precedence(ch) == precedence(stack.peek())))) {
    ans.append(stack.pop());
}
                stack.push(ch);
            }
            i++;
        }

        // pop remaining operators
        while(!stack.isEmpty()){
            if(stack.peek() == '('){
                return "invalid character";
            }
            ans.append(stack.pop());
        }
        return ans.toString();
        
    }
    public static void main(String[]args){
        String infix = "A+(B*C-(D/E^F)*G)*H";
        String postfix = infixPostfix(infix);
        System.out.println("Postfix: " + postfix);
    }
}