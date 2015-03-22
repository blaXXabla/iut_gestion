package com.example.louyotedouard.iut_gestion.classe;

import java.util.Date;

/**
 * Created by Loic
 */
public class Diplome {

    private String nom;
    private String date;
    private String etat;

    public Diplome(String nom, String etat, String date) {
        this.nom = nom;
        this.date = date;
        this.etat = etat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return   ",nom=" + nom  +
                ", date=" + date  +
                ", etat=" + etat  ;
    }
}
