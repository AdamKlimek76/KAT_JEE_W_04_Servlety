CREATE DATABASE newsletter_users
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;

CREATE TABLE users (
    user_id INT AUTO_INCREMENT,
    user_name VARCHAR(255),
    user_email VARCHAR(255) UNIQUE,
    PRIMARY KEY(user_id)
);
