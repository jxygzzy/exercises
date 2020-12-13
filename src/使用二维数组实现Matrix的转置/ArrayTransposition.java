package 使用二维数组实现Matrix的转置;

import java.util.Scanner;

public class ArrayTransposition {
    public int[][] inputMatrix() {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int colnum = in.nextInt();
        int[][] arr = new int[row][colnum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colnum; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        return arr;
    }

    public int[][] transposition(int[][] mat) {
        int[][] res = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                res[j][i]=mat[i][j];
            }
        }
        return res;
    }
}