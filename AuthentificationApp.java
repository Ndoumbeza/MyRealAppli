package com.example.myapplication;

import com.example.myapplication.AdminInterface;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AuthentificationApp extends Application {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Authentification");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);

        Label firstNameLabel = new Label("Prénom:");
        TextField firstNameField = new TextField();
        GridPane.setConstraints(firstNameLabel, 0, 0);
        GridPane.setConstraints(firstNameField, 1, 0);

        Label lastNameLabel = new Label("Nom:");
        TextField lastNameField = new TextField();
        GridPane.setConstraints(lastNameLabel, 0, 1);
        GridPane.setConstraints(lastNameField, 1, 1);

        Label passwordLabel = new Label("Mot de passe (8 caractères avec chiffres et lettres):");
        PasswordField passwordField = new PasswordField();
        GridPane.setConstraints(passwordLabel, 0, 2);
        GridPane.setConstraints(passwordField, 1, 2);

        Button loginButton = new Button("Se connecter");
        GridPane.setConstraints(loginButton, 1, 3);

        Label messageLabel = new Label();
        GridPane.setConstraints(messageLabel, 0, 4, 2, 1);

        grid.getChildren().addAll(firstNameLabel, firstNameField, lastNameLabel, lastNameField,
                passwordLabel, passwordField, loginButton, messageLabel);

        loginButton.setOnAction(event -> {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String password = passwordField.getText();

            // Vérification des informations d'authentification
            if (validateAuthentication(firstName, lastName, password)) {
                messageLabel.setText("Authentification réussie !");
                openAdminInterface(primaryStage); // Ouvrir l'interface d'administration
            } else {
                messageLabel.setText("Échec de l'authentification. Veuillez réessayer.");
            }
        });

        Scene scene = new Scene(grid, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Fonction de validation des informations d'authentification
    private boolean validateAuthentication(String firstName, String lastName, String password) {

        return true;
    }

    // Ouvrir l'interface d'administration
    private void openAdminInterface(Stage primaryStage) {
        // Fermer la fenêtre d'authentification
        primaryStage.close();

        // Créer une nouvelle fenêtre pour l'interface d'administration
        Stage adminStage = new Stage();
        adminStage.setTitle("Gestionnaire Admin");

        // Créer et configurer l'interface d'administration
        AdminInterface adminInterface = new AdminInterface(); // Créer une instance de votre classe Admin
        adminInterface.start(adminStage); // Lancer l'interface d'administration dans la nouvelle fenêtre

        // Afficher la nouvelle fenêtre
        adminStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}