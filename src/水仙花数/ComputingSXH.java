package 水仙花数;

public class ComputingSXH {
    static int a, b, c;

    public static boolean sxhNum(int m) {
        a = (m % 1000) / 100;
        b = (m % 100) / 10;
        c = (m % 10);
        return (a * a * a + b * b * b + c * c * c == m);
    }
}
