package hospital;

public class Patient {
    private int id;
    private String name;
    private int age;
    private String gender;

    // Constructor without id (for new inserts, id is auto-increment in DB)
    public Patient(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Constructor with id (for reading from DB)
    public Patient(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Age: " + age + " | Gender: " + gender;
    }
}
