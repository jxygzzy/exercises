package 分解质因数;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n + "=");
        for (int k = 2; k <= n; k++) {
            while (n % k == 0 && k != n) {
                System.out.print(k + "*");
                n /= k;
            }
            if (n == k) {
                break;
            }
        }
        System.out.println(n);
    }
}