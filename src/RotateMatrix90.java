public class RotateMatrix90 {
    public static void main(String[] args) {
        int [][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = matrix.length;
        //Transpose of matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp =matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] =temp;

            }
        }
        //swap elements from both the end
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
        // Step 3: Print the rotated matrix
        System.out.println("Matrix after 90° clockwise rotation:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


