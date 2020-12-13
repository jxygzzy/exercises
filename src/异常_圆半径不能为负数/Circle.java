package 异常_圆半径不能为负数;

public class Circle {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double area() throws CircleException{
        if(r<0){
            throw new CircleException(r);
        }
        else{
            return (double) Math.round(r*r*3.14*1000)/1000;
        }
    }
}
