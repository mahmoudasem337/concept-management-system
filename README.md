# concept-management-system

This project is an platform for manage learning concepts and providing quizzes in large number of topics.

## 📌 Overview

The system includes:
- **Authentication** service using **Keycloak**.
- **Quiz Service** for quizzes, it's integrated with external API (QuizAPI).
- **Concept Service** for managing process of learning concepts.
- All services are containerized with **Docker**.
- **MongoDB** is used as a good solution for storing data.

## System Design
![image](https://github.com/user-attachments/assets/a0d30e51-131b-40c5-832d-7a524a8ae0d5)

 
## 🚀 Getting Started

### Prerequisites
- Docker
- Docker Compose

### Running the Application
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/your-repo.git
   cd your-repo

2. Starting:
   ```bash
   docker-compose up --build
