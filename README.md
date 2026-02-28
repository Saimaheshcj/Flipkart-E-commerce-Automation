
Ecommerce Automation Framework (Flipkart-Style)

 Project Overview

This project is a Selenium Test Automation Framework designed to automate real-world ecommerce workflows similar to platforms like Flipkart.

The framework automates key user actions such as login, product selection, add-to-cart, and cart verification using a structured and scalable design approach.

Built using **Java, Selenium WebDriver, TestNG, and Maven**, this project follows the **Page Object Model (POM)** architecture.



 Features Automated

* ✅ User Login
* ✅ Product Selection
* ✅ Add Product to Cart
* ✅ Cart Validation
* ✅ Alert Handling
* ✅ Implicit Wait Implementation
* ✅ Custom Slow Execution Control
* ✅ Screenshot Utility
* ✅ Modular Framework Structure

  
--Framework Architecture

This framework follows industry best practices:

* Page Object Model (POM)
* Reusable Base Class
* Utility Layer (Screenshot Handling)
* TestNG Execution
* Maven Dependency Management
* WebDriverManager Integration

### 📂 Project Structure

```plaintext
ecommerce
 ├── src/test/java
 │     ├── base
 │     │     └── BaseClass.java
 │     ├── pages
 │     │     ├── LoginPage.java
 │     │     ├── HomePage.java
 │     │     └── CartPage.java
 │     ├── tests
 │     │     └── EcommerceTest.java
 │     └── utils
 │           └── ScreenshotUtil.java
 ├── testng.xml
 └── pom.xml


-- Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* WebDriverManager
* ChromeDriver



## 🔄 Test Execution Flow

1. Launch browser
2. Navigate to ecommerce application
3. Perform login
4. Select product
5. Add product to cart
6. Verify cart
7. Close browser



