/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : spring

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2016-12-15 14:31:28
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(45) default NULL,
  `money` decimal(10,0) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', 'Lee', '12');
INSERT INTO `account` VALUES ('2', 'Jack', '121');
INSERT INTO `account` VALUES ('3', 'Ming', '9990');
INSERT INTO `account` VALUES ('4', 'huag', '521');
INSERT INTO `account` VALUES ('5', 'Tom', '3121');
INSERT INTO `account` VALUES ('6', '小小1', '1000');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_id` int(20) NOT NULL auto_increment,
  `student_name` varchar(16) character set gb2312 default NULL,
  `sex` varchar(2) character set gb2312 default NULL,
  PRIMARY KEY  (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', 'Lee', '0');
INSERT INTO `student` VALUES ('4', 'Ming', '1');
INSERT INTO `student` VALUES ('5', 'Ming', '1');
INSERT INTO `student` VALUES ('6', 'Ming', '1');
INSERT INTO `student` VALUES ('7', 'Ming', '1');
INSERT INTO `student` VALUES ('8', 'Ming', '1');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL auto_increment,
  `userName` varchar(50) default NULL,
  `userAge` int(11) default NULL,
  `userAddress` varchar(200) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'summer', '100', 'shanghai,pudong');
