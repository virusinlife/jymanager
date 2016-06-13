-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.6.24 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出 jymanager 的数据库结构
CREATE DATABASE IF NOT EXISTS `jymanager` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `jymanager`;


-- 导出  表 jymanager.t_metadata 结构
CREATE TABLE IF NOT EXISTS `t_metadata` (
  `id` varchar(50) NOT NULL,
  `title` varchar(50) NOT NULL,
  `value` varchar(50) NOT NULL,
  `decsription` varchar(500) DEFAULT NULL,
  `sortorder` int(10) unsigned zerofill NOT NULL,
  UNIQUE KEY `id_title` (`id`,`title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  jymanager.t_metadata 的数据：~24 rows (大约)
DELETE FROM `t_metadata`;
/*!40000 ALTER TABLE `t_metadata` DISABLE KEYS */;
INSERT INTO `t_metadata` (`id`, `title`, `value`, `decsription`, `sortorder`) VALUES
	('default', 'default', 'default', 'default', 0000000001),
	('isvalid', '失效', '失效', '失效', 0000000002),
	('isvalid', '生效', '生效', '生效', 0000000001),
	('item_buy_way', '公开招标', '公开招标', '公开招标', 0000000003),
	('item_buy_way', '公开比选', '公开比选', '公开比选', 0000000002),
	('item_buy_way', '单一来源', '单一来源', '单一来源', 0000000004),
	('item_buy_way', '已有合同', '已有合同', '已有合同', 0000000005),
	('item_buy_way', '集中采购', '集中采购', '集中采购', 0000000001),
	('item_type', '软件外包', '软件外包', '软件外包', 0000000001),
	('ys_name', '有价卡系统维护', '有价卡系统维护', '有价卡系统维护', 0000000003),
	('ys_name', '物联网PBOSS系统维护', '物联网PBOSS系统维护', '物联网PBOSS系统维护', 0000000002),
	('ys_name', '统一支付系统维护', '统一支付系统维护', '统一支付系统维护', 0000000001),
	('ys_subname', '维护-其他预算', '维护-其他预算', '维护-其他预算', 0000000010),
	('ys_subname', '维护-外援服务预算', '维护-外援服务预算', '维护-外援服务预算', 0000000009),
	('ys_subname', '维护-软件外包预算', '维护-软件外包预算', '维护-软件外包预算', 0000000008),
	('ys_subname', '项目-其他预算', '项目-其他预算', '项目-其他预算', 0000000007),
	('ys_subname', '项目-外援服务预算', '项目-外援服务预算', '项目-外援服务预算', 0000000004),
	('ys_subname', '项目-工程配套预算', '项目-工程配套预算', '项目-工程配套预算', 0000000005),
	('ys_subname', '项目-机房施工预算', '项目-机房施工预算', '项目-机房施工预算', 0000000006),
	('ys_subname', '项目-硬件预算', '项目-硬件预算', '项目-硬件预算', 0000000001),
	('ys_subname', '项目-软件产品预算', '项目-软件产品预算', '项目-软件产品预算', 0000000002),
	('ys_subname', '项目-软件外包预算', '项目-软件外包预算', '项目-软件外包预算', 0000000003),
	('ys_type', '工程项目预算', '工程项目预算', '工程项目预算', 0000000002),
	('ys_type', '生产系统维护预算', '生产系统维护预算', '生产系统维护预算', 0000000001);
/*!40000 ALTER TABLE `t_metadata` ENABLE KEYS */;


-- 导出  表 jymanager.t_ys 结构
CREATE TABLE IF NOT EXISTS `t_ys` (
  `ys_id` varchar(45) NOT NULL COMMENT '序号',
  `ys_type` varchar(20) NOT NULL COMMENT '预算类型',
  `ys_name` varchar(100) NOT NULL COMMENT '预算科目',
  `ys_subname` varchar(100) NOT NULL COMMENT '预算二级科目',
  `item_name` varchar(100) DEFAULT NULL COMMENT '预算子项名称',
  `item_year` varchar(45) NOT NULL COMMENT '所属年份',
  `item_type` varchar(45) NOT NULL COMMENT '子项类型',
  `item_buy_way` varchar(45) NOT NULL COMMENT '采购方式',
  `item_tax` int(11) NOT NULL DEFAULT '0' COMMENT '税率',
  `item_cur_amount` decimal(20,2) NOT NULL DEFAULT '0.00' COMMENT '预算当年金额 ',
  `item_next_amount` decimal(20,2) NOT NULL DEFAULT '0.00' COMMENT '预算跨年金额 ',
  `item_own_user` varchar(45) NOT NULL COMMENT '预算责任人 ',
  `item_input_datetime` datetime NOT NULL COMMENT '输入时间 ',
  `item_input_user` varchar(45) NOT NULL COMMENT '输入用户 ',
  `isvalid` varchar(10) NOT NULL DEFAULT '生效' COMMENT '是否生效 ',
  `commets` varchar(4000) DEFAULT '',
  PRIMARY KEY (`ys_id`),
  UNIQUE KEY `ys_id_UNIQUE` (`ys_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  jymanager.t_ys 的数据：~2 rows (大约)
DELETE FROM `t_ys`;
/*!40000 ALTER TABLE `t_ys` DISABLE KEYS */;
INSERT INTO `t_ys` (`ys_id`, `ys_type`, `ys_name`, `ys_subname`, `item_name`, `item_year`, `item_type`, `item_buy_way`, `item_tax`, `item_cur_amount`, `item_next_amount`, `item_own_user`, `item_input_datetime`, `item_input_user`, `isvalid`, `commets`) VALUES
	('YS-201605061453000', '生产系统维护预算', '统一支付系统维护', '维护-软件外包预算', '开发预算', '2016', '软件外包', '单一来源', 6, 2000000.00, 0.00, 'qinqiang', '2016-06-08 15:10:42', 'admin', '生效', ''),
	('YS-201605130925000', '生产系统维护预算', '物联网PBOSS系统维护', '维护-软件外包预算', '开发预算', '2016', '软件外包', '单一来源', 6, 1000000.00, 0.00, 'wangyl', '2016-05-13 09:26:36', 'zhangsl', '生效', '');
/*!40000 ALTER TABLE `t_ys` ENABLE KEYS */;


-- 导出  表 jymanager.user 结构
CREATE TABLE IF NOT EXISTS `user` (
  `id` varchar(20) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  jymanager.user 的数据：~0 rows (大约)
DELETE FROM `user`;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
