/*
 Navicat MySQL Data Transfer

 Source Server         : database1
 Source Server Type    : MySQL
 Source Server Version : 50536
 Source Host           : localhost:3306
 Source Schema         : hotel

 Target Server Type    : MySQL
 Target Server Version : 50536
 File Encoding         : 65001

 Date: 08/07/2020 17:19:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tab_admin
-- ----------------------------
DROP TABLE IF EXISTS `tab_admin`;
CREATE TABLE `tab_admin`  (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `staff_id` int(11) NULL DEFAULT NULL,
  `admin_username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `admin_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`admin_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tab_admin
-- ----------------------------

-- ----------------------------
-- Table structure for tab_customer
-- ----------------------------
DROP TABLE IF EXISTS `tab_customer`;
CREATE TABLE `tab_customer`  (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `customer_sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `customer_cardnumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `customer_age` int(11) NULL DEFAULT NULL,
  `customer_tele` int(11) NULL DEFAULT NULL,
  `customer_status` tinyint(4) NULL DEFAULT NULL,
  PRIMARY KEY (`customer_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tab_customer
-- ----------------------------

-- ----------------------------
-- Table structure for tab_order
-- ----------------------------
DROP TABLE IF EXISTS `tab_order`;
CREATE TABLE `tab_order`  (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) NULL DEFAULT NULL,
  `room_id` int(11) NULL DEFAULT NULL,
  `reception_id` int(11) NULL DEFAULT NULL,
  `room_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `order_price` double NULL DEFAULT NULL,
  `order_status` tinyint(4) NULL DEFAULT NULL,
  `order_credate` datetime NULL DEFAULT NULL,
  `checkin_date` date NULL DEFAULT NULL,
  `checkout_date` date NULL DEFAULT NULL,
  `customer_number` int(11) NULL DEFAULT NULL,
  `customer_phone` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tab_order
-- ----------------------------

-- ----------------------------
-- Table structure for tab_reception
-- ----------------------------
DROP TABLE IF EXISTS `tab_reception`;
CREATE TABLE `tab_reception`  (
  `reception_id` int(11) NOT NULL AUTO_INCREMENT,
  `stuff_id` int(11) NULL DEFAULT NULL,
  `reception_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`reception_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tab_reception
-- ----------------------------

-- ----------------------------
-- Table structure for tab_room
-- ----------------------------
DROP TABLE IF EXISTS `tab_room`;
CREATE TABLE `tab_room`  (
  `room_id` int(11) NOT NULL AUTO_INCREMENT,
  `room_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `room_number` int(11) NULL DEFAULT NULL,
  `room_status` tinyint(4) NULL DEFAULT NULL,
  PRIMARY KEY (`room_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tab_room
-- ----------------------------

-- ----------------------------
-- Table structure for tab_stuff
-- ----------------------------
DROP TABLE IF EXISTS `tab_stuff`;
CREATE TABLE `tab_stuff`  (
  `stuff_id` int(11) NOT NULL AUTO_INCREMENT,
  `stuff_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stuff_age` int(11) NULL DEFAULT NULL,
  `stuff_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stuff_tele` int(11) NULL DEFAULT NULL,
  `stuff_cardnumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stuff_adress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stuff_status` tinyint(4) NULL DEFAULT NULL,
  PRIMARY KEY (`stuff_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tab_stuff
-- ----------------------------

-- ----------------------------
-- Table structure for tab_type
-- ----------------------------
DROP TABLE IF EXISTS `tab_type`;
CREATE TABLE `tab_type`  (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type_price` double NULL DEFAULT NULL,
  `aval_number` int(11) NULL DEFAULT NULL,
  `type_number` int(11) NULL DEFAULT NULL,
  `type_status` tinyint(4) NULL DEFAULT NULL,
  PRIMARY KEY (`type_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tab_type
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
