package 分数计算;

public class Fraction {
    int a;
    int b;

    public Fraction() {
    }

    public Fraction(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public void print() {
        //分数在输出的时候进行化简
        int temp = GCD(this.a, this.b);
        this.a = this.a / temp;
        this.b = this.b / temp;
        if (a == b && a == 1) {
            System.out.println("1");
        } else {
            System.out.print(a + "/" + b + " ");
        }
    }

    public Fraction multiply(Fraction r) {
//      将自己的分数与r的分数相乘并返回值
        Fraction temp = new Fraction((this.a * r.a), (this.b * r.b));
        return temp;
    }

    private int GCD(int a, int b) {
        //辗转相除法求最大公约数
        int temp;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public Fraction plus(Fraction r) {
//      将自己的分数与r的分数相加并返回值
        /*
         * 先通分再相加
         * 求出this.a与r.a之间的最小公倍数
         * 之后this.b*(temp/this.a) + r.b*(temp/r.a)
         * 之后返回
         */
        Fraction temp = new Fraction();
        temp.b = this.b * r.b;
        temp.b = temp.b / GCD(this.b, r.b);
        temp.a = (this.a * (temp.b / this.b) + r.a * (temp.b / r.b));
        return temp;
    }
}
