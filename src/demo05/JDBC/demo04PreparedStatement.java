package demo05.JDBC;

import java.sql.*;
import java.util.Scanner;

public class demo04PreparedStatement {

    // 用Statement 的子接口 PreparedStatement解决 sql 注入隐患
    public static void main(String[] args) {

        // 键盘录入，接收用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        // 调用方法
        boolean flag = login(username,password);
        // 判断结果
        if(flag){
            // 登录成功
            System.out.println("欢迎回来" + username);
        }else {
            System.out.println("用户名或密码错误！");
        }
    }

    // 登录方法
    public static boolean login (String username,String password){

        if(username == null || password == null){
            return false;
        }
        // 连接数据库判断是否登录成功
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        // 获取连接
        try {
            conn = JDBCUtils1.getConnection();
            // 定义 sql
            // 整条sql语句是用多条字符串拼接而成
            String sql = "select * from user where username = ?  and password = ?";
            // 获取执行sql的对象
            pstmt = conn.prepareStatement(sql);
            // 给占位符 ? 赋值
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            //执行查询
            rs = pstmt.executeQuery();
            return rs.next(); // 如果有下一行，则返回 ture
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils1.close(pstmt, conn, rs);
        }
        return false;
    }
}
