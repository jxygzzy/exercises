package 多线程打印_继承;

public class ThreadTest extends Thread{
    int n;

    public ThreadTest(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
    }
}
