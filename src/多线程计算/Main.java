package 多线程计算;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Sum sum = new Sum(m,scanner);
            sum.start();
            try {
                sum.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(sum.sum);
        }
    }
}
