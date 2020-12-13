package 请按照要求实现接口;

import java.text.DecimalFormat;

interface Ishape {
    public abstract double getArea();

    public abstract double getPerimeter();
}

/*你写的代码将嵌入到这里*/



public class Main {
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("#.####");
        Ishape r = new Triangle(3.1, 4.2);
        System.out.println(d.format(r.getArea()));
        System.out.println(d.format(r.getPerimeter()));

    }
}
