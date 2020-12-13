package 十进制转十六进制;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        System.out.println(Integer.toHexString(in).toUpperCase());
    }
}
