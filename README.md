# Spring Boot Security with JWT Implementation

This project is a simple implementation of Spring Boot Security using JWT (JSON Web Tokens) for authentication and authorization.

## Usage
- User Registration: The application allows users to create an account by providing their basic information, such as name and password.
- Password Encryption: Passwords are encrypted using Bcrypt.
- Authenticates a user and returns a JWT token.
- Once Authenticated, users can access ednpoint 
- Refresh token.

## Technologies used

- Spring Boot 2.4.5 
- MySQL Workbench
- Spring Security
- JSON Web Tokens (JWT)
- DataJpa

## Sample Postman Requests
- Register User

![registerUser](https://user-images.githubusercontent.com/92798791/230507833-0fd634c3-aea7-461c-8ed8-bef37f384d2e.PNG)

- Authenticate User

![authenticateUser](https://user-images.githubusercontent.com/92798791/230508235-dc0c90d1-d54c-40f3-826b-4a9f31cd42e7.PNG)

- Access protected API

![forUserURL](https://user-images.githubusercontent.com/92798791/230508422-1bd220f3-6555-43db-a930-8be6830c12ad.PNG)

## MySQL 

- User Table

![userMySQL](https://user-images.githubusercontent.com/92798791/230508645-905ee88c-419a-4eaa-bf7d-7f29ec31204c.PNG)

- Roles Table

![userRolesMySQL](https://user-images.githubusercontent.com/92798791/230508824-6d8a4ef3-4539-487f-948b-b6df8cef1848.PNG)

## Getting Started

To get started with this project, clone the repository and navigate to the root directory:

- Repository  https://github.com/gilm57/Hypers
- Java 11 or later
- Maven 3.6 or later
- Git


