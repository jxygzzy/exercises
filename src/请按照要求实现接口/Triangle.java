package 请按照要求实现接口;

public class Triangle implements Ishape{
    double l;
    double w;

    public Triangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    @Override
    public double getArea() {
        return l*w/2;
    }

    @Override
    public double getPerimeter() {
        return l+w+Math.sqrt(l*l+w*w);
    }
}
