--liquibase formatted sql

-- changeset mightyloot:1
CREATE TABLE IF NOT EXISTS urls
(
    id BIGSERIAL PRIMARY KEY,
    title   VARCHAR(128),
    content VARCHAR(1024),
    url     VARCHAR(512),
    user_id BIGINT REFERENCES users (CTID)
);
