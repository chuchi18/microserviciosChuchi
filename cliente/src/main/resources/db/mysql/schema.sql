-- noinspection SqlDialectInspectionForFile

-- noinspection SqlNoDataSourceInspectionForFile

DROP TABLE IF EXISTS client;
DROP TABLE IF EXISTS address;
DROP TABLE IF EXISTS visits;

CREATE DATABASE IF NOT EXISTS microservicios;

ALTER DATABASE microservicios
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;

USE microservicios;

CREATE TABLE IF NOT EXISTS client (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(30),
  last_name VARCHAR(30),
  city VARCHAR(30),
  status VARCHAR(30),
  INDEX(last_name)
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS address (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  address VARCHAR(80),
  client_id INT(4) UNSIGNED NOT NULL,
  FOREIGN KEY (client_id) REFERENCES client(id),
  INDEX(address)
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS visits (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  status VARCHAR(30),
  visit_date DATE,
  description VARCHAR(255),
  total INT(4) UNSIGNED NOT NULL,
  client_id INT(4) UNSIGNED NOT NULL,
  FOREIGN KEY (client_id) REFERENCES client(id)
) engine=InnoDB;

