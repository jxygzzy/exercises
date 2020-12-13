package 简单创建对象;

public class Main {
    public static void main(String[] args) {
        Student chen=new Student();
        Student zhang=new Student("Zhang",2018123456);
        chen.setName("Chen");
        chen.setID(2018012345);
        System.out.println(chen.toString());
        System.out.println(zhang.toString());

    }
}

/* 请在这里填写答案 */