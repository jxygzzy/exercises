package 递归实现N的阶乘;

public class Main {

    public static void main(String[] args) {

        int n = 20;
        System.out.print(Factorial(n));

    }

    public static long Factorial(long n) {
        if (n == 0) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }

    }

}