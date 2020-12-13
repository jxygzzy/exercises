package 自定义异常;

public class Main {
    public static void main(String args[]) {

        try {
            throw new DefaultException("Default Exception");
        } catch (Exception e) {
            System.out.println(e);

        }

    }
}
/* 请在这里填写答案 */