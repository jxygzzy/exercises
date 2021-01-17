package 单词替换;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        String oldChar = scanner.nextLine();
        String newChar = scanner.nextLine();
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldChar)) {
                words[i] = newChar;
            }
            System.out.print(words[i]);
            if(i<words.length-1){
                System.out.print(" ");
            }
        }

    }
}
