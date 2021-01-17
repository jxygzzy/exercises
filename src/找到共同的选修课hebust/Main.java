package 找到共同的选修课hebust;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            int pos = line.indexOf(":");
            String course = line.substring(pos + 1);
            String[] likes = course.split(" ");
            for (int i1 = 0; i1 < likes.length; i1++) {
                if (map.containsKey(likes[i1])) {
                    int value=map.get(likes[i1])+1;
                    map.replace(likes[i1], value);
                } else {
                    map.put(likes[i1], 1);
                }
            }
        }
        boolean has = false;
        for (String key :
                map.keySet()) {
            if (map.get(key) == n) {
                has = true;
                System.out.println(key);
            }
        }
        if (!has) {
            System.out.println("none");
        }

    }
}
