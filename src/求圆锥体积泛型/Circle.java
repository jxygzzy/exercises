package 求圆锥体积泛型;

public class Circle {
    public double getR() {
        return r;
    }

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return ""+r;
    }
}
