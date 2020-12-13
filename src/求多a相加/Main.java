package 求多a相加;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int temp = 0;
            for (int i1 = 0; i1 < i; i1++) {
                temp = temp * 10 + a;
            }
            sum += temp;
        }
        System.out.println(sum);
    }
}
