package 多线程_通信;

public class Hero {
    private int HP;
    private String Name;
    private boolean heroIsAlive;

    synchronized public void cure(int hp) {
        while (heroIsAlive) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        HP += hp;
        heroIsAlive = true;
        System.out.println(Name + "增加HP" + hp + ",目前状态：HP=" + HP);
        notify();
    }

    synchronized public void hurt(int hp) {
        while (!heroIsAlive) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        HP -= hp;
        if (HP <= 0) {
            HP = 0;
            heroIsAlive = false;
        }

        System.out.println(Name + "减少HP" + hp + ",目前状态：HP=" + HP);
        notify();

    }

    public Hero(int HP, String name, boolean heroIsAlive) {
        this.HP = HP;
        Name = name;
        this.heroIsAlive = heroIsAlive;
    }
}
