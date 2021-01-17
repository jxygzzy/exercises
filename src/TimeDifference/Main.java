package TimeDifference;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");
        int h1 = Integer.parseInt(data[0]);
        int m1 = Integer.parseInt(data[1]);
        int h2 = Integer.parseInt(data[2]);
        int m2 = Integer.parseInt(data[3]);
        int h = h2 - h1;
        int m;
        if (m2 < m1) {
            h--;
            m = m2 + 60 - m1;
        } else {
            m = m2 - m1;
        }
        System.out.println(h+" "+m);
    }
}
