package demo06.JDBCTemplate;

import demo05.JDBC.JDBCUtils2;
import org.springframework.jdbc.core.JdbcTemplate;

public class demo01jdbcTemplate {

    public static void main(String[] args) {

        // 导入jar包
        // 创建 JDBCTemplate 对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils2.getDataSource());
        // 定义sql语言
        String sql = "update user set password = '361' where id = ?";
        // 调用方法
        int conut = template.update(sql,4);
        // 检测执行结果
        System.out.println(conut);
    }
}
