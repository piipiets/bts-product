# bts-product

BTS.id Technical Test Project

## Description
This service is developed using **Java Spring Boot** and **PostgreSQL**.

---

## 🗄️ Database Schema

Below is the DDL for the `products` table:

```sql
CREATE TABLE public.products (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    price NUMERIC(10, 2) NOT NULL,
    description TEXT,
    category VARCHAR(100),
    images TEXT[],
    created_at TIMESTAMP,
    created_by VARCHAR(100),
    created_by_id BIGINT,
    updated_at TIMESTAMP,
    updated_by VARCHAR(100),
    updated_by_id BIGINT
);
