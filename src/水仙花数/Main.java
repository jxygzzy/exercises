package 水仙花数;

public class Main {

    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (ComputingSXH.sxhNum(i))
                System.out.print(i + " ");
        }
    }
}