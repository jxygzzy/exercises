package 声明图书类记录图书总册数利用静态变量赋值;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java程序设计", ++Book.BOOKNUM, 34.5);

        Book book2 = new Book("数据结构", ++Book.BOOKNUM, 44.8);

        Book book3 = new Book("C++程序设计", ++Book.BOOKNUM, 35.0);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.print("图书总册数为：" + Book.BOOKNUM);


    }
}
