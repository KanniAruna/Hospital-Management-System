package hospital;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatientDAO patientDAO = new PatientDAO();
        DoctorDAO doctorDAO = new DoctorDAO();
        AppointmentDAO appointmentDAO = new AppointmentDAO();

        while (true) {
            System.out.println("\n=== Hospital Management System ===");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Add Doctor");
            System.out.println("4. View Doctors");
            System.out.println("5. Add Appointment");
            System.out.println("6. View Appointments");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        // Add Patient
                        System.out.print("Enter Patient Name: ");
                        String pname = sc.nextLine();
                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Gender: ");
                        String gender = sc.nextLine();

                        Patient newPatient = new Patient(pname, age, gender);
                        patientDAO.addPatient(newPatient);
                        System.out.println("✅ Patient added successfully!");
                        break;

                    case 2:
                        // View Patients
                        List<Patient> patients = patientDAO.getAllPatients();
                        System.out.println("\n--- Patients ---");
                        for (Patient p : patients) {
                            System.out.println(p);
                        }
                        break;

                    case 3:
                        // Add Doctor
                        System.out.print("Enter Doctor Name: ");
                        String dname = sc.nextLine();
                        System.out.print("Enter Specialization: ");
                        String specialization = sc.nextLine();

                        Doctor newDoctor = new Doctor(dname, specialization);
                        doctorDAO.addDoctor(newDoctor);
                        System.out.println("✅ Doctor added successfully!");
                        break;

                    case 4:
                        // View Doctors
                        List<Doctor> doctors = doctorDAO.getAllDoctors();
                        System.out.println("\n--- Doctors ---");
                        for (Doctor d : doctors) {
                             System.out.println(d);
                        }
                        break;

                    case 5:
                        // Add Appointment
                        System.out.print("Enter Patient ID: ");
                        int pid = sc.nextInt();
                        System.out.print("Enter Doctor ID: ");
                        int did = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Date (YYYY-MM-DD): ");
                        String date = sc.nextLine();

                        Appointment newApp = new Appointment(pid, did, date);
                        appointmentDAO.addAppointment(newApp);
                        System.out.println("✅ Appointment added successfully!");
                        break;

                    case 6:
                        // View Appointments
                        List<Appointment> apps = appointmentDAO.getAllAppointments();
                        System.out.println("\n--- Appointments ---");
                        for (Appointment a : apps) {
                            System.out.println(a);
                        }
                        break;

                    case 7:
                        System.out.println("👋 Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("❌ Invalid choice, try again.");
                }
            } catch (SQLException e) {
                System.out.println("⚠ Database Error: " + e.getMessage());
            }
        }
    }
}
