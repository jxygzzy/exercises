package 华氏度转摄氏度_四舍五入;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int F=scanner.nextInt();
        System.out.println(Math.round(5.0*(F-32)/9));
    }
}

