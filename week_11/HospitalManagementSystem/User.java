package week_11.HospitalManagementSystem;

public class User {
    private final int ID;
    private final String name;

    public User(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }
}
