package demo05.JDBC;

import java.sql.*;

public class demo03ResultSet {

    public static void main(String[] args) {

        Statement stmt = null;
        Connection conn = null;
        ResultSet re = null;

        /**
         * jar包新版本需用新的写法
         * 注册驱动
         * Class.forName("com.mysql.cj.jdbc.Driver");
         * 获取 Connection 对象中 url 参数
         * jdbc:mysql:///demo01?useUnicode=true&characterEncoding=UTF-8&userSSL=false&serverTimezone=GMT%2B8
         *
         * 也可以在数据库中改变数据库时区
         * SET GLOBAL time_zone = '+8:00';
         */
        try {
            // 1. 注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 获取Connection 对象
            conn = DriverManager.getConnection("jdbc:mysql:///demo01?useUnicode=true&characterEncoding=UTF-8&userSSL=false&serverTimezone=GMT%2B8","root","13979505523");
            // 3. 定义sql语句
            String sql = "select * from stu1";
            // 4. 获取执行sql的对象 Statement
            stmt = conn.createStatement();
            // 5. 执行sql
            re = stmt.executeQuery(sql);
            // 6. 处理结果
            while(re.next()){
                int id = re.getInt(1);
                String name = re.getString(2);
                double score = re.getDouble(3);
                int age = re.getInt(4);

                System.out.println(id + "---" + name + "---" + score + "---" + age);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally{
            try {
                re.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
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
