public class RotateArrayByKstepsClock {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = arr.length;

        k = k % n;  // In case k > n

        // Step 1: Reverse whole array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(arr, k, n - 1);

        // Print rotated array
        System.out.println("Array after rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Function to reverse array from index start to end
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
