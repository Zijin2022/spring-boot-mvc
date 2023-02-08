package com.springdemo.test01.service;

import com.springdemo.test01.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springdemo.test01.repository.UsersDao;

@Service
public class UserService {
    @Autowired
    UsersDao usersDao;


    public void addUser(User user){
        usersDao.addUser(user);
    }

    public User getName(int id){
        User result = new User();
        result = usersDao.getName(id);
        return result;
    }
}
