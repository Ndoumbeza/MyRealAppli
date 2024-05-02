package com.example.myapplication;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class GestionEtudiantPage extends VBox {

    public GestionEtudiantPage() {
        // Initialisez les éléments de la page de gestion des étudiants
        TextField idField = new TextField();
        idField.setPromptText("ID de l'étudiant");

        TextField nomField = new TextField();
        nomField.setPromptText("Nom de l'étudiant");

        TextField prenomField = new TextField();
        prenomField.setPromptText("Prénom de l'étudiant");

        TextField emailField = new TextField();
        emailField.setPromptText("Email de l'étudiant");

        Button ajouterButton = new Button("Ajouter Étudiant");
        ajouterButton.setOnAction(event -> {
            // Logique pour ajouter un étudiant
            String id = idField.getText();
            String nom = nomField.getText();
            String prenom = prenomField.getText();
            String email = emailField.getText();
            System.out.println("Ajout d'un étudiant : " + id + " - " + nom + " " + prenom + " (" + email + ")");

            // Réinitialisation des champs après l'ajout
            idField.clear();
            nomField.clear();
            prenomField.clear();
            emailField.clear();
        });

        Button modifierButton = new Button("Modifier Étudiant");
        modifierButton.setOnAction(event -> {
            // Logique pour modifier un étudiant
            String id = idField.getText();
            String nom = nomField.getText();
            String prenom = prenomField.getText();
            String email = emailField.getText();
            System.out.println("Modification de l'étudiant : " + id + " - " + nom + " " + prenom + " (" + email + ")");
        });

        Button supprimerButton = new Button("Supprimer Étudiant");
        supprimerButton.setOnAction(event -> {
            // Logique pour supprimer un étudiant
            String id = idField.getText();
            System.out.println("Suppression de l'étudiant : " + id);
        });

        // Ajoutez les éléments à la page de gestion des étudiants
        getChildren().addAll(idField, nomField, prenomField, emailField, ajouterButton, modifierButton, supprimerButton);
        setSpacing(10); // Espacement entre les éléments
    }
}
