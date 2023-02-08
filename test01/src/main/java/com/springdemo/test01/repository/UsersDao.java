package com.springdemo.test01.repository;

import com.springdemo.test01.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsersDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void addUser(User user){
        jdbcTemplate.update("insert into Users(id, name, email) VALUES (?,?,?)"
                ,user.getId(),user.getName(),user.getEmail());
    }

    public User getName(int id) {
        String sql = "Select * from users where id = ? ";
        User result = new User();
        List<User> items = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class)
                , new Object[] { id});
        if(items !=null && items.size() > 0) {
            result = items.get(0);
            return result;
        } else {
            return null;
        }
    }


}
