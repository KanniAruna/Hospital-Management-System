# Hospital-Management-System
Hospital Management System project in Java using Core Java (OOP + JDBC) and MySQL as the backend to manage hospital records.
This is a console-based application (CLI) where users interact through menus instead of a graphical interface.
The application follows an Object-Oriented design with DAO classes handling database operations.

The main objective of this project is to manage the basic hospital activities such as patients, doctors, and appointments directly from the terminal.

### Users
There are three main entities in the system:
Patient : Can be registered with details like name, age, gender.
Doctor :Stores doctor’s name and specialization.
Appointment : Links a patient and doctor together with a specific date.

### Modules
#### 1.Patient Management
Add new patients.
View list of patients.
#### 2.Doctor Management
Add new doctors.
View list of doctors.
#### 3.Appointment Management
Schedule new appointments by linking patient and doctor IDs.
View all appointments.

### Technology 
Frontend: Command Line Interface (CLI)
Backend: MySQL
Programming Language: Java (Core Java, JDBC, Collections)
Database Connectivity: MySQL Connector/J (JDBC Driver)

### Architecture

DatabaseConnection.java → Handles MySQL connection using JDBC.
DAO Classes (PatientDAO, DoctorDAO, AppointmentDAO) → Perform CRUD operations.
Model Classes (Patient, Doctor, Appointment) → Represent entities with attributes.
Main.java → Provides a menu-driven CLI interface for users to perform operations.


Screenshot:
<img width="1055" height="397" alt="Screenshot 2025-09-21 184812" src="https://github.com/user-attachments/assets/cd680d51-d5a2-4f64-aff8-e0a374daee3c" />


# Admin
Admin is the main actor who will be responsible for managing Doctors and Receptionists.  
Below is the task list which will be performed by admin.

- Admin can ADD/DELETE/UPDATE a doctor.
- Admin can VIEW the list of doctors.
- Admin can ADD/DELETE/UPDATE a receptionist.
- Admin can VIEW the list of receptionists.
- Admin can ADD/DELETE/UPDATE a patient.
- Admin can ADD/DELETE/UPDATE appointments.

---

## Doctor
- Doctor can check the appointment and the patient list.
- Doctor can VIEW the appointments.
- The doctor can VIEW the patient list.

---

## Receptionist
- Receptionist can ADD/EDIT/VIEW appointments.
- Receptionist can ADD/EDIT/VIEW patients.

---

## Technology



