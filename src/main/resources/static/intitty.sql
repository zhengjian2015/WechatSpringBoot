SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `article`
-- ----------------------------
--2017年中国软件业务收入百强
DROP TABLE IF EXISTS `tb_area`;
CREATE TABLE `tb_area` (
  `area_id` int(2)  NOT NULL AUTO_INCREMENT,
  `area_name`   varchar(200) NOT NULL,
  `priority` int(2) NOT NULL DEFAULT 0,
  `create_time` datetime  DEFAULT NULL,
  `last_edit_time` datetime DEFAULT NULL,
  UNIQUE KEY `UK_AREA`(`area_name`),
  PRIMARY KEY (`area_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;