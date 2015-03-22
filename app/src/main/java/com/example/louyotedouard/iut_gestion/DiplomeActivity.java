package com.example.louyotedouard.iut_gestion;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.louyotedouard.iut_gestion.classe.Diplome;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/**
 * Created by LOUYOT Edouard
 */
public class DiplomeActivity extends Activity {
    private Button btn_valider, btn_accueil;
    private RadioButton admis,refuser;
    private int jours,mois,annee;
    private String info3,donnee;
    private EditText nom_dip, anneeD;
    private String etat;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diplome);
        addListenerOnButton();
    }

    public void addListenerOnButton(){
        admis = (RadioButton) findViewById(R.id.radioButton_admis);
        refuser = (RadioButton) findViewById(R.id.radioButton_refuser);
        btn_valider = (Button) findViewById(R.id.button_valider);
        btn_accueil = (Button) findViewById(R.id.button_accueil2);
        anneeD = (EditText) findViewById(R.id.anneeD);
        nom_dip = (EditText) findViewById(R.id.nomD);

        btn_valider.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if(admis.isChecked())
                {
                   etat = "admis";
                }else{
                   etat = "échoué";
                }

                try
                {
                    // ouverture ou création du fichier
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                            openFileOutput("données.txt", Context.MODE_PRIVATE)));
                    // écriture dans le fichier
                    bw.write(CandidatActivity.renc.toString());
                    // fermeture du fichier
                    bw.close();

                    Intent browserIntent =
                            new Intent(DiplomeActivity.this, MainActivity.class);
                    startActivity(browserIntent);
                }
                catch( Exception e)
                {
                    Toast toast2 = Toast.makeText(getApplicationContext(), "Erreur", Toast.LENGTH_LONG);
                    toast2.show();
                }


            }
        });
        btn_accueil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent browserIntent =
                        new Intent(DiplomeActivity.this, MainActivity.class);// retour sur le main activity
                startActivity(browserIntent);
            }
        });

    }
}
