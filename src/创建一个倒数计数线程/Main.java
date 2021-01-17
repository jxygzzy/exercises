package 创建一个倒数计数线程;

import java.util.Scanner;

public class Main implements Runnable {
    int n;

    public Main(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = n; i >= 0; i--) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main(scanner.nextInt());
        main.run();
    }


}
