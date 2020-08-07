package com.objcom.metlife;

import com.objcom.metlife.dto.User;
import com.objcom.metlife.service.UserService;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MetlifeApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testFindAll(){
        List<User> userList = userService.findAll();
        userList.forEach(user -> {
            System.out.println(user);
        });
    }
    @Test
    public void testFindById(){
        User user = userService.findById(1);
        System.out.println(user);
    }
}
