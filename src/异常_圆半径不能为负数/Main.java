package 异常_圆半径不能为负数;

public class Main {
    public static void main(String args[]) {
        double s=0;
        Circle c1=new Circle(3.5);
        Circle c2=new Circle(-3.5);
        try{
            s = c1.area();
            System.out.println(s);
            s = c2.area();
            System.out.println(s);
        }
        catch (CircleException e){
            e.print();
        }

    }
}

/* 请在这里填写答案 */