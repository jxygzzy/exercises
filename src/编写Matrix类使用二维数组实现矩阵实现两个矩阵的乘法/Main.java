package 编写Matrix类使用二维数组实现矩阵实现两个矩阵的乘法;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Matrix firstMat=Matrix.inputMatrix();
        Matrix secondMat=Matrix.inputMatrix();
        //display(firstMat.matrix);    display(secondMat.matrix);

        Matrix productMat=firstMat.multiply(secondMat);
        display(productMat.matrix);
    }

    //display方法：打印二维数组元素到屏幕
    public static void display(int[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                if(j==array[i].length-1) {
                    System.out.println(array[i][j]);
                }
                else {
                    System.out.print(array[i][j]+" ");
                }
            }
        }
    }
}

/* 请在这里填写答案 */