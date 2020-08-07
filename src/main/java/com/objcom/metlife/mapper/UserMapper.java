package com.objcom.metlife.mapper;

import com.objcom.metlife.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();

    User findById(Integer id);

    void insertOne(User user);

    void updateUser(User user);

    void deleteById(Integer id);
}
/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50540
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50540
 File Encoding         : 65001

 Date: 23/07/2020 20:07:56
*/

    /*


        SET NAMES utf8mb4;
        SET FOREIGN_KEY_CHECKS = 0;

        -- ----------------------------
        -- Table structure for user
        -- ----------------------------
        DROP TABLE IF EXISTS `user`;
        CREATE TABLE `user`  (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
        `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
        `address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
        `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
        `age` int(11) NULL DEFAULT NULL,
        PRIMARY KEY (`id`) USING BTREE
        ) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

        -- ----------------------------
        -- Records of user
        -- ----------------------------
        INSERT INTO `user` VALUES (3, 'litchi', '555', '广州', 'litchi', NULL);
        INSERT INTO `user` VALUES (4, 'lemon', '666', '深圳', 'lemon', NULL);
        INSERT INTO `user` VALUES (6, 'cantaloupe', '444', '香港', 'cantaloupe', NULL);
        INSERT INTO `user` VALUES (7, 'watermelon', '333', '厦门', 'watermelon', NULL);

        SET FOREIGN_KEY_CHECKS = 1;
*/