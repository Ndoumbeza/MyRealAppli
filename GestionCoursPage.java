package com.example.myapplication;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class GestionCoursPage extends GridPane {

    public GestionCoursPage() {
        setPadding(new Insets(20));
        setVgap(10);
        setHgap(10);

        // Champ de saisie pour le nom du cours
        TextField nomField = new TextField();
        nomField.setPromptText("Nom du cours");
        add(new Label("Nom du cours:"), 0, 0);
        add(nomField, 1, 0);

        // Champ de saisie pour l'ID du cours
        TextField idField = new TextField();
        idField.setPromptText("ID du cours");
        add(new Label("ID du cours:"), 0, 1);
        add(idField, 1, 1);

        // Champ de saisie pour le professeur du cours
        TextField professeurField = new TextField();
        professeurField.setPromptText("Professeur du cours");
        add(new Label("Professeur du cours:"), 0, 2);
        add(professeurField, 1, 2);

        // Champ de saisie pour le nombre d'heures du cours
        TextField heuresField = new TextField();
        heuresField.setPromptText("Nombre d'heures du cours");
        add(new Label("Nombre d'heures du cours:"), 0, 3);
        add(heuresField, 1, 3);

        // Boutons pour les opérations sur les cours
        Button ajouterButton = new Button("Ajouter Cours");
        ajouterButton.setOnAction(event -> {
            String nom = nomField.getText();
            String id = idField.getText();
            String professeur = professeurField.getText();
            int heures = Integer.parseInt(heuresField.getText());

            // Ajouter la logique pour ajouter le cours avec les informations fournies
            Cours cours = new Cours(nom, id, professeur, heures);
            System.out.println("Cours ajouté : " + cours);
        });
        add(ajouterButton, 0, 4, 2, 1);
    }
}
