package 请完成父类;

public class Student extends People{
    protected String sid;
    protected int score;
    public Student() {
        name = "CUIT Student";
    }
    public Student(String id, String name, String sid, int score) {
        super(id, name);
        this.sid = sid;
        this.score = score;
    }
    public void say() {
        System.out.println("I'm a student. My name is " + this.name + ".");
    }


}