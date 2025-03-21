package factory;

import models.User;
import models.Student;
import models.FacultyMember;
import models.NonFacultyStaff;
import models.Visitor;

public class UserFactory {
    public static User createUser(String type, String name, String email, String password, int userID) {
        switch(type) {
            case "Student":
                return new Student(name, email, password, userID);
            case "Faculty Member":
                return new FacultyMember(name, email, password, userID);
            case "Non-Faculty Staff":
                return new NonFacultyStaff(name, email, password, userID);
            case "Visitor":
                return new Visitor(name, email, password, userID);
            default:
                return null;
        }
    }
}
