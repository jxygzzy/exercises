package 求圆柱的面积和体积;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double l = scanner.nextDouble();
        System.out.println("The area is "+r*r*Math.PI);
        System.out.println("The volume is "+r*r*l*Math.PI);
    }
}
