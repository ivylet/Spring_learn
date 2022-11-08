package com.taytay.service;

import com.taytay.pojo.User;

import java.util.List;

public interface UserService {
        /**
         * 新增用户数据
         *
         * @param user
         * @return
         */
        public int addUser(User user);
        /**
         * 更新用户数据
         *
         * @param user
         * @return
         */
        public int updateUser(User user);
        /**
         * 删除用户数据
         *
         * @param id
         * @return
         */
        public int deleteUser(int id);


    }
