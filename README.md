# 📋 Microservices Architecture with Spring Cloud

A project demonstrating microservices architecture using Spring Cloud components, including Eureka, Spring Cloud Gateway, and multiple services.

## 👥 Team Members

- **Mohamed Saber Mohamed Ahmed Moustafa**
- **Abdelrahman Ashraf Mohamed Shawky Elmohandes**
- **Omar Salah Abdel Tawab**
- **Mahmoud Essam Sayed Mensheteh**

## 🛠️ Prerequisites

Ensure you have the following installed:

- **Java JDK 8** or higher
- **MySQL Server**
- **Maven 3**

## 📂 Repositories

- **[Eureka Server](https://github.com/Almohandis/eureka-server)**: Manages service discovery.
- **[Gateway API](https://github.com/Mohamed-Saber-97/gateway)**: Provides routing, filtering, and load balancing.
- **[Admin Service](https://github.com/Mohamed-Saber-97/admin-cloud)**: Handles admin-related functionality.
- **[Cloud Service](https://github.com/Almohandis/spring-cloud)**: Manages cloud-based services.

## 🚀 Running the Project

### Step 1: Clone All Repositories

1. Clone each repository to your local machine.

### Step 2: Set Up Databases

Create the necessary MySQL databases:

```sql
CREATE DATABASE admin;
CREATE DATABASE cars;
```

### Step 3: Start Services

For each repository, follow the steps below to start the corresponding service:

1. **Eureka Server**:
    ```bash
    mvn spring-boot:run
    ```

2. **Gateway API**:
    ```bash
    mvn spring-boot:run
    ```

3. **Admin Service**:
    ```bash
    mvn spring-boot:run
    ```

4. **Cloud Service**:
    ```bash
    mvn spring-boot:run
    ```

### Step 4: Testing

Use **Postman** to send requests and test the application. Example endpoint:

- **Admin Service**: `http://localhost:8089/admin`

