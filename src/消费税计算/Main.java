package 消费税计算;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        if (num < 0) System.out.println("Invalid input");
        else System.out.printf("%.2f",num*0.06);
    }
}
