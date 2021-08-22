package demo05.JDBC;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils1 {

    private static String url = "jdbc:mysql:///demo01?useUnicode=true&characterEncoding=UTF-8&userSSL=false&serverTimezone=GMT%2B8";
    private static String user = "root";
    private static String password = "13979505523";
    private static String driver = "com.mysql.cj.jdbc.Driver";

    static {
        //读取资源文件，获取值
        try {
            // 创建 Properties 集合类
            Properties pro = new Properties();
            // 获取 src 路径下文件的方式 ———— ClassLoader 类加载器
            ClassLoader classLoader = JDBCUtils1.class.getClassLoader();
            URL res = classLoader.getResource("JDBC.Properties");
            String path = res.getPath();
            // 加载文件
            pro.load(new FileReader(path));
            // 文件中 url 字符串要根据所连接的数据库不同而进行更改
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 获取数据并赋值

        //注册驱动
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public static void close(Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void close(Statement stmt, Connection conn, ResultSet rs) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        try {
            rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
