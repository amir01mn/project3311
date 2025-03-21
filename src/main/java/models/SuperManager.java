package models;

public class SuperManager extends Manager {
    public SuperManager(String name, String email, String password) {
        super(name, email, password);
    }

    public boolean autoAccountGenerator() {
        // Logic for auto account generation
        System.out.println("Auto account generated for SuperManager.");
        return true;
    }
}