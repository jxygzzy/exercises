package 接口四则计算器;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(new Add().computer(a,b));
        System.out.println(new Sub().computer(a,b));
    }
}
