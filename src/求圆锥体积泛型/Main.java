package 求圆锥体积泛型;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        j=sc.nextInt();
        sc.close();
        Circle circle=new Circle(i);
        Cone<Circle> coneOne=new Cone<Circle>(circle);//创建一个（圆）锥对象
        coneOne.setHeight(j);
        System.out.printf("%.2f\n",coneOne.computerVolume());

    }
}
/* 请在这里填写答案 */