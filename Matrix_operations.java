package day2;

public class Matrix_operations {
	public static void main(String[] args) {
      
        int[][] matrixA = {
            {5, 8, 3},
            {1, 2, 7},
            {4, 6, 9}
        };

        int[][] matrixB = {
            {2, 4, 1},
            {3, 0, 5},
            {2, 3, 4}
        };

        System.out.println("Matrix A:");
        printMatrix(matrixA);

        System.out.println("\nMatrix B:");
        printMatrix(matrixB);

        
        int[][] sumMatrix = addMatrices(matrixA, matrixB);
        System.out.println("\nResult of Addition (A + B):");
        printMatrix(sumMatrix);

        int[][] diffMatrix = subtractMatrices(matrixA, matrixB);
        System.out.println("\nResult of Subtraction (A - B):");
        printMatrix(diffMatrix);
    }

  
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j]; 
            }
        }
        return result;
    }


    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

   
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
