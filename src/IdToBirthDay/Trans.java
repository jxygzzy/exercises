package IdToBirthDay;

public class Trans {
    public static String idToBirth(String Id){
        String Birthday;
        String year = Id.substring(6, 10);// 截取年
        String month = Id.substring(10, 12);// 截取月份
        String day = Id.substring(12, 14);// 截取天
        Birthday = year+"-"+month+"-"+day;
        return Birthday;
    }
}
