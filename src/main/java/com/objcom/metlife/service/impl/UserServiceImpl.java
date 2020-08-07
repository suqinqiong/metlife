package com.objcom.metlife.service.impl;

import com.objcom.metlife.dao.UserDao;
import com.objcom.metlife.dto.User;
import com.objcom.metlife.mapper.UserMapper;
import com.objcom.metlife.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("ALL")
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserDao userDao;

//    @Autowired
//    private RedisTemplate redisTemplate;

    /**
     * 查询所有
     *
     * @return list
     */
    @Override
    public List<User> findAll() {
        //1.查缓存
        List<User> userList;
//        userList = (List<User>) redisTemplate.boundValueOps("userList").get();
        //2.缓存没有查数据库，并将数据存入缓存
//        if (userList == null || userList.size() < 1) {
            userList = userMapper.findAll();
            //存入缓存
//            redisTemplate.boundValueOps("userList").set(userList);
//        }
        return userList;
    }

    /**
     * 查询一个用户
     * @param id id
     * @return
     */
    @Override
    public User findById(Integer id) {
        Optional<User> user = userDao.findById(id);
        return user.get();
    }

    /**
     * 增加一个用户
     * @param user user
     */
    @Override
    public void save(User user) {
        userDao.save(user);
    }

    /**
     * 更新一个用户
     * @param user user
     */
    @Override
    public void update(User user) {
        userDao.save(user);
    }

    /**
     * 删除一个用户
     * @param id id
     */
    @Override
    public void deleteById(Integer id) {
        userDao.deleteById(id);
    }
}