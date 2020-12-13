package 抽象类的继承;

public class Main {

    public static void main(String[] args) {

        Shape s1=new Circle(3.0);
        Shape s2=new Rec(4.5,7.6);
        System.out.printf("%.3f\n",s1.getArea());
        System.out.printf("%.3f",s2.getArea());

    }

}



/* 请在这里填写答案 */