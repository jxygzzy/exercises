package 二维向量定义及加法运算;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TDVector a = new TDVector();  /* 无参构造，向量的x和y默认为0 */
        Scanner sc = new Scanner(System.in);
        double x,y,z;
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        TDVector b = new TDVector(x, y);  /* 按照参数构造向量的x和y */
        TDVector c = new TDVector(b);  /* 按照向量b构造向量 */
        a.setY(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        c.setX(z);
        a = b.add(c);
        System.out.println(a);
        System.out.println("b.x="+b.getX()+" b.y="+b.getY());
        sc.close();
    }
}