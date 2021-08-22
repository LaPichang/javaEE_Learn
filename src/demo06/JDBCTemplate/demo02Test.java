package demo06.JDBCTemplate;

import demo05.JDBC.JDBCUtils2;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class demo02Test {

    JdbcTemplate template = new JdbcTemplate(JDBCUtils2.getDataSource());
    String sql = null;

    @Test // 修改数据
    public void test1() {
        // 定义sql
        sql = "update user set password = 520 where id = 4";
        // 执行sql
        template.update(sql);
    }

    @Test // 插入数据
    public void test2(){
        sql = "insert into user (id,username,password) values(?,?,?)";
        template.update(sql,5,"王八羔子",521);
    }

    @Test // 查询数据（一次一条数据）
    public void test3(){
        sql = "select * from user where id = ?";
        Map<String, Object> map = template.queryForMap(sql, 1);
        System.out.println(map);
    }

    @Test // 查询数据（一次多条数据）
    public void test4(){
        sql = "select * from user";
        List<Map<String, Object>> mapList = template.queryForList(sql);
        for (Map<String, Object> stringObjectMap : mapList) {
            System.out.println(stringObjectMap);
        }
    }

    @Test // 查询数据（一次多条数据）
    public void test5_1(){
        sql = "select * from user";
        List<Emp> list = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet rs, int i) throws SQLException {
                Emp emp = new Emp();

                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");

                emp.setId(id);
                emp.setUsername(username);
                emp.setPassword(password);

                return emp;
            }
        });
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    @Test // 查询数据（一次多条数据）[用提供的工具类完成简写优化]
    public void test5_2(){
        sql = "select * from user";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    @Test // 查询总记录数
    public void test6(){
        sql = "select count(id) from user";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }
}
