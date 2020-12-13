package 一位的十六进制转换为十进制;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Hex = in.nextLine();
        System.out.println(Integer.parseInt(Hex,16));
    }
}
