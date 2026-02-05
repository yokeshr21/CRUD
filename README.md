# 🛒 Order Management System (Spring Boot + MySQL)
A Simple Order Management REST API built using Spring Boot, Spring Data JPA, and MySQL.
This project implements full CRUD operations (Create, Read, Update, Delete) for orders.

---

## 🚀 Tech Stack
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Postman (for API testing)

---

## 📌 Features
- Create a new order
- View all orders
- View order by ID
- Update existing order
- Delete order
- RESTful API design
- Database integration with MySQL

---

## 🗂️ Project Structure

``` src/main/java
 └── com.example.orderservice
     ├── controller
     │    └── OrderController.java
     ├── service
     │    └──OrderService.java
     ├── repository
     │    └── OrderRepository.java
     ├── model
     │    └── Order.java
     └── OrderServiceApplication.java
```

---
     
## ⚙️ Database Configuration
MySQL database name:
order_db

> application.properties:

- spring.datasource.url=jdbc:mysql://localhost:3306/order_db
- spring.datasource.username=root
- spring.datasource.password=your_password

- spring.jpa.hibernate.ddl-auto=update
- spring.jpa.show-sql=true
- spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

---

## 🔗 API Endpoints
POST
- /api/orders - Create new order

GET
- /api/orders - Get all orders

GET
- /api/orders/{id} - Get order by ID

PUT
- /api/orders/{id} - Update order

DELETE
- /api/orders/{id} - Delete order

---

## 🧪 Sample Request (POST / PUT)
```
{
  "productName": "Mobile",
  "quantity": 2,
  "price": 45000,
  "status": "NEW"
}
```
