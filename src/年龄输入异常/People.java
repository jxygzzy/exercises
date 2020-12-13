package 年龄输入异常;

public class People {
    private int age = 1;

    public void setAge(int age) throws IntegerException {


        /* 请在这里填写答案 */
        if(age<0){
            throw new IntegerException("illegal input");
        }else if(age>120){
            throw new IntegerException("too old");
        }else {
            this.age=age;
        }

    }

    public int getAge() {
        return age;
    }
}