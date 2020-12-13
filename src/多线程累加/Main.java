package 多线程累加;


public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 91; i += 10) {
            Thread_test t = new Thread_test(i);
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Total is " + Thread_test.sum);
    }
}