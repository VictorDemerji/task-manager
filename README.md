📝 Task Manager – Spring Boot (Junior Project)

A simple Task Manager web application built with Java & Spring Boot.
This project was created as a learning and portfolio project to practice backend fundamentals, authentication, and basic frontend integration.

🎯 Project Goal

The main goal of this project is to understand and apply:

Spring Boot project structure

MVC architecture

User authentication flow

CRUD operations

Database integration with MySQL

Basic UI using Thymeleaf

Git workflow with branches and commits

🚀 Features

🔐 User registration and login

👤 Session-based authentication

📝 Create, edit, delete tasks

📋 View all tasks in a dashboard

🌙 Dark mode (saved in browser)

🎨 Simple and responsive UI (Bootstrap)

🗄️ MySQL database

🛠️ Technologies Used

Java

Spring Boot

Spring MVC

Spring Data JPA

Spring Security (basic configuration)

Thymeleaf

MySQL

Bootstrap 5

Maven

Git & GitHub

📂 Project Structure
src/main/java/com/example/task_manager
│
├── controller      # Handles HTTP requests
├── service         # Business logic
├── repository      # Database access
├── model           # JPA entities

⚙️ How to Run the Project
1️⃣ Clone the repository
git clone https://github.com/USERNAME/task-manager.git
cd task-manager

2️⃣ Setup MySQL

Create database:

CREATE DATABASE task_manager;


Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/task_manager
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update

3️⃣ Run the application
mvn spring-boot:run


Open in browser:

http://localhost:8080/login

🔐 Authentication Flow

Register a new user

Login with username and password

Access task dashboard

Create / edit / delete tasks

Logout

🌙 Dark Mode

Can be toggled from the main page

Preference is stored in localStorage

Dark mode remains active after refresh

📌 Git Workflow

This project uses a simple Git workflow:

main – stable version

feature/* – new features

docs/* – documentation

chore/* – maintenance tasks

Each feature was developed on a separate branch and merged into main.

📈 What I Learned

How Spring Boot MVC works

How authentication flow is implemented

How to connect a Spring application to MySQL

How CRUD operations work with JPA

How to structure a backend project

How to use Git branches and commits properly

🔮 Possible Improvements

Password encryption (BCrypt)

Role-based access (ADMIN / USER)

Pagination and search

REST API version

Unit tests

👨‍💻 Author

Victor Demerji
Junior Java Developer
📍 Republic of Moldova

⭐ Notes

This project is intended for learning purposes and junior-level portfolio presentation.
