# E-Commerce Automation & MySQL Validation – Selenium Test Project

This repository contains an end-to-end automation framework developed as part of a QA Automation assignment.  
The project uses Selenium WebDriver, TestNG, and MySQL to validate both frontend and backend functionality.

---

## 🚀 Project Overview

The objective of this project is to automate an e-commerce order placement flow on **automationexercise.com**.  
The automated script performs the following:

- Launches the application  
- Searches for a product  
- Opens the product details page  
- Adds the product to cart  
- Proceeds to checkout  
- Logs in using an existing user  
- Places the order  
- Captures:
  - Page titles  
  - Success messages  
  - Total order amount  

A MySQL database is also used to simulate the backend order storage system.

---

## 🧰 Tech Stack Used

| Category | Technology |
|---------|------------|
| Programming Language | Java |
| Automation Framework | Selenium WebDriver |
| Test Runner | TestNG |
| Architecture | Page Object Model (POM) |
| Build Tool | Maven |
| Database | MySQL Workbench |

---

## 📁 Project Structure

automationtesting_task1  
• src/main/java/org/adidar/pages → Page Object Model classes  
• src/test/java/org/adidar/tests → Test classes  
• pom.xml → Maven dependencies  
• testng.xml → TestNG suite file  



## 📝 Features Implemented

### ✔ UI Automation (Selenium)
- Full end-to-end order placement  
- Assertions added for validation  
- Clean Page Object Model  
- Dynamic waits to avoid stale or intercepted element errors  
- Organized and readable test flow  

### ✔ Database Validation (MySQL)
- Created "orders" table  
- Inserted multiple sample orders  
- SQL queries included:
  - Fetch all orders  
  - Fetch successful orders  
  - Fetch last 24-hour orders  
  - Group total amount spent by user  
  - Remove duplicate entries  
  - Add unique constraint on "order_id"



## 🧪 How to Run the Tests

### Step 1 — Clone the repository

git clone https://github.com/jojoman1/automationtesting_task1.git


### Step 2 — Install dependencies

mvn clean install


### Step 3 — Run the TestNG suite

mvn test


Alternatively, run "testng.xml" directly inside IntelliJ IDEA.



## 🖼️ Screenshots Included

The repository includes the following screenshots:

- Product added confirmation  
- Payment page  
- Order success page  
- Test execution screen  



## ✔ Assignment Completion Summary

| Task | Status |
|------|--------|
| Selenium Automation | ✔ Completed |
| POM Architecture | ✔ Implemented |
| TestNG Assertions | ✔ Used |
| SQL Table + Insert Queries | ✔ Completed |
| SQL Data Fetch Queries | ✔ Completed |
| Duplicate Removal | ✔ Done |
| Documentation | ✔ Completed |


--jojo--
