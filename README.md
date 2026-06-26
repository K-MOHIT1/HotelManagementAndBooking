# 🏨 Hotel Management & Booking System

## 🚀 Project Overview

A fully functional backend system for Hotel Management and Booking built using Spring Boot.
The system supports complete hotel operations including room management, booking workflows,
role-based access control, JWT authentication, and integrated payment processing.

---

## ⚙️ Tech Stack

* Language: Java
* Framework: Spring Boot
* Database: MySQL
* Security: Spring Security, JWT
* API Documentation: Swagger/OpenAPI
* Tools: Git, Postman

---

## ✨ Features Implemented

* JWT-based stateless authentication (Login/Register)
* Role-based access control (Admin/User)
* Admin APIs for managing hotel and room data
* Room booking and reservation system with availability checking
* Payment integration
* CRUD operations for hotel and room management
* DTO-based data transfer with validation
* Global exception handling using @ControllerAdvice
* API documentation via Swagger UI
* Layered architecture (Controller, Service, Repository)
* Clean and modular backend structure

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

## 🔒 Security Implementation

* Stateless authentication using JWT tokens
* Spring Security for request filtering and authorization
* Role-based endpoint protection (Admin/User)
* BCrypt password hashing

---

## 📡 API Endpoints

### Auth
* POST /auth/register
* POST /auth/login

### Hotels
* GET /hotels
* POST /hotels
* PUT /hotels/{id}
* DELETE /hotels/{id}

### Rooms & Booking
* GET /rooms/available
* POST /bookings
* GET /bookings/{id}
* DELETE /bookings/{id}

### Payments
* POST /payments

---

## 📖 API Documentation

Swagger UI available at: `http://localhost:8080/swagger-ui.html`

---

## ▶️ How to Run

1. Clone the repository:

```
git clone https://github.com/K-MOHIT1/HotelManagementAndBooking
```

2. Configure MySQL in `application.properties`

3. Run the application:

```
./mvnw spring-boot:run
```

---

## 👨‍💻 Author

Mohit — [GitHub](https://github.com/K-MOHIT1)
