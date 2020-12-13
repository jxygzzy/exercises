package 计算一到十阶乘的值;

public class Main {
    public static void main(String args[]) {
        int i, j, temp;
        int sum = 0;
        for (i = 1; i <= 10; i++) {
            temp=1;

            for (j = 1; j <= i; j++) {

                temp*=j;

            }

            sum+=temp;
        }
        System.out.println(sum);

    }
}