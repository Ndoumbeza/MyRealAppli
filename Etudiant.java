package com.example.myapplication;

public class Etudiant {
    private String nom;
    private String prenom;
    private String id;
    private String email;




    // Constructeur
    public Etudiant(String nom, String prenom, String id, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.id= id;
        this.email = email;
    }

    // Getters et setters (à ajouter selon les besoins)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", identifiant='" + id+ '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}