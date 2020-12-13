package 多线程_通信;

public class ReduceHP implements Runnable{
    Hero hero;

    public ReduceHP(Hero hero) {
        super();
        this.hero = hero;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            hero.hurt(100);
        }

    }
}
