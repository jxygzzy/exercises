package 二维向量定义及加法运算;

public class TDVector {
    private double x;
    private double y;

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    /**
     * 你所提交的代码将被嵌在这里（替换此行）
     **/
    public TDVector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public TDVector(TDVector b) {
        x = b.x;
        y = b.y;
    }

    public TDVector() {
        x = 0;
        y = 0;
    }

    public void setY(double z) {
        y = z;
    }

    public void setX(double z) {
        x = z;
    }

    public TDVector add(TDVector c) {
        return new TDVector(x + c.x, y + c.y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
