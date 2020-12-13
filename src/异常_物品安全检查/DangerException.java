package 异常_物品安全检查;

public class DangerException extends  Exception{
    public DangerException() {
        super("属于危险品!");
    }
}
