package 多线程_通信;

public class AddHP implements Runnable{
    Hero hero;

    public AddHP(Hero hero) {
        super();
        this.hero = hero;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            hero.cure(100);
        }
    }
}
