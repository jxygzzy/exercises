package 请完成父类;




public class Main {
    public static void main(String[] args) {
        Student zs = new Student();
        zs.setId("4700X");
        zs.setName("Zhang San");
        zs.say();
        System.out.println(zs.getId() + " , " + zs.getName());

        Student ls = new Student("330106","Li Si","2018000007",98);
        ls.say();
        System.out.println(ls.getId() + " : " + ls.getName());

        People ww = new Student();
        ww.setName("Wang Wu");
        ww.say();

        People zl = new People("370202", "Zhao Liu");
        zl.say();
    }
}