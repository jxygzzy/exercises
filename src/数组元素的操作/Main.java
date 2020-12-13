package 数组元素的操作;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = i;
        }
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        for (int i = index; i < 19; i++) {
            arr[i] = arr[i + 1];
        }
        arr[19] = 0;
        System.out.print("[");
        for (int i = 0; i < 20; i++) {
            System.out.print(arr[i]);

            if(i!=19) System.out.print(", ");
        }
        System.out.print("]");
    }
}
