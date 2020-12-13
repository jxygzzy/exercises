package 编写Matrix类使用二维数组实现矩阵实现两个矩阵的乘法;

import java.util.Scanner;

public  class Matrix {
    int row;
    int column;
    public int[][] matrix;
    static Scanner in = new Scanner(System.in);

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.matrix = new int[row][column];
    }

    public static Matrix inputMatrix() {

        int row =in.nextInt();
        int column = in.nextInt();
        Matrix mat = new Matrix(row, column);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat.matrix[i][j] = in.nextInt();
            }
        }
        return mat;
    }


    public Matrix multiply(Matrix secondMat) {
        Matrix res = new Matrix(this.row, secondMat.column);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < secondMat.column; j++) {
                int temp = 0;
                for (int k = 0; k < secondMat.row; k++) {
                    temp += this.matrix[i][k] * secondMat.matrix[k][j];
                }
                res.matrix[i][j] = temp;
            }
        }
        return res;
    }
}