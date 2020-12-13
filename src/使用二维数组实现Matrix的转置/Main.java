package 使用二维数组实现Matrix的转置;

import java.util.Scanner;
public class Main {
    //不改变main方法
    public static void main(String[] args) {
        ArrayTransposition trans = new ArrayTransposition();
        int[][] mat=trans.inputMatrix();
        mat = trans.transposition(mat);    //转置数组
        display(mat);//打印转置后数组
    }

    //display方法：打印数组元素到屏幕
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

//补充ArrayTransposition类

/* 请在这里填写答案 */