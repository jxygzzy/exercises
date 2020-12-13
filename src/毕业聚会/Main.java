package 毕业聚会;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int sum = 0;
        int flag = 0;
        while (sum < 100) {//写<=也不影响测试点正确 测试点没有测这个位置 个人认为就是小于 当sum=99时 sum++为100,此时就是第100年 如果此时不能输出sum,那就应该输出so bad！
            sum++;
            x += 1;
            y += 1;
            z += 1;
            if (x > 9) x = x % 10;
            if (y > 9) y = y % 10;
            if (z > 9) z = z % 10;
            if (x % 3 == 0 && z % 3 == 0 && y % 3 == 0 && x != z && x != y && y != z && x != 0 && y != 0 && z != 0) {//注意判断 三者不相同且都可以被三整除 且不为零
                System.out.println(sum);
                flag = 1;
                break;
            }
        }
        if (flag == 0) System.out.println("so sad!");
    }
}
