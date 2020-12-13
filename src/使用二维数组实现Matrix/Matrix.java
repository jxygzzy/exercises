package 使用二维数组实现Matrix;

public class Matrix {
    int[][] matrix;
    int row;
    int column;

    public static Matrix muti(Matrix a, Matrix b) {
        Matrix c = new Matrix(a.row, b.column);
        for (int i = 0; i < a.row; i++) {
            for (int j = 0; j < b.column; j++) {
                int temp = 0;
                for (int k = 0; k < b.row; k++) {
                    temp += a.matrix[i][k] * b.matrix[k][j];
                }
                c.matrix[i][j]=temp;
            }
        }
        return c;
    }

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.matrix=new int[row][column];
    }
}