package office文档页码打印;

import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(",");
        String digit = "\\d+";
        String interval = "\\d+-\\d+";
        ArrayList<Integer> End = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (Pattern.matches(digit, data[i])) {
                End.add(Integer.parseInt(data[i]));
            }
            if (Pattern.matches(interval, data[i])) {
                int pos = data[i].indexOf("-");
                int pre = Integer.parseInt(data[i].substring(0, pos));
                int tail = Integer.parseInt(data[i].substring(pos + 1));
                if (pre < tail) {
                    for (int j = pre; j <= tail; j++) {
                        End.add(j);
                    }
                } else {
                    for (int j = tail; j <= pre; j++) {
                        End.add(j);
                    }
                }
            }
        }
        End=new ArrayList<>(new HashSet<>(End));//用HashSet去重
        Collections.sort(End);
        for (int i = 0; i < End.size(); i++) {
            System.out.print(End.get(i));
            if (i < End.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
