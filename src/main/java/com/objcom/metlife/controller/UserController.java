package com.objcom.metlife.controller;

import com.objcom.metlife.dto.User;
import com.objcom.metlife.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;



    /***
     * 查询所有用户
     * @return list
     */
    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }
//    //打开所有html页面(jsp也一样)
//    @RequestMapping("/{view}")
//    public String html(@PathVariable("view")String view){
//        return view;
//    }//其中view就是你要打开的视图哦


    /**
     * 查询一个用户
     * @param id id
     * @return user
     */
    @RequestMapping("findById/{id}")
    public User findById(@PathVariable Integer id){
        return userService.findById(id);
    }

    /**
     * 新增一个用户
     * @param user user
     */
    @RequestMapping("save")
    public void save(User user){
        userService.save(user);
    }

    /**
     * 更新一个用户
     * @param user user
     */
    @RequestMapping("update")
    public void update(User user){
        userService.update(user);
    }

    /**
     * 删除一个用户
     * @param id id
     */
    @RequestMapping("deleteById/{id}")
    public void deleteById(@PathVariable Integer id){
        userService.deleteById(id);
    }
}
