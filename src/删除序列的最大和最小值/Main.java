package 删除序列的最大和最小值;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 1; i < length - 2; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print(arr[length-2]);

    }
}
