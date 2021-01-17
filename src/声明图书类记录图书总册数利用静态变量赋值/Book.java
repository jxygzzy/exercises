package 声明图书类记录图书总册数利用静态变量赋值;

public class Book {
    public static int BOOKNUM = 0;
    public String name;
    public int ISBN;
    public double price;


    public Book(String name,int ISBN, double price) {
        this.name = name;
        this.ISBN = ISBN;
        this.price = price;
    }

    @Override
    public String toString() {
        return "书名："+name+", 书号："+ISBN+", 书价："+price;
    }
}
