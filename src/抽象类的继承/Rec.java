package 抽象类的继承;

public class Rec extends Shape {
    double l;
    double w;

    public Rec(double l, double w) {
        this.l = l;
        this.w = w;
    }

    @Override
    double getArea() {
        return l * w;
    }
}
