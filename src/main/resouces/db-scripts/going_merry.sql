/*
Navicat MySQL Data Transfer

Source Server         : Localhost
Source Server Version : 50639
Source Host           : localhost:3306
Source Database       : going_merry

Target Server Type    : MYSQL
Target Server Version : 50639
File Encoding         : 65001

Date: 2019-09-20 18:14:08
*/

SET FOREIGN_KEY_CHECKS=0;
DROP DATABASE IF EXISTS `GOING_MERRY`;
CREATE DATABASE GOING_MERRY;
USE  GOING_MERRY;
-- ----------------------------
-- Table structure for gkd_user
-- ----------------------------
DROP TABLE IF EXISTS `gkd_user`;
CREATE TABLE `gkd_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  `is_valid` int(1) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `gkd_article`;
CREATE TABLE `gkd_article` (
  `article_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `summary` varchar(255) NOT NULL,
  `content` varchar(255) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user` datetime DEFAULT NULL,
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `gkd_comment`;
CREATE TABLE `gkd_comment` (
  `comment_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `target` varchar(32) NOT NULL,
  `comment_parent_id` int(11) NOT NULL,
  `content` varchar(2048) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user` datetime DEFAULT NULL,
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
