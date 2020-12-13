package 请完成父类;

class People{
    protected String id;
    protected String name;

    /** 你提交的代码将被嵌在这里（替换此行） **/
    public People(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public People() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("I'm a person. My name is " + this.name + ".");
    }
}