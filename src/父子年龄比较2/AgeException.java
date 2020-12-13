package 父子年龄比较2;

public class AgeException extends Throwable{
    private String msg;

    public AgeException(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg ;
    }
}
