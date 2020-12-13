package 数组工具;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int array[]= new int[n];

        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }

        MyArrays.printArray(array);//显示数组的内容
        MyArrays.sortArray(array);    //对数组元素排序
        MyArrays.printArray(array);//显示排序后的结果
        int sum=MyArrays.sumOfArray(array);//数组元素求和
        System.out.println(sum);//显示数组元素的和
        sc.close();

    }

}
/* 请在这里填写答案 */