package 抽象类的继承;

public class Circle extends Shape{
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double getArea() {
        return r*r*Math.PI;
    }
}
