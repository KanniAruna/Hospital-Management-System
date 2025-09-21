package hospital;

public class Doctor {
    private int id;
    private String name;
    private String specialization;

    // Constructor without ID (for new inserts)
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    // Constructor with ID (for fetching from DB)
    public Doctor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Specialization: " + specialization;
    }
}
