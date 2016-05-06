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

-- 导出  表 jymanager.t_metadata 结构
DROP TABLE IF EXISTS `t_metadata`;
CREATE TABLE IF NOT EXISTS `t_metadata` (
  `id` varchar(50) NOT NULL,
  `title` varchar(50) NOT NULL,
  `value` varchar(50) NOT NULL,
  `decsription` varchar(500) DEFAULT NULL,
  `sortorder` int(10) unsigned zerofill NOT NULL,
  UNIQUE KEY `id_title` (`id`,`title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  jymanager.t_metadata 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `t_metadata` DISABLE KEYS */;
INSERT INTO `t_metadata` (`id`, `title`, `value`, `decsription`, `sortorder`) VALUES
	('ys_name', '有价卡系统维护', '有价卡系统维护', '有价卡系统维护', 0000000003),
	('ys_name', '物联网PBOSS系统维护', '物联网PBOSS系统维护', '物联网PBOSS系统维护', 0000000002),
	('ys_name', '统一支付系统维护', '统一支付系统维护', '统一支付系统维护', 0000000001),
	('ys_type', '工程项目预算', '工程项目预算', '工程项目预算', 0000000002),
	('ys_type', '生产系统维护预算', '生产系统维护预算', '生产系统维护预算', 0000000001),
	('ys_subname', '项目-硬件预算', '项目-硬件预算', '项目-硬件预算', 0000000001),
	('ys_subname', '项目-软件产品预算', '项目-软件产品预算', '项目-软件产品预算', 0000000002),
	('ys_subname', '项目-软件外包预算', '项目-软件外包预算', '项目-软件外包预算', 0000000003),
	('ys_subname', '项目-外援服务预算', '项目-外援服务预算', '项目-外援服务预算', 0000000004),
	('ys_subname', '项目-工程配套预算', '项目-工程配套预算', '项目-工程配套预算', 0000000005),
	('ys_subname', '项目-机房施工预算', '项目-机房施工预算', '项目-机房施工预算', 0000000006),
	('ys_subname', '项目-其他预算', '项目-其他预算', '项目-其他预算', 0000000007),
	('ys_subname', '维护-软件外包预算', '维护-软件外包预算', '维护-软件外包预算', 0000000008),
	('ys_subname', '维护-外援服务预算', '维护-外援服务预算', '维护-外援服务预算', 0000000009),
	('ys_subname', '维护-其他预算', '维护-其他预算', '维护-其他预算', 00000000010),
	('item_buy_way', '集中采购', '集中采购', '集中采购', 00000000001),
	('item_buy_way', '公开比选', '公开比选', '公开比选', 00000000002),	
	('item_buy_way', '公开招标', '公开招标', '公开招标', 00000000003),	
	('item_buy_way', '单一来源', '单一来源', '单一来源', 00000000004),	
	('item_buy_way', '已有合同', '已有合同', '已有合同', 00000000005),	
	('isvalid', '生效', '生效', '生效', 00000000001),	
	('isvalid', '失效', '失效', '失效', 00000000002),		
	('default', 'default','default','default', 00000000001);
/*!40000 ALTER TABLE `t_metadata` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
