/*
 * Program          : Matrix Addition
 * Description      : Adds two matrices of the same size.
 * Time Complexity  : O(rows * columns)
 * Space Complexity : O(rows * columns)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class MatrixAddition {

    static void addMatrices(int[][] matrix1, int[][] matrix2) {

        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Result Matrix:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int columns = sc.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        System.out.println("Enter first matrix:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        addMatrices(matrix1, matrix2);

        sc.close();
    }
}