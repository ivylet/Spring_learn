package com.taytay.service.impl;
import com.taytay.dao.UserDao;
import com.taytay.pojo.User;
import com.taytay.dao.impl.UserDaoImpl;
import com.taytay.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
    @Override
    public int updateUser(User user) {
        return userDao.update(user);
    }
    @Override
    public int deleteUser(int id) {
        return this.userDao.delete(id);
    }

}
