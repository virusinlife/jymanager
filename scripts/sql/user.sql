CREATE TABLE `user` (
	`id` VARCHAR(20) NOT NULL,
	`name` VARCHAR(45) NULL DEFAULT NULL,
	`password` VARCHAR(45) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;
