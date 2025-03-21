package models;

public class FacultyMember extends User {
    public static final int RATE = 8;
    public static final String TYPE = "Faculty Member";

    public FacultyMember(String name, String email, String password, int userID) {
        super(name, email, password, TYPE, userID);
    }

    public boolean validate() {
        // Add faculty member-specific validation logic if needed
        return true;
    }
}