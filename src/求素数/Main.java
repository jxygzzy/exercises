package 求素数;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] pri = new int[n];
        int cnt = 0;
        int flag;

        int i, num;
        for (num = 2; num <= n; num++) {
            flag = 0;
            for (i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                pri[cnt++] = num;
        }
        for (i = 0; i < cnt; i++) {
            if ((i + 1) % 5 != 0) {
                System.out.print(pri[i] + "\t");
            } else {
                System.out.println(pri[i]);
            }
        }
    }
}

