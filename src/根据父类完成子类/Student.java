package 根据父类完成子类;

public class Student extends People{
    String sid;
    int score;
    public Student(String id, String name, String sid, int score) {
        super(id, name);
        this.sid = sid;
        this.score = score;
    }

    @Override
    public String toString() {
        return "(Name:"+getName()+"; id:"+getId()+"; sid:"+sid+"; score:"+score+")";
    }
}
