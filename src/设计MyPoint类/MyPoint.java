package 设计MyPoint类;

public class MyPoint {
    double x;
    double y;

    public MyPoint() {
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(MyPoint p2, MyPoint p3) {
        return Math.sqrt(Math.pow(p2.x-p3.x,2)+Math.pow(p2.y-p3.y,2));
    }

    public double distance(MyPoint p2) {
        return Math.sqrt(Math.pow(p2.x-x,2)+Math.pow(p2.y-y,2));
    }
}
