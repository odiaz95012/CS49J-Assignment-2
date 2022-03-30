package edu.sjsu.assignment2;

import java.util.Arrays;

public class Matrix {
    private int[] [] array;

    public Matrix(int[][] array) {
        this.array = array;
    }
    public int[][] getMatrix(){
        // Algorithm from https://stackoverflow.com/questions/20519100/java-how-to-return-in-a-method-multidimensional-array-without-aliasing
            int[][]newArr=new int[this.array.length][this.array[0].length];
            for(int i=0;i<this.array.length;i++)
            {
                for(int j=0;j<this.array[0].length;j++)
                {
                    newArr[i][j]=this.array[i][this.array[0].length-1-j];
                }

            }
            return newArr; // rerunning the array witch created inside this method
    }
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
