package 多线程_通信;

public class Main {
    public static void main(String[] args) {
        Hero hero=new Hero(100,"小鲁班",true);

        Thread add=new Thread(new AddHP(hero));
        Thread reducee = new Thread(new ReduceHP(hero));

        add.start();
        reducee.start();
    }
}
