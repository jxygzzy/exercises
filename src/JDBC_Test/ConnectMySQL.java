package JDBC_Test;

import java.sql.*;

public class ConnectMySQL {
    //设置数据库名称和登录用户信息
    private static String URL="jdbc:mysql://localhost:3306/factory?useUnicode=true&characterEncoding=utf8";
    private static final String USER="root";		//数据库用户
    private static final String PASSWORD="zzy1013.";	//用户root的连接数据库的密码

    private static Connection conn=null;	//与数据库的连接；

    //测试用例
    public static void main(String[] args) {
        try {
            //1.加载MYSQL JDBC驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            //2.获得数据库的连接
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
            //3.1 得到连接conn后，获取可执行sql语句的Statement对象
            Statement stmt = conn.createStatement();
            //3.2 使用Statement对象执行查询数据库的SQL语句，返回一个结果集(ResultSet)对象。
            ResultSet rs = stmt.executeQuery("select * from person");

            //4. 操作结果集rs
            while(rs.next()){//如果对象中有数据，就会循环打印出来
                System.out.print(rs.getString("id")+",	");
                System.out.print(rs.getString("name")+",	");
                System.out.print(rs.getString("password")+",	");
                System.out.print(rs.getDate("birthday")+",");
                System.out.println();
            }

            ResultSetMetaData metadata=rs.getMetaData();    
            System.out.println("结果集行数："+metadata.getColumnCount());
            System.out.println("结果集列数："+metadata.getColumnName(1));

            //5. 关闭数据库连接
            conn.close();

        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}