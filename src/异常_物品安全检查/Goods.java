package 异常_物品安全检查;

public class Goods {
    private String name;
    private boolean isDanger;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDanger() {
        return isDanger;
    }

    public void setDanger(boolean danger) {
        isDanger = danger;
    }
}
