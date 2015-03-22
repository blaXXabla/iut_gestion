package com.example.louyotedouard.iut_gestion.classe;

import java.util.Date;

/**
 * Created by Vampire on 18/03/2015.
 */
public class Rencontre {

    private Candidat candidat;
    private Date date;
    private String formation,text1;
    private String compte_rendu;
    private String cloturer;
    private Diplome dip_clot;

    public Rencontre(Candidat candidat, Date date, String formation) {
        this.candidat = candidat;
        this.date = date;
        this.formation = formation;
        this.compte_rendu = compte_rendu;
        this.cloturer = "ouvert";
    }

    public Candidat getCandidat() {
        return candidat;
    }

    public void setCandidat(Candidat candidat) {
        this.candidat = candidat;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public String getCompte_rendu() {
        return compte_rendu;
    }

    public void setCompte_rendu(String compte_rendu) {
        this.compte_rendu = compte_rendu;
    }

    public String isCloturer() {
        return cloturer;
    }

    public void setCloturer(String cloturer) {
        this.cloturer = cloturer;
    }

    public Diplome getDip_clot() {
        return dip_clot;
    }

    public void setDip_clot(Diplome dip_clot) {
        this.dip_clot = dip_clot;
    }

    @Override
    public String toString() {

        if (dip_clot != null )
        {
            text1 = ", dip_clot=" + dip_clot.toString() +" \n\r ";
        }else {
            text1 = "";
        }

        return "candidat=" + candidat.toString() +
                ", date=" + date +
                ", formation=" + formation +
                ", compte_rendu=" + compte_rendu  +
                ", cloturer=" + cloturer  + text1 +
                " \n\r";

    }
}
