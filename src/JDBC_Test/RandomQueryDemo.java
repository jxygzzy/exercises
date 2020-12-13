package JDBC_Test;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class RandomQueryDemo {
    //设置数据库参数
    private static String driver = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/factory?useUnicode=true&characterEncoding=utf8";
    private static final String USER = "root";        //数据库用户
    private static final String PASSWORD = "zzy1013.";    //用户root的连接数据库的密码
    String tableName = "person";                //数据表名

    int randomNumber;                        //随机输出的记录数
    ArrayList<StringBuffer> queryResult;        //查询结果

    Connection con;
    Statement statement;
    ResultSet rs;

    public RandomQueryDemo() {
        super();
        connectDB();
    }

    public void connectDB() {
        try {
            //1.加载数据库驱动程序
            Class.forName(driver);

            //2.获得数据库的连接
            con = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);

            //3.得到连接con后，获取Statement对象，该对象执行查询可以得到可滚动结果集
//            statement=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
//            statement=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);


            //4. Statement对象执行查询数据库的SQL语句，返回一个可滚动结果集对象
            rs = statement.executeQuery("SELECT * FROM " + tableName);

        } catch (ClassNotFoundException e) {
            System.out.print(e);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //关闭数据库连接
    public void closeConnection() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("数据库连接关闭出错..");
            }
        }
    }

    //遍历结果集
    public void traverseResultSet() {
        try {
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String password = rs.getString("password");
                Date date = rs.getDate("birthday");
                System.out.print(id + ", " + name + ", " + password + ", " + date.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //输出结果集中指定行
    public void outputOneRow(int row) {
        try {
            String id = rs.getString("id");
            String name = rs.getString("name");
            String password = rs.getString("password");
            Date date = rs.getDate("birthday");
            System.out.print(id + ", " + name + ", " + password + ", " + date.toString());
            System.out.println();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //随机移动游标
    public void accessScorllResult() {
        try {
            //将游标移到第一行之前
            rs.beforeFirst();
            int row = rs.getRow();    //得到行数
            System.out.println("第一行之前为" + row + "行：");

            //将游标移到最后一行之后
            rs.afterLast();
            row = rs.getRow();    //得到行数
            System.out.println("最后一行之后为" + row + "行：");

            //将游标移到第一行
            rs.first();
            row = rs.getRow();    //得到行数
            System.out.print("第" + row + "行：");
            this.outputOneRow(row);

            //将游标移到最后一行
            rs.last();
            row = rs.getRow();    //得到结果集总行数
            System.out.print("第" + row + "行：");
            this.outputOneRow(row);

            //将游标移到第2行
            row = 2;
            rs.absolute(row);
            System.out.print("第" + row + "行：");
            this.outputOneRow(row);

            //将游标移到某一指定行
            int index = (int) (Math.random() * row);        //[0,1)*行数，选取一个随机行数
            rs.absolute(index);                     //游标移到第index行
            System.out.print("随机行，第" + index + "行：");
            if (index != 0)
                this.outputOneRow(row);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //通过updatable结果集修改数据库的表
    public void resultUpdateDB() {
        try {
            //将游标移到第一行之前
            rs.beforeFirst();
            int temp = 1;
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String password = rs.getString("password");
                Date date = rs.getDate("birthday");

                //通过updatable结果集修改数据库的表
                rs.updateString(1, "00" + (temp++));
                rs.updateString(1, id + "_CUIT");
                rs.updateString("password", "000000");
                rs.updateRow();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        RandomQueryDemo demo = new RandomQueryDemo();
        demo.accessScorllResult();

        System.out.println("\n\n----------------------update分割线-----------------------");

        demo.resultUpdateDB();
        demo.accessScorllResult();

        demo.closeConnection();
    }
}