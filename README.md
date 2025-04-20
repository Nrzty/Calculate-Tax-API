# 💳 Tax Calculator API 

A simple that i decided to create this project as a way to study unit tests using JAVA and Spring Boot. This is a REST API built with Spring Boot to calculate taxes based on a product's category. This project follows clean code principles, includes automated tests (TDD), validation, and global exception handling.

## 🚀 Running the project locally

You can run this application in two ways:

### ✅ Using the terminal

Make sure you have **Java 21** and **Maven** installed.

```bash
mvn spring-boot:run
```

### 🖥️ Using an IDE (IntelliJ, Eclipse, VSCode)

1. Import the project as a Maven project.
2. Run the main class `StartUp.java`.

---

## 📦 Example: POST Request

**Endpoint**: `/calculate`\
**Method**: POST\
**Content-Type**: `application/json`

### Request body:

```json
{
  "productName": "Notebook",
  "price": 2000.0,
  "category": "ELECTRONICS"
}
```

### Response:

```json
{
  "productName": "Notebook",
  "price": 2000.0,
  "category": "ELECTRONICS",
  "taxAmount": 300.0,
  "totalPrice": 2300.0
}
```

---

## 🛠 Technologies

- Java 21
- Spring Boot
- Spring Web
- Spring Validation
- JUnit 5
- MockMvc
- Maven

---

## ✅ Running the tests

### Using terminal:

```bash
mvn test
```

### Using IDE:
```bash
Run `TaxCalculatorServiceTest` or `TaxCalculatorControllerTest` directly.
```


