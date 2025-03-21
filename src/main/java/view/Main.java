package view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    // Store the primary stage so we can switch scenes easily.
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("YorkU Parking Booking System");
        // Initially load the homepage
        loadHomepage();
        primaryStage.show();
    }

    /**
     * Loads the Homepage scene.
     */
    public void loadHomepage() {
        // Create a label and a button for the homepage
        Label homeLabel = new Label("Welcome to the YorkU Parking Booking System");
        Button dashboardBtn = new Button("Go to Dashboard");
        dashboardBtn.setOnAction(e -> loadDashboard());

        // Layout for homepage: a VBox centered within a BorderPane
        VBox homeLayout = new VBox(20);
        homeLayout.setPadding(new Insets(20));
        homeLayout.getChildren().addAll(homeLabel, dashboardBtn);
        homeLayout.setStyle("-fx-alignment: center;");

        BorderPane homePane = new BorderPane();
        homePane.setCenter(homeLayout);

        Scene homeScene = new Scene(homePane, 600, 400);
        primaryStage.setScene(homeScene);
    }

    /**
     * Loads the Dashboard scene.
     */
    public void loadDashboard() {
        // Create a label and a button for the dashboard
        Label dashboardLabel = new Label("Dashboard");
        Button homeBtn = new Button("Back to Homepage");
        homeBtn.setOnAction(e -> loadHomepage());

        // You can expand this layout to include more dashboard functionality
        VBox dashboardLayout = new VBox(20);
        dashboardLayout.setPadding(new Insets(20));
        dashboardLayout.getChildren().addAll(dashboardLabel, homeBtn);
        dashboardLayout.setStyle("-fx-alignment: center;");

        BorderPane dashboardPane = new BorderPane();
        dashboardPane.setCenter(dashboardLayout);

        Scene dashboardScene = new Scene(dashboardPane, 600, 400);
        primaryStage.setScene(dashboardScene);
    }

    /**
     * Simulate an hourly backup process.
     * This method can be scheduled to run periodically using a Timer or a ScheduledExecutorService.
     * @param parkingLotCount The number of parking lots to back up.
     */
    public void hourlyBackUp(int parkingLotCount) {
        System.out.println("Performing hourly backup for " + parkingLotCount + " parking lots.");
        // Actual backup logic would go here
    }

    public static void main(String[] args) {
        launch(args);
    }
}
