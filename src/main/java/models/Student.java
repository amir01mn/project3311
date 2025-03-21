package models;

public class Student extends User {
    public static final int RATE = 5;
    public static final String TYPE = "Student";

    public Student(String name, String email, String password, int userID) {
        super(name, email, password, TYPE, userID);
    }

    public boolean validate() {
        // Add student-specific validation logic if needed
        return true;
    }
}