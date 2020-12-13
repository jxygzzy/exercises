package 父子年龄比较;

public class AgeException extends Exception {
    String msg;

    public AgeException(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}
