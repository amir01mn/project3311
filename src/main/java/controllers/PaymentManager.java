package controllers;

public class PaymentManager {

    public boolean refundDeposit(double deposit) {
        System.out.println("Refunding deposit: " + deposit);
        return true;
    }

    public boolean processPayment(double deposit, String paymDetails) {
        System.out.println("Processing payment: " + deposit + " with details: " + paymDetails);
        return true;
    }

    public String verifyPaymentStatus() {
        return "Payment Successful";
    }

    public void notifyPaymentFailure() {
        System.out.println("Payment failed, notifying user.");
    }

    public void chargeSecondPayment(String bookingID) {
        System.out.println("Charging second payment for booking: " + bookingID);
    }

    public void checkout(String sptID, java.util.Date date, java.time.LocalTime start, java.time.LocalTime end) {
        System.out.println("Checking out for space: " + sptID);
    }
}
