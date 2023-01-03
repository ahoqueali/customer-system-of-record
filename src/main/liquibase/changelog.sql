--liquibase formatted sql

--changeset liquibase:1
CREATE TABLE IF NOT EXISTS Customer (CustomerId UUID PRIMARY KEY DEFAULT gen_random_uuid(), FirstName STRING);
