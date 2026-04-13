# bts-product

BTS.id Technical Test Project

## Description
This service is developed using **Java Spring Boot** and **PostgreSQL**.

---

## Tech Stack

- Java 8
- Spring Boot
- PostgreSQL 
- Keycloak
- Docker & Docker Compose
- Maven

---

## How to Run (Docker)
### 1. Clone the repository
```bash
git clone https://github.com/piipiets/bts-product
cd bts-product
mvn clean package -DskipTests
docker compose up --build
```

### Services
- Service	URL : Application	http://localhost:8080
- PostgreSQL	: localhost:5432
- Keycloak	: http://localhost:8181

### Get Access Token
```bash
curl --location 'http://localhost:8080/api/auth/login' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=FB8B3C5135D81BC98FD16E5AAFB0A92E' \
--data '{
    "username": "user",
    "password": "123456"
}'
```
