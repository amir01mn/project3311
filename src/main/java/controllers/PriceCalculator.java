package controllers;

import java.time.Duration;
import java.time.LocalTime;

public class PriceCalculator {
    private double amount;
    private double deposit;

    public PriceCalculator() {
    }

    public double calculateTotalPrice(LocalTime start, LocalTime end, String userType) {
        long hours = Duration.between(start, end).toHours();
        double rate = checkRate(userType);
        amount = hours * rate;
        return amount;
    }

    public double checkRate(String userType) {
        switch(userType) {
            case "Student": return 5.0;
            case "Faculty Member": return 8.0;
            case "Non-Faculty Staff": return 10.0;
            case "Visitor": return 15.0;
            default: return 0.0;
        }
    }

    public double calculateTotalPayment(String userType, LocalTime start, LocalTime end, double deposit) {
        double totalPrice = calculateTotalPrice(start, end, userType);
        return totalPrice - deposit;
    }

    public double calculateSecondPayment(double totalPrice, double deposit) {
        return totalPrice - deposit;
    }
}
