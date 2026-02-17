public class java1 {
    public static void main(String[] args) {
        
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        
        int[][] result = new int[3][3];

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

    
        System.out.println("Matrix 1:");
        printMatrix(matrix1);

        
        System.out.println("\nMatrix 2:");
        printMatrix(matrix2);

        
        System.out.println("\nAddition of Matrix 1 and Matrix 2:");
        printMatrix(result);
    }

    
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
