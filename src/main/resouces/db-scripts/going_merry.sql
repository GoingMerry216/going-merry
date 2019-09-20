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

-- ----------------------------
-- Table structure for gkd_user
-- ----------------------------
DROP TABLE IF EXISTS `gkd_user`;
CREATE TABLE `gkd_user` (
  `user_id` varchar(255) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
