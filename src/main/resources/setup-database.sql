CREATE DATABASE dhycost_db CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;
/* CREATE USER 'repuser'@'localhost' IDENTIFIED BY 'reppass'; */
GRANT ALL PRIVILEGES ON dhycost_db.* to 'repuser'@'localhost';