package 多线程打印_继承;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThreadTest mythread;
        mythread = new ThreadTest(sc.nextInt());
        mythread.start();
        sc.close();
    }

}
/* 请在这里填写答案 */

