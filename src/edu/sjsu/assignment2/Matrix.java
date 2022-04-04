package edu.sjsu.assignment2;

import javax.swing.*;
import java.security.InvalidParameterException;
import java.util.Arrays;

/**
 * This class has the ability to create 2D matrices, multiply matrices, and return a matrix.
 */
public class Matrix {
    private int[] [] array;

    /**
     * @param array - a 2D-array
     * Constructs a matrix with the given 2D-array.
     */
    public Matrix(int[][] array) {
        this.array = array;
    }

    /**
     * @return array - a 2D-array
     * Returns a 2D-array
     */
    public int[][] getMatrix(){ return array; }

    /**
     * @param other - takes in a Matrix object
     * @return Matrix - returns the result Matrix of Matrix A * Matrix B
     * @throws Exception - throws an exception when multiplication of inputted matrices is not possible.
     */
    public Matrix multiply(Matrix other)throws Exception{
        //multiplies a m x n matrix by a n x p matrix
        int m = array.length;
        int n = array[0].length;
        int p = other.array[0].length;

        if (other.array.length != n){
            Exception InvalidParameterException = null;
            throw  InvalidParameterException;
        }

        int [][] result = new int[m][p];
        for(int row = 0; row <= m - 1; row++){
            for(int col = 0; col <=  p - 1 ; col++){
                for (int k = 0; k <=  n - 1; k ++){
                    result[row][col] = multiplyMatrixCell(array, other.array, row, col);
                }

            }
        }
        return new Matrix(result);
    }

    /**
     * This function is a helper function to get the value of each cell in the result Matrix.
     * @param firstMatrix - Matrix A that's being multiplied.
     * @param secondMatrix - Matrix B that is being multiplied.
     * @param row - the current row we're on.
     * @param col - the current column we're on.
     * @return currentCell - returns the value of the current cell after multiplication is complete.
     */
    private static int multiplyMatrixCell(int[][] firstMatrix, int[][] secondMatrix, int row, int col){
        //NOTE: algorithm from https://www.baeldung.com/java-matrix-multiplication
        int currentCell = 0;
        for(int i = 0; i < secondMatrix.length; i++ ){
            currentCell += firstMatrix[row][i] * secondMatrix[i][col];
        }
        return currentCell;
    }
}
