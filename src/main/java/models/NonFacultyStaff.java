package models;

public class NonFacultyStaff extends User {
    public static final int RATE = 10;
    public static final String TYPE = "Non-Faculty Staff";

    public NonFacultyStaff(String name, String email, String password, int userID) {
        super(name, email, password, TYPE, userID);
    }

    public boolean validate() {
        // Add non-faculty staff-specific validation logic if needed
        return true;
    }
}