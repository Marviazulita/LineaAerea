/*
Navicat MariaDB Data Transfer

Source Server         : maria
Source Server Version : 100113
Source Host           : localhost:3306
Source Database       : aerolinea

Target Server Type    : MariaDB
Target Server Version : 100113
File Encoding         : 65001

Date: 2016-05-17 00:55:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for asiento
-- ----------------------------
DROP TABLE IF EXISTS `asiento`;
CREATE TABLE `asiento` (
  `numero` int(11) NOT NULL,
  `reservado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for pasajero
-- ----------------------------
DROP TABLE IF EXISTS `pasajero`;
CREATE TABLE `pasajero` (
  `nombre` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for reservaciones
-- ----------------------------
DROP TABLE IF EXISTS `reservaciones`;
CREATE TABLE `reservaciones` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pasajero` varchar(50) NOT NULL,
  `vuelo` varchar(50) NOT NULL,
  `asiento` int(11) NOT NULL,
  `terminal` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=952 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for terminal
-- ----------------------------
DROP TABLE IF EXISTS `terminal`;
CREATE TABLE `terminal` (
  `nombre` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for vuelo
-- ----------------------------
DROP TABLE IF EXISTS `vuelo`;
CREATE TABLE `vuelo` (
  `nombre` varchar(50) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `desde` varchar(50) NOT NULL,
  `hacia` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
