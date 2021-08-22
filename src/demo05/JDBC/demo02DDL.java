package demo05.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo02DDL {

    public static void main(String[] args) {

        Statement stmt = null;
        Connection conn = null;

        try {
            // 1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 定义sql语句
            String sql = "insert into stu1 values(5,'高老庄',87,23)";
            // 3. 获取Connection 对象
            conn = DriverManager.getConnection("jdbc:mysql:///demo01","root","13979505523");
            // 4. 获取执行sql的对象 Statement
            stmt = conn.createStatement();
            // 5. 执行sql
            int count = stmt.executeUpdate(sql);
            // 6. 处理结果
            if(count > 0){
                System.out.println("sql执行成功");
            }else{
                System.out.println("sql执行失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally{
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
