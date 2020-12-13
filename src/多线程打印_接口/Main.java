package 多线程打印_接口;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyThread mythread=new MyThread(sc.nextInt());
        Thread threadone;
        threadone = new Thread(mythread);
        threadone.start();
        sc.close();
    }
}
/* 请在这里填写答案 */