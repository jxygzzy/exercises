package 选择排序;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[8];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            int min = i;
            for (int j = i; j < 8; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
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