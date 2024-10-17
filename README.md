# Financial Management System

## Description  
This project is under development and consists of a **financial management system** using **Java**, **Spring Boot** and **Maven**. The application aims to help users track and **manage their daily earnings and expenses**, promoting a more efficient personal financial organization and offering a clear and detailed view of finances.

---

## Features  
- **Income Registration**: Record income sources and their respective amounts.  
- **Expense Registration**: Store expenses with customizable categories.  
- **Financial Reports**: View daily, weekly, or monthly summaries.  
- **Alerts**: Notifications for overspending or unmet goals.  
- **Charts**: Graphical analysis of cash flow.  

---

## Technologies Used  
- **Java 21**  
- **Spring Boot**  
- **Maven**  
- **SQL Server** (for data persistence)  
- **Thymeleaf** (for frontend)  

---

## Prerequisites  
- **Java 21** installed  
- **Maven** installed  
- **SQL Server** database configured  
- **Visual Studio Code** (or any other preferred IDE)  

---

## How to Run  

1. Clone the repository:  
   ```bash
   git clone https://github.com/IamLeonardoSouza/financial_management.git
   cd financial-management-system
   ```

2. Install the dependencies:  
   ```bash
   mvn clean install
   ```

3. Configure the database in the `application.properties` or `application.yml` file:  
   ```properties
   spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=your-database
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   ```

4. Run the project:  
   ```bash
   mvn spring-boot:run
   ```

---

## Contribution  
Contributions are welcome! Feel free to open **Issues** and **Pull Requests**.

---

## License  
This project is licensed under the **MIT License** – see the [LICENSE](LICENSE) file for details.
