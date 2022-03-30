package edu.sjsu.assignment2;

import java.util.Arrays;

public class Matrix {
    private int[] [] array;

    public Matrix(int[][] array) {
        this.array = array;
    }
    public int[][] getMatrix(){ return array; }
    public Matrix multiply(Matrix other){
        int m = array.length;
        int n = array[0].length;
        int p = other.array[0].length;
        Matrix result = new Matrix(new int[m][n]);
        for(int row = 0; row < result.array.length; row++){
            for(int col = 0; col < result.array[row].length; col++){
                result.array[row][col] = multiplyMatrixCell(array, other.array,row,col);
            }
        }
        return result;
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
