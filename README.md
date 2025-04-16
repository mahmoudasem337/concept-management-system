# Concept Management System

A Spring Boot application for managing learning concepts, tracking user progress, and providing interactive exercises.

---

## 🏗️ System Architecture

![image](https://github.com/user-attachments/assets/5d89b667-56ea-49c3-bcb6-75f081ee8171)
---

## 🗂️ Entity Relationship Diagram (ERD)

![image](https://github.com/user-attachments/assets/906f671f-4401-453c-94b8-6f5c82715ba3)

## ✨ Features

### 📘 Concept Management
Create, update, and manage learning concepts.

| Method | Endpoint             | Description                     |
|--------|----------------------|---------------------------------|
| GET    | `/concepts`          | Retrieve all concepts           |
| POST   | `/concepts`          | Add a new concept               |
| PUT    | `/concepts/{id}`     | Update an existing concept      |
| DELETE | `/concepts/{id}`     | Delete a concept by ID          |
| GET    | `/concepts/{title}`  | Retrieve concept by title       |

---

## 🚀 Tech Stack

- Java 17+
- Spring Boot
- Keycloak
- MongoDB
- Heroku
- JUnit 5 & Mockito
- Maven

## 🧪 Running Locally

```bash
# Clone the repository
git clone https://github.com/mahmoudasem337/ConceptManagementSystem
cd ConceptManagementSystem

# Build with Maven or Gradle
./mvnw spring-boot:run
# or
./gradlew bootRun
