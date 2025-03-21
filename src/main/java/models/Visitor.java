package models;

public class Visitor extends User {
    public static final int RATE = 15;
    public static final String TYPE = "Visitor";

    public Visitor(String name, String email, String password, int userID) {
        super(name, email, password, TYPE, userID);
    }
}