package edu.sjsu.assignment2;

import java.util.Arrays;

/**
 * Main Class to run code.
 */
public class Main {

    /**
     * @param args - General main function to test code
     * @throws Exception - throws exception when Matrix multiplication is not possible.
     */
    public static void main(String[] args) throws Exception{
        int [][] array1 = new int[][] {{1,2}, {3,4}};
        int [][] array2 = new int [][] {{5,6,7},{8,9,10}};
        Matrix matrix1 = new Matrix(array1);
        Matrix matrix2 = new Matrix(array2);
        Matrix resultMatrix = matrix1.multiply(matrix2);
        int [][] resultArray = resultMatrix.getMatrix();
        System.out.println(Arrays.deepToString(resultArray));
    }
}
