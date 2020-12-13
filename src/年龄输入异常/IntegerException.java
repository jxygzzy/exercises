package 年龄输入异常;

public class IntegerException extends Exception {
    String msg;

    public IntegerException(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return  msg;
    }
}
