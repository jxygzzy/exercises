package 冒泡算法打出中间过程;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < 8; i++) {
//            int flag = 0;
            for (int j = 1; j < 8 - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
//                    flag = 1;
                }
            }
//            if (flag == 1)
            if (i < 7)
                printTools.PrintArray(arr);
        }
    }
}

class printTools {
    static int n;

    public static void PrintArray(int a[]) {
        n = a.length;
        for (int i = 0; i <= a.length - 1; i++) {
            if (i == 0) {
                System.out.print(a[i]);
            } else {
                System.out.print(" " + a[i]);
            }
        }
        System.out.println();
    }
}