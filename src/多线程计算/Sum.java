package 多线程计算;

import java.util.Scanner;

public class Sum extends Thread {
    public Scanner scanner;
    public int m;
    public int sum = 0;

    public Sum(int m, Scanner scanner) {
        this.m = m;
        this.scanner = scanner;
    }

    public void run() {
        for (int i = 0; i < m; i++) {
            sum += scanner.nextInt();
        }
    }
}
