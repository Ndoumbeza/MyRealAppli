package com.example.myapplication;

public class Cours {
    private String nom;
    private String id;
    private String professeur;
    private int nombreHeures;

    public Cours(String nom, String id, String professeur, int nombreHeures) {
        this.nom = nom;
        this.id = id;
        this.professeur = professeur;
        this.nombreHeures = nombreHeures;
    }

    // Getter pour le nom du cours
    public String getNom() {
        return nom;
    }

    // Setter pour le nom du cours
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter pour l'identifiant du cours
    public String getId() {
        return id;
    }

    // Setter pour l'identifiant du cours
    public void setId(String id) {
        this.id = id;
    }

    // Getter pour le professeur du cours
    public String getProfesseur() {
        return professeur;
    }

    // Setter pour le professeur du cours
    public void setProfesseur(String professeur) {
        this.professeur = professeur;
    }

    // Getter pour le nombre d'heures du cours
    public int getNombreHeures() {
        return nombreHeures;
    }

    // Setter pour le nombre d'heures du cours
    public void setNombreHeures(int nombreHeures) {
        this.nombreHeures = nombreHeures;
    }

    // Méthode toString() pour afficher les informations du cours
    public String toString() {
        return "Cours{" +
                "nom='" + nom + '\'' +
                ", id='" + id + '\'' +
                ", professeur='" + professeur + '\'' +
                ", nombreHeures=" + nombreHeures +
                '}';
    }
}