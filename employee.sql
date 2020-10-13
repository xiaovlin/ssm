/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 5.7.31 : Database - ssm
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ssm`;

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `age` int(4) DEFAULT NULL,
  `sex` char(4) DEFAULT NULL,
  `address` varchar(64) DEFAULT NULL,
  `phone` char(11) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

insert  into `employee`(`id`,`name`,`age`,`sex`,`address`,`phone`,`password`) values 
(1,'陈静',25,'女','海南省海口市美兰区','18795556693',NULL),
(2,'赵琳浩',30,'男','陕西省西安市莲湖区','15698887795',NULL),
(3,'鹿存亮',26,'男','陕西省西安市莲湖区','15612347795',NULL),
(4,'姚森',22,'男','河南洛阳人民大道58号','14785559936',NULL),
(5,'贾旭明',40,'男','广东省广州市天河区冼村路','15644441234',NULL),
(6,'张黎明',26,'男','广东珠海','18979994478',NULL),
(7,'薛磊',32,'男','西安市雁塔区','15648887741',NULL),
(8,'张洁',27,'女','海口市美兰区','13695557742',NULL),
(9,'鹿存亮2',26,'男','陕西省西安市莲湖区','15612347795',NULL),
(10,'姚森2',22,'男','河南洛阳人民大道58号','14785559936',NULL),
(11,'贾旭明2',40,'男','广东省广州市天河区冼村路','15644441234',NULL),
(12,'张黎明2',26,'男','广东珠海','18979994478',NULL),
(13,'薛磊2',32,'男','西安市雁塔区','15648887741',NULL),
(14,'张洁2',27,'女','海口市美兰区','13695557742',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
