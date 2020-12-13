package 异常_物品安全检查;

public class Machine {
    public void checkBag(Goods goods) throws DangerException{
        if(goods.isDanger()){
            throw new DangerException();
        }
    }
}
