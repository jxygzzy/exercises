package 使用二维数组实现Matrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row1 = in.nextInt();
        int col1 = in.nextInt();
        Matrix a = new Matrix(row1, col1);
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                a.matrix[i][j]=in.nextInt();
            }
        }
        int row2 = in.nextInt();
        int col2 = in.nextInt();
        Matrix b = new Matrix(row2, col2);
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                b.matrix[i][j]=in.nextInt();
            }
        }
        Matrix c= Matrix.muti(a,b);
        for(int i=0;i<c.row;i++){
            for(int j=0;j<c.column;j++){
                System.out.print(c.matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

