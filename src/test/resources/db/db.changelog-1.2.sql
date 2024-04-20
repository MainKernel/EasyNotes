-- liquibase formatted sql

-- changeset mightyloot:1
CREATE TABLE IF NOT EXISTS notifications
(
    id                BIGSERIAL PRIMARY KEY,
    title             VARCHAR(128),
    content           VARCHAR(2048),
    status            VARCHAR(16),
    user_id           BIGINT REFERENCES users (id),
    notification_time TIMESTAMP
);
