package 多线程打印_接口;

public class MyThread implements Runnable{
    int n;
    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
    }

    public MyThread(int n) {
        this.n = n;
    }
}
