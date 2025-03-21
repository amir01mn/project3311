package models;

public class User {
    protected String name;
    protected String email;
    protected String password;
    protected String type;
    protected int userID;

    public User() {
        // Default constructor
    }

    public User(String name, String email, String password, String type, int userID) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.type = type;
        this.userID = userID;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getUserID() { return userID; }
    public void setUserID(int userID) { this.userID = userID; }
}
