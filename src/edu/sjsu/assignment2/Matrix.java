package edu.sjsu.assignment2;

import javax.swing.*;
import java.security.InvalidParameterException;
import java.util.Arrays;

public class Matrix {
    private int[] [] array;

    public Matrix(int[][] array) {
        this.array = array;
    }
    public int[][] getMatrix(){ return array; }
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
    private static int multiplyMatrixCell(int[][] firstMatrix, int[][] secondMatrix, int row, int col){
        //NOTE: algorithm from https://www.baeldung.com/java-matrix-multiplication
        int currentCell = 0;
        for(int i = 0; i < secondMatrix.length; i++ ){
            currentCell += firstMatrix[row][i] * secondMatrix[i][col];
        }
        return currentCell;
    }
}
