--liquibase formatted sql

--changeset mightyloot:1

CREATE TABLE IF NOT EXISTS users(
    id BIGSERIAL PRIMARY KEY,
    first_name VARCHAR(32),
    last_name VARCHAR(32),
    user_time_zone VARCHAR(16),
    username VARCHAR(64) UNIQUE,
    email VARCHAR(128) UNIQUE,
    phone_number VARCHAR(16) UNIQUE,
    password VARCHAR(512),
    role VARCHAR(16),
    is_account_non_expired BOOLEAN DEFAULT TRUE,
    is_account_non_locked BOOLEAN DEFAULT TRUE,
    is_credentials_non_expired BOOLEAN DEFAULT TRUE,
    is_enabled BOOLEAN DEFAULT TRUE
);