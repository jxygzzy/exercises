package 多种异常的捕获;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String choice = sc.next();
            try {
                if (choice.equals("number"))
                    throw new NumberFormatException();
                else if (choice.equals("illegal")) {
                    throw new IllegalArgumentException();
                } else if (choice.equals("except")) {
                    throw new Exception();
                } else
                    break;
            }

            /*这里放置你的答案*/
            catch (NumberFormatException e){
                System.out.println("number format exception");
                System.out.println(e);
            }
            catch (IllegalArgumentException e){
                System.out.println("illegal argument exception");
                System.out.println(e);
            }catch (Exception e){
                System.out.println("other exception");
                System.out.println(e);
            }
        }//end while
        sc.close();
    }
}