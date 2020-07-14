--liquibase formatted sql
--changeset ccarpenter:0.1

CREATE TABLE wc_user(
    id INT GENERATED ALWAYS AS IDENTITY,
    username TEXT NOT NULL
);