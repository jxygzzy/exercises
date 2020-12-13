package 异常_圆半径不能为负数;

public class CircleException extends Exception{
    String message;
    public CircleException(double r) {
        message="圆半径为"+r+"不合理";
    }
    public void print() {
        System.out.println(message);
    }
}
