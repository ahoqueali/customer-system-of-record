--liquibase formatted sql

--changeset liquibase:1
CREATE TABLE IF NOT EXISTS customer (customer_id UUID PRIMARY KEY DEFAULT gen_random_uuid(), first_name STRING);
