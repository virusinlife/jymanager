CREATE TABLE `t_metadata` (
	`id` VARCHAR(50) NOT NULL,
	`title` VARCHAR(50) NOT NULL,
	`value` VARCHAR(50) NOT NULL,
	`decsription` VARCHAR(500) NULL DEFAULT NULL,
	`sortorder` INT(10) UNSIGNED ZEROFILL NOT NULL,
	UNIQUE INDEX `id_title` (`id`, `title`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;
