# Concept Management System

A Spring Boot application for managing learning concepts, tracking user progress, and providing interactive exercises.

---

## 🏗️ System Architecture

![image](https://github.com/user-attachments/assets/1b562e13-cba2-4fb3-bc85-1fa238b249ef)
---

## 🗂️ Entity Relationship Diagram (ERD)

![image](https://github.com/user-attachments/assets/da68238a-5774-4104-9062-aaf5c69963d9)

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
