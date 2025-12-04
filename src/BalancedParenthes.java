import java.util.Stack;

public class BalancedParenthes {

    public static boolean isBalanced(String exp){
        Stack<Character> stack  = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '('|| ch == '{'|| ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return  false;
                char top =stack.pop();
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String exp = "{[()]}";

        if (isBalanced(exp))
            System.out.println("Balanced Expression");
        else
            System.out.println("Not Balanced Expression");
    }
}
