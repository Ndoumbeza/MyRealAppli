package com.example.myapplication;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;

public class AdminInterface extends Application {

    private Stage primaryStage;
    private BorderPane root;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Interface d'Administration");

        root = new BorderPane();
        root.setPadding(new Insets(10));

        // Création du menu
        MenuBar menuBar = createMenuBar();
        root.setTop(menuBar);

        // Initialisation de la scène principale
        Scene scene = new Scene(root, 800, 600);

        // Récupération de l'URL du fichier CSS
        URL resourceUrl = getClass().getResource("/css/style.css");
        if (resourceUrl != null) {
            String cssFile = resourceUrl.toExternalForm();
            scene.getStylesheets().add(cssFile);
        } else {
            System.err.println("Le fichier CSS n'a pas été trouvé.");
        }

        // Affichage de la scène
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Méthode pour créer le menu
    private MenuBar createMenuBar() {
        MenuBar menuBar = new MenuBar();

        // Menu Gestion des étudiants
        Menu gestionEtudiantsMenu = new Menu("Gestion des étudiants");
        MenuItem ajoutEtudiantItem = new MenuItem("Ajouter Étudiant");
        MenuItem supprimerEtudiantItem = new MenuItem("Supprimer Étudiant");
        MenuItem modifierEtudiantItem = new MenuItem("Modifier Étudiant");
        gestionEtudiantsMenu.getItems().addAll(ajoutEtudiantItem, supprimerEtudiantItem, modifierEtudiantItem);

        // Menu Gestion des cours
        Menu gestionCoursMenu = new Menu("Gestion des cours");
        MenuItem ajoutCoursItem = new MenuItem("Ajouter Cours");
        MenuItem supprimerCoursItem = new MenuItem("Supprimer Cours");
        MenuItem modifierCoursItem = new MenuItem("Modifier Cours");
        gestionCoursMenu.getItems().addAll(ajoutCoursItem, supprimerCoursItem, modifierCoursItem);

        // Menu Gestion des notes
        Menu gestionNotesMenu = new Menu("Gestion des notes");
        MenuItem ajoutNoteItem = new MenuItem("Ajouter Note");
        MenuItem supprimerNoteItem = new MenuItem("Supprimer Note");
        MenuItem modifierNoteItem = new MenuItem("Modifier Note");
        gestionNotesMenu.getItems().addAll(ajoutNoteItem, supprimerNoteItem, modifierNoteItem);

        // Ajout des menus à la barre de menu
        menuBar.getMenus().addAll(gestionEtudiantsMenu, gestionCoursMenu, gestionNotesMenu);

        // Gestion des actions des items de menu
        ajoutEtudiantItem.setOnAction(event -> root.setCenter(new GestionEtudiantPage()));
        supprimerEtudiantItem.setOnAction(event -> root.setCenter(new GestionEtudiantPage()));
        modifierEtudiantItem.setOnAction(event -> root.setCenter(new GestionEtudiantPage()));
        ajoutCoursItem.setOnAction(event -> root.setCenter(new GestionCoursPage()));
        supprimerCoursItem.setOnAction(event -> root.setCenter(new GestionCoursPage()));
        modifierCoursItem.setOnAction(event -> root.setCenter(new GestionCoursPage()));
        ajoutNoteItem.setOnAction(event -> root.setCenter(new GestionNotesPage()));
        supprimerNoteItem.setOnAction(event -> root.setCenter(new GestionNotesPage()));
        modifierNoteItem.setOnAction(event -> root.setCenter(new GestionNotesPage()));

        return menuBar;
    }

    public static void main(String[] args) {
        launch(args);
    }
}