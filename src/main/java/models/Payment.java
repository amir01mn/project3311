package models;

public class Payment {
    private String paymentID;
    private double amount;
    private double deposit;
    private String method;
    private String paymDetails;

    public Payment(String paymentDetails) {
        // Generate a paymentID and store payment details
        this.paymentID = "PAY" + System.currentTimeMillis();
        this.paymDetails = paymentDetails;
    }

    // Getters and setters
    public String getPaymentID() { return paymentID; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
    public double getDeposit() { return deposit; }
    public void setDeposit(double deposit) { this.deposit = deposit; }
    public String getMethod() { return method; }
    public void setMethod(String method) { this.method = method; }
    public String getPaymDetails() { return paymDetails; }
}
