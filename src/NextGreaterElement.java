import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 25};
        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Step 1: Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Step 2: Pop all smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // Step 3: If stack empty -> no greater element
            if (stack.isEmpty())
                result[i] = -1;
            else
                result[i] = stack.peek(); // top element is next greater

            // Step 4: Push current element into stack
            stack.push(arr[i]);
        }

        // Step 5: Display result
        System.out.println("Next Greater Elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " -> " + result[i]);
        }
    }
}
