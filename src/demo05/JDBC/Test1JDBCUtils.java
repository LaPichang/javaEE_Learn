package demo05.JDBC;

// JDBC 工具类

import java.sql.*;

public class Test1JDBCUtils {

    public static void main(String[] args) {

        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;

        try {
            // 获取Connection 对象(调用JDBCUtils类方法)
            conn = JDBCUtils1.getConnection();
            // 定义 sql 语句
            String sql = "select * from stu1";
            // 获取执行sql的对象 Statement
            stmt = conn.createStatement();
            // 执行sql
            rs = stmt.executeQuery(sql);
            // 处理结果
            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                double score = rs.getDouble(3);
                int age = rs.getInt(4);

                System.out.println(id + "---" + name + "---" + score + "---" + age);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils1.close(stmt, conn, rs);
        }
    }
}
