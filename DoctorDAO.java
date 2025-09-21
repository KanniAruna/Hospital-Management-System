package hospital;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DoctorDAO {

    // Add doctor
    public void addDoctor(Doctor doctor) throws SQLException {
        Connection conn = DatabaseConnection.getConnection();
        String query = "INSERT INTO doctors (name, specialization) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, doctor.getName());
        stmt.setString(2, doctor.getSpecialization());
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }

    // Get all doctors
    public List<Doctor> getAllDoctors() throws SQLException {
        List<Doctor> doctors = new ArrayList<>();
        Connection conn = DatabaseConnection.getConnection();
        String query = "SELECT * FROM doctors";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            Doctor d = new Doctor(
                rs.getInt("id"),          // ✅ fetch ID
                rs.getString("name"),
                rs.getString("specialization")
            );
            doctors.add(d);
        }

        rs.close();
        stmt.close();
        conn.close();
        return doctors;
    }
}
