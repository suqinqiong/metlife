package com.objcom.metlife.dao;

import com.objcom.metlife.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
