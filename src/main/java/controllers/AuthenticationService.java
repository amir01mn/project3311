package controllers;

import models.User;
import java.util.HashMap;
import java.util.Map;

public class AuthenticationService {
    private static AuthenticationService instance;
    private Map<String, User> userData;

    private AuthenticationService() {
        userData = new HashMap<>();
    }

    public static AuthenticationService getInstance() {
        if(instance == null) {
            instance = new AuthenticationService();
        }
        return instance;
    }

    private String encryptPassword(String password) {
        return "enc_" + password;
    }

    private boolean validateLogin(User user) {
        return userData.containsKey(user.getEmail());
    }

    public boolean authenticate(String userID, String password) {
        for(User user : userData.values()) {
            if(String.valueOf(user.getUserID()).equals(userID) &&
                    user.getPassword().equals(encryptPassword(password))) {
                return true;
            }
        }
        return false;
    }

    public boolean checkRecord(String userID, String password) {
        return authenticate(userID, password);
    }

    public boolean checkEmail(String email) {
        return userData.containsKey(email);
    }

    public boolean validateEmail(String email) {
        return email.contains("@");
    }

    public boolean validateClient(String email) {
        return validateEmail(email);
    }

    public void addUser(User user) {
        userData.put(user.getEmail(), user);
    }
}
