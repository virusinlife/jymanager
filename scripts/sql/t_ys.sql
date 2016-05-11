CREATE TABLE `t_ys` (
	`id` VARCHAR(45) NOT NULL COMMENT '序号',
	`ys_type` VARCHAR(20) NOT NULL COMMENT '预算类型',
	`ys_name` VARCHAR(100) NOT NULL COMMENT '预算科目',
	`ys_subname` VARCHAR(100) NOT NULL COMMENT '预算二级科目',
	`item_name` VARCHAR(100) NOT NULL COMMENT '预算子项名称',
	`item_year` VARCHAR(45) NOT NULL COMMENT '所属年份',
	`item_type` VARCHAR(45) NOT NULL COMMENT '子项类型',
	`item_buy_way` VARCHAR(45) NOT NULL COMMENT '采购方式',
	`item_tax` INT(11) NOT NULL DEFAULT '0' COMMENT '税率',
	`item_cur_amount` DECIMAL(20,2) NOT NULL DEFAULT '0.00' COMMENT '预算当年金额 ',
	`item_next_amount` DECIMAL(20,2) NOT NULL DEFAULT '0.00' COMMENT '预算跨年金额 ',
	`item_own_user` VARCHAR(45) NOT NULL COMMENT '预算责任人 ',
	`item_input_datetime` DATETIME NOT NULL COMMENT '输入时间 ',
	`item_input_user` VARCHAR(45) NOT NULL COMMENT '输入用户 ',
	`isvalid` INT(11) NOT NULL DEFAULT '1' COMMENT '是否生效 ',
	PRIMARY KEY (`id`),
	UNIQUE INDEX `id_UNIQUE` (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;
