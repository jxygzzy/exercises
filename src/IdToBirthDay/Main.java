package IdToBirthDay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String inTxt=in.nextLine();
        String res = Fileread.readFile("D:\\Desktop\\"+inTxt);
        Fileread.createFile("D:\\Desktop\\birth_"+inTxt);
        Fileread.writeFileOverlay("D:\\Desktop\\birth_"+inTxt,res);
    }
}
