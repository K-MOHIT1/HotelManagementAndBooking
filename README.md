# 🏨 Hotel Management & Booking Backend (Work in Progress)

## 🚀 Project Overview

This is a backend system for a Hotel Management and Booking application built using Spring Boot.
It focuses on designing scalable REST APIs, managing hotel data, and following clean backend architecture principles.

The project is currently under development, with core backend setup, database integration, CRUD operations, and admin APIs completed.

---

## ⚙️ Tech Stack

* Language: Java
* Framework: Spring Boot
* Database: MySQL
* API: RESTful APIs
* Tools: Git, Postman

---

## ✨ Features Implemented

* Project setup using Spring Boot
* Layered architecture (Controller, Service, Repository)
* MySQL database integration and configuration
* Database schema design
* Admin APIs for managing hotel data
* CRUD operations for hotel management (Create, Read, Update, Delete)
* Use of DTOs for data transfer
* Global exception handling using @ControllerAdvice
* API validation and error handling
* Clean and modular backend structure

---

## 🚧 Features in Progress

* User Authentication (Login/Register)
* Role-based access (Admin/User)
* Booking system (room reservation)
* Payment integration
* Security implementation (Spring Security / JWT)

---

## 📂 Project Structure

```
src/main/java/
 ├── controller/     # Handles API requests
 ├── service/        # Business logic
 ├── repository/     # Database operations
 ├── entity/         # Database entities
 ├── dto/            # Data Transfer Objects
 ├── exception/      # Custom exceptions
 ├── advice/         # Global exception handling (@ControllerAdvice)
 ├── config/         # Configuration classes
 ├── util/           # Utility/helper classes
```

---

## ▶️ How to Run the Project

1. Clone the repository:

```
git clone https://github.com/K-MOHIT1/HotelManagementAndBooking
```

2. Navigate to project directory:

```
cd HotelManagementAndBooking
```

3. Configure MySQL database:

* Create a database in MySQL
* Update `application.properties` with your database username and password

4. Run the application:

```
./mvnw spring-boot:run
```

(or run using your IDE)

---

## 🧪 API Testing

Use Postman to test REST APIs.

### Example Endpoints:

* GET /hotels
* POST /hotels
* PUT /hotels/{id}
* DELETE /hotels/{id}

---

## 📌 Current Status

🚧 Work in Progress – backend setup, database integration, CRUD operations, DTO usage, and exception handling completed.
Authentication, security, and booking features are currently being developed.

---

## 💡 Future Improvements

* Implement JWT-based authentication using Spring Security
* Add role-based authorization (Admin/User)
* Complete booking workflow
* API documentation using Swagger
* Deployment on cloud (AWS/Render)

---

## 👨‍💻 Author

Mohit
GitHub: https://github.com/K-MOHIT1
