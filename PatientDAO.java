package hospital;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientDAO {

    // ✅ Add patient (id will auto-increment in DB)
    public void addPatient(Patient patient) throws SQLException {
        Connection conn = DatabaseConnection.getConnection();
        String query = "INSERT INTO patients (name, age, gender) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, patient.getName());
        stmt.setInt(2, patient.getAge());
        stmt.setString(3, patient.getGender());
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }

    // ✅ Retrieve all patients
    public List<Patient> getAllPatients() throws SQLException {
        List<Patient> patients = new ArrayList<>();
        Connection conn = DatabaseConnection.getConnection();
        String query = "SELECT * FROM patients";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
    Patient p = new Patient(
        rs.getInt("id"),          // ✅ fetch auto-increment id
        rs.getString("name"),
        rs.getInt("age"),
        rs.getString("gender")
    );
    patients.add(p);
}

        rs.close();
        stmt.close();
        conn.close();
        return patients;
    }
}
