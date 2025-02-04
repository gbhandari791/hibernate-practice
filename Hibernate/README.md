# Hibernate Practice Project 🚀

This repository contains **standalone examples** demonstrating various **Hibernate concepts**. 
The project is built using **Java 8** and **MySQL** to practice and showcase key Hibernate features. 
The aim is to provide clear examples and help anyone looking to understand Hibernate ORM in a hands-on way.

## 📖 Key Concepts Covered:
- **Hibernate Basics & Configuration**  
- **Annotations:**  
   - Basic & Advanced Hibernate Annotations  
   - `@OneToOne`, `@ManyToMany`, `@Embeddable`
- **Fetching Objects:**  
   - `get()` vs `load()`
- **Entity Lifecycle:**  
   - Hibernate States (Persistent, Detached, Transient)
- **Hibernate Querying:**  
   - **HQL** (Hibernate Query Language)  
   - **Native Queries**
- **Entity Relationships:**  
   - `@OneToMany`, `@ManyToOne`, `@JoinColumn`
   - Cascade Operations
- **Caching:**  
   - First-Level and Second-Level Caching in Hibernate
- **Criteria API:**  
   - Dynamic Querying using Criteria API

## 🚀 Technologies Used:
- **Java 8**	– The project is developed using Java 8.
- **MySQL**		– MySQL is used as the database for this project.
- **Hibernate**	– The ORM framework used for object-relational mapping.

## 🛠️ Setup Instructions:

### 1. **Install Java 8:**
   Make sure you have **Java 8** installed. You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html).

### 2. **MySQL Setup:**
   - Install **MySQL** and create a database named `test`.
   - Configure your **Hibernate settings** in the `hibernate.cfg.xml` file to connect to your local MySQL database.
   
   Example configuration:
   ```xml
   <hibernate-configuration>
       <session-factory>
           <property name="hibernate.dialect">org.hibernate.dialect.MySQL5Dialect</property>
           <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
           <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/test</property>
           <property name="hibernate.connection.username">yourusername</property>
           <property name="hibernate.connection.password">yourpassword</property>
       </session-factory>
   </hibernate-configuration>

### 3. **Running the Project:**
   - Once the **MySQL** database is set up, you can run individual examples from the project to see how **Hibernate ORM** works in practice.

### 4. **Notes & Learnings:**
   I’ve also documented my **learning journey** with handwritten notes that cover all these concepts. Feel free to explore them:   
   You can find them in the `Hibernate/notes/` folder in this repository.
