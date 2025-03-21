package controllers;

import models.User;

public class RegistrationSystem {
    public RegistrationSystem() {
        // Constructor
    }

    public boolean register(User user) {
        System.out.println("Registering user: " + user.getEmail());
        return true;
    }

    public boolean login(User user) {
        System.out.println("Logging in user: " + user.getEmail());
        return true;
    }

    public void logout(User user) {
        System.out.println("Logging out user: " + user.getEmail());
    }

    private boolean enterEmail(String email) {
        return email.contains("@");
    }

    private void sendVerificationEmail() {
        System.out.println("Verification email sent.");
    }

    public boolean createAccount(String email) {
        if(enterEmail(email)) {
            sendVerificationEmail();
            return true;
        }
        return false;
    }

    public void setPassword(String password) {
        // Set password logic
    }

    public void savePassword(String password) {
        // Save password logic
    }
}
