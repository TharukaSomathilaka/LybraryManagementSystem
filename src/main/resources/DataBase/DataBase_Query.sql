CREATE DATABASE library_management_system;

USE library_management_system;

CREATE TABLE user(
    user_id   INT AUTO_INCREMENT PRIMARY KEY,
    username  VARCHAR(50)  NOT NULL UNIQUE,
    password  VARCHAR(255) NOT NULL
);


CREATE TABLE member (
    member_id    INT AUTO_INCREMENT PRIMARY KEY,
    fullname     VARCHAR(100) NOT NULL,
    email        VARCHAR(100) UNIQUE,
    phonenumber  VARCHAR(20),
    address      VARCHAR(255)
);

CREATE TABLE book (
    book_id         VARCHAR(20) PRIMARY KEY,
    book_title      VARCHAR(255) NOT NULL,
    author          VARCHAR(100),
    category        VARCHAR(100),
    published_year  DATE,
    quantity        INT NOT NULL DEFAULT 0
);


CREATE TABLE student (
    student_id  INT AUTO_INCREMENT PRIMARY KEY,
    st_name     VARCHAR(100) NOT NULL,
    address     VARCHAR(255),
    email       VARCHAR(100) UNIQUE,
    birthday    DATE,
    batch       VARCHAR(20),
    NIC         VARCHAR(20) UNIQUE,
    created_on  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_on  TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

INSERT INTO user(username, password)
VALUES ('admin', 'admin123');