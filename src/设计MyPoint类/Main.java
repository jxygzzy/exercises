package 设计MyPoint类;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        MyPoint P1 = new MyPoint();
        MyPoint P2 = new MyPoint(x,y);
        MyPoint P3 = new MyPoint(x1,y1);

        System.out.printf("%.4f", P1.distance(P2));
        System.out.print("\n");
        System.out.printf("%.4f", MyPoint.distance(P2,P3));

    }

}

/* 请在这里填写答案 */