package com.example.louyotedouard.iut_gestion.classe;

/**
 * Created by Vampire on 18/03/2015.
 */
public class Candidat {

    private String nom;
    private String prenom;
    private String email;
    private String situation;
    private Diplome dip_obtenu;

    public Candidat(String nom, String prenom, String email, String situation, Diplome dip_obtenu) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.situation = situation;
        this.dip_obtenu = dip_obtenu;
    }

    public Diplome getDip_obtenu() {
        return dip_obtenu;
    }

    public void setDip_obtenu(Diplome dip_obtenu) {
        this.dip_obtenu = dip_obtenu;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    /*public void ajouterDiplome(Diplome d){ TODO fonction mis en commentaire pour pouvoire test le code ( erreur sur .add )
        this.dip_obtenu.add(d);
    }*/

    @Override
    public String toString() {
        return
                ",nom=" + nom  +
                ", prenom=" + prenom  +
                ", email=" + email  +
                ", situation=" + situation  +
                ", dip_obtenu=" + dip_obtenu ;
    }
}
