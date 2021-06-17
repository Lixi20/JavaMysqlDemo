package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 工具类，获取数据库的连接
 * @author 秦怀
 *
 */
public class DBUtil {
    private static String URL="jdbc:mysql://127.0.0.1:3306/student?characterEncoding=utf-8&serverTimezone=UTC";
    private static String USER="root";
    private static String PASSWROD ="geek";
    private static Connection connection=null;
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 获取数据库连接
            connection=DriverManager.getConnection(URL,USER,PASSWROD);
            System.out.println("连接成功");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    // 返回数据库连接
    public static Connection getConnection(){
        return connection;
    }
}