package demo05.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class demo01 {
    public static void main(String[] args) throws Exception {

        // 注册驱动
        Class.forName("com.mysql.jdbc.Driver"); // MySQL5之后的驱动jar包可省略注册步骤
        // 获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo01","root","13979505523");
        // 定义sql语句
        String sql = "update stu1 set name = '潘叔' , score = 10 , age = 25 where id = 4";
        // 获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();
        // 执行sql
        int count = stmt.executeUpdate(sql);
        // 处理结果
        System.out.println(count);
        // 释放资源
        stmt.close();
        conn.close();
    }
}
