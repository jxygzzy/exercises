package 自定义异常;

public class DefaultException extends Exception {
    String msg;

    public DefaultException(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "DefaultException: " +
                msg;
    }
}
