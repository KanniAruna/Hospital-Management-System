# Hospital Management System

Hospital Management System project in **Java** using **Core Java (OOP + JDBC)** and **MySQL** as the backend to manage hospital records.  
This is a **console-based application (CLI)** where users interact through menus instead of a graphical interface.  
The application follows an **Object-Oriented Design** with **DAO classes** handling database operations.

The main objective of this project is to manage the basic hospital activities such as **patients, doctors, and appointments** directly from the terminal.



## Users
There are three main entities in the system:
- **Patient:** Can be registered with details like name, age, gender.  
- **Doctor:** Stores doctor’s name and specialization.  
- **Appointment:** Links a patient and doctor together with a specific date.  



## Modules

### 1. Patient Management
- Add new patients
- View list of patients

### 2. Doctor Management
- Add new doctors
- View list of doctors

### 3. Appointment Management
- Schedule new appointments by linking patient and doctor IDs
- View all appointments  



## Technology  
- **Frontend:** Command Line Interface (CLI)  
- **Backend:** MySQL  
- **Programming Language:** Java (Core Java, JDBC, Collections)  
- **Database Connectivity:** MySQL Connector/J (JDBC Driver)  



## Architecture
- **DatabaseConnection.java** → Handles MySQL connection using JDBC  
- **DAO Classes (PatientDAO, DoctorDAO, AppointmentDAO)** → Perform CRUD operations  
- **Model Classes (Patient, Doctor, Appointment)** → Represent entities with attributes  
- **Main.java** → Provides a menu-driven CLI interface for users to perform operations  



## Screenshot
<img width="1055" height="397" alt="Screenshot 2025-09-21 184812" src="https://github.com/user-attachments/assets/cd680d51-d5a2-4f64-aff8-e0a374daee3c" />  



## How to Run
1. Install **Java JDK** and **MySQL**.  
2. Create the database and update credentials in `DatabaseConnection.java`.  
3. Compile the Java files:
   ```bash
   javac *.java



