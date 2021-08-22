package demo05.JDBC;

// 使用 Druid 工具类演示

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidDemo {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstmt = null;


        try {
            // 获取连接
            conn = JDBCUtils2.getConnection();
            // 定义sql
            String sql = "insert into user values(null,?,?)";
            // 获取 pstmt 对象
            pstmt = conn.prepareStatement(sql);
            // 给 占位符? 赋值
            pstmt.setString(1,"铁头娃");
            pstmt.setDouble(2,135);
            // 执行sql
            int count = pstmt.executeUpdate();
            // 检测执行是否成功
            System.out.println(count);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils2.close(pstmt, conn);
        }
    }
}
