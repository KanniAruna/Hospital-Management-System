package hospital;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AppointmentDAO {
    public void addAppointment(Appointment appointment) throws SQLException {
        Connection conn = DatabaseConnection.getConnection();
        String query = "INSERT INTO appointments (patient_id, doctor_id, date) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, appointment.getPatientId());
        stmt.setInt(2, appointment.getDoctorId());
        stmt.setString(3, appointment.getDate());
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }

    public List<Appointment> getAllAppointments() throws SQLException {
        List<Appointment> appointments = new ArrayList<>();
        Connection conn = DatabaseConnection.getConnection();
        String query = "SELECT * FROM appointments";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
    int id = rs.getInt("id");
    System.out.println("DEBUG - DB ID: " + id);  // 👈 debug line
    Appointment a = new Appointment(
        id,
        rs.getInt("patient_id"),
        rs.getInt("doctor_id"),
        rs.getString("date")
    );
    appointments.add(a);
}


        rs.close();
        stmt.close();
        conn.close();
        return appointments;
    }
}

