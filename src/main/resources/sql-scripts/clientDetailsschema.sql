CREATE TABLE  `security`.`client_details` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `scopes` varchar(100) NOT NULL DEFAULT '',
  `resource_ids` varchar(45) DEFAULT NULL,
  `grant_types` varchar(100) NOT NULL DEFAULT '',
  `authorities` varchar(100) NOT NULL DEFAULT '',
  `client_secret` varchar(100) NOT NULL DEFAULT '',
  `client_id` varchar(45) NOT NULL DEFAULT '',
  `access_token_validity_seconds` int(10) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;