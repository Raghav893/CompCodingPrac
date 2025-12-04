import java.util.Stack;

public class ReverseStringByStack {

    public static void main(String[] args) {
        String str = "Hello";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String rev ="";
        while (!stack.isEmpty()){
            rev+=stack.pop();
        }
        System.out.println(rev);
    }


}

