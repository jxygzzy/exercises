package 计算长方体的表面积和体积;

import java.util.Scanner;
/* 你的代码将被嵌入到这里 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double l = input.nextDouble();
        double w = input.nextDouble();
        double h = input.nextDouble();
        Cuboid myCuboid = new Cuboid(l, w, h);
        System.out.printf("%.4f",myCuboid.getArea());
        System.out.println();
        System.out.printf("%.4f",myCuboid.getVolume());

        input.close();
    }
}