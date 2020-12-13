package 超市奖票兑换;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[k] == a[i] + 2 && a[j] == a[i] + 1 && a[i] != 0) {
                        count++;
                        a[i] = 0;
                        a[k] = 0;
                        a[j] = 0;
                    }
                }
            }

        }
        System.out.print(count);
    }
}

