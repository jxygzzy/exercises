package 求圆锥体积泛型;

public class Cone<T> {
    T basal;
    int hight;
    public Cone(T basal) {
        this.basal=basal;
    }

    public void setHeight(int j) {
        this.hight=j;
    }

    public double computerVolume() {
        double r=Double.parseDouble(basal.toString());
        return r*r*Math.PI*hight/3;
    }
}
