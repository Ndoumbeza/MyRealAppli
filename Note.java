package com.example.myapplication;

public class Note {
    private Etudiant etudiant;
    private Cours cours;
    private double valeur;

    // Constructeur
    public Note(Etudiant etudiant, Cours cours, double valeur) {
        this.etudiant = etudiant;
        this.cours = cours;
        this.valeur = valeur;
    }

    // Getter pour l'étudiant
    public Etudiant getEtudiant() {
        return etudiant;
    }

    // Setter pour l'étudiant
    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    // Getter pour le cours
    public Cours getCours() {
        return cours;
    }

    // Setter pour le cours
    public void setCours(Cours cours) {
        this.cours = cours;
    }

    // Getter pour la valeur de la note
    public double getValeur() {
        return valeur;
    }

    // Setter pour la valeur de la note
    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    // Méthode toString pour afficher les informations de la note
    @Override
    public String toString() {
        return "Note{" +
                "etudiant=" + etudiant +
                ", cours=" + cours +
                ", valeur=" + valeur +
                '}';
    }
}