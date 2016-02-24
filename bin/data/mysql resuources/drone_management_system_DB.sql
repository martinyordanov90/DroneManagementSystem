CREATE DATABASE drone_management_system;

USE drone_management_system;

CREATE TABLE locations(
id INT AUTO_INCREMENT,
xCoordinate INT NOT NULL DEFAULT 0,
yCoordinate INT NOT NULL DEFAULT 0,
PRIMARY KEY(id)
)Engine = InnoDB;

CREATE TABLE drones(
id INT AUTO_INCREMENT UNIQUE,
location_id INT NOT NULL,
battery DOUBLE NOT NULL,
capacity DOUBLE NOT NULL,
chargingRate DOUBLE NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY(location_id)REFERENCES locations(id)
)Engine = InnoDB;

CREATE TABLE products(
id INT AUTO_INCREMENT UNIQUE,
name VARCHAR(100)UNIQUE NOT NULL,
weightPerQuantity DOUBLE NOT NULL,
PRIMARY KEY (id)
)Engine = InnoDB;


CREATE TABLE warehouses(
id INT NOT NULL,
location_id INT NOT NULL,
product_id INT NOT NULL,
quantity INT NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY (location_id) REFERENCES locations(id),
FOREIGN KEY (product_id) REFERENCES products(id)
)Engine = InnoDB;

CREATE TABLE requests_log(
id INT NOT NULL AUTO_INCREMENT,
_timestamp TIMESTAMP,
ETA DOUBLE NOT NULL DEFAULT 0,
PRIMARY KEY (id)
)Engine = InnoDB;

GRANT ALL
ON drone_management_system.*
TO 'secretuser'@'localhost'
IDENTIFIED BY 'verysecretpassword';
