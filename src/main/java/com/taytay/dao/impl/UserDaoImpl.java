package com.taytay.dao.impl;

import com.taytay.dao.UserDao;

import com.taytay.pojo.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


public class UserDaoImpl implements UserDao {


    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }
}