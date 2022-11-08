package com.taytay.dao;

import com.taytay.pojo.User;
import java.util.List;
public interface UserDao {
    /**
     * 新增一条用户
     *
     */
    int addUser(User user);
    /**
     * 更新指定的用户信息
     *
     */
    int update(User user);
    /**
     * 删除指定的用户信息
     *
     */
    int delete(int id);
}
