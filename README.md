# SpringMart

SpringMart is an advanced E-Commerce Microservices Platform leveraging Spring Boot, Spring Cloud, and Keycloak for secure, scalable, and reliable online shopping experiences.

## 🌟 Our Mission

1. **Scalability**: Ensure seamless and scalable shopping experiences.
2. **Modularity**: Enable independent development and deployment of services.

## 🚀 Key Features

- **User Authentication**: Secure login with Keycloak for SSO and role management.
- **API Gateway**: Centralized routing for security and load balancing.
- **Service Discovery**: Dynamic microservices discovery with Eureka Server.
- **Config Management**: Centralized configs using Spring Cloud Config.
- **Microservices**: Independent Product, Order, Customer, Payment, and Notification services.
- **Async Communication**: Kafka for event-driven updates and notifications.
- **Real-time Notifications**: Dedicated service for sending alerts and updates on orders and payments.
- **Data Storage**: MongoDB for scalable data management.
- **Distributed Tracing**: Zipkin for performance monitoring.
- **Containerization**: Docker for consistent deployment environments.

## 🛠️ Technology Stack

- Spring Boot
- Spring Cloud
- Java
- PostgreSQL
- MongoDB
- Keycloak
- Eureka Server
- Kafka
- Docker
- Zipkin
- Postman (for API testing)

## 🏗️ Architecture

SpringMart is built on a microservices architecture, focusing on:

- Scalability
- Modularity
- Independent service development and deployment
- Efficient service management
- Seamless user experiences

## 🚀 Getting Started

### Prerequisites

- Java JDK 11 or later
- Docker and Docker Compose
- Maven

### Setup

1. Clone the repository:
   ```
   git clone https://github.com/AmitTomar805/e-commerce-app-spring-boot.git
   ```

2. Start the infrastructure services:
   ```
   docker-compose up -d
   ```

3. Build and run each microservice:
   ```
   cd product-service
   mvn spring-boot:run
   ```
   Repeat for other services (order, customer, payment, notification).

4. Access the API Gateway:
   ```
   http://localhost:8080
   ```

5. Access Eureka dashboard:
   ```
   http://localhost:8761
   ```

6. Access Zipkin dashboard:
   ```
   http://localhost:9411
   ```
## Maintainers
- Amit Singh Tomar(tomar.am@northeastern.edu)