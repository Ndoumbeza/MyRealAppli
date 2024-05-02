package com.example.myapplication;


import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class GestionNotesPage extends GridPane {

    public GestionNotesPage() {
        setPadding(new Insets(20));
        setVgap(10);
        setHgap(10);

        // Champ de saisie pour le nom de l'étudiant
        TextField nomEtudiantField = new TextField();
        nomEtudiantField.setPromptText("Nom de l'étudiant");
        add(new Label("Nom de l'étudiant:"), 0, 0);
        add(nomEtudiantField, 1, 0);

        // Champ de saisie pour le nom du cours
        TextField nomCoursField = new TextField();
        nomCoursField.setPromptText("Nom du cours");
        add(new Label("Nom du cours:"), 0, 1);
        add(nomCoursField, 1, 1);

        // Champ de saisie pour la valeur de la note
        TextField valeurNoteField = new TextField();
        valeurNoteField.setPromptText("Valeur de la note");
        add(new Label("Valeur de la note:"), 0, 2);
        add(valeurNoteField, 1, 2);

        // Bouton pour ajouter une note
        Button ajouterNoteButton = new Button("Ajouter Note");
        ajouterNoteButton.setOnAction(event -> {
            String nomEtudiant = nomEtudiantField.getText();
            String nomCours = nomCoursField.getText();
            double valeurNote = Double.parseDouble(valeurNoteField.getText());

            // Ajouter la logique pour créer et gérer une nouvelle note
            Etudiant etudiant = new Etudiant(nomEtudiant, "", "", "");
            Cours cours = new Cours(nomCours, "", "", 0);

            if (etudiant != null && cours != null) {
                Note note = new Note(etudiant, cours, valeurNote);
                System.out.println("Note ajoutée : " + note);
            } else {
                System.out.println("Étudiant ou cours non trouvé.");
            }
        });
        add(ajouterNoteButton, 0, 3, 2, 1);
    }
}