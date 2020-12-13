package 结伴出行;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[50];
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            System.out.println(arr[i]+" "+arr[n-1-i]);
        }

    }
}
