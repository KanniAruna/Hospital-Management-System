package hospital;

public class Appointment {
    private int id;
    private int patientId;
    private int doctorId;
    private String date;

    // Constructor without ID (for new inserts)
    public Appointment(int patientId, int doctorId, String date) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
    }

    // Constructor with ID (for fetching from DB)
    public Appointment(int id, int patientId, int doctorId, String date) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
    }

    // Getters
    public int getId() { return id; }
    public int getPatientId() { return patientId; }
    public int getDoctorId() { return doctorId; }
    public String getDate() { return date; }

    @Override
    public String toString() {
        return "ID: " + id + " | Patient ID: " + patientId + " | Doctor ID: " + doctorId + " | Date: " + date;
    }
}
