package 判断一个点是否在圆内;

import java.util.Scanner;

public class Main {
    static int px=0;
    static int py=0;

    public static boolean inCircle(int x, int y, int r) {
        return (px - x) * (px - x) + (py - y) + (py - y) < r * r;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = scanner.nextInt();
        if (inCircle(x, y, r)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
