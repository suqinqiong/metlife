package com.objcom.metlife.service;

import com.objcom.metlife.dto.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    /***
     * 查询所有
     * @return list
     */
    List<User> findAll();

    /**
     * 查询一个用户
     * @param id id
     * @return user
     */
    User findById(Integer id);

    /**
     * 增加一个用户
     * @param user user
     */
    void save(User user);

    /**
     * 更新
     * @param user user
     */
    void update(User user);

    /**
     * 删除一个用户
     * @param id id
     */
    void deleteById(Integer id);
}
