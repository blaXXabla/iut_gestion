package com.example.louyotedouard.iut_gestion;

import android.content.Context;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/**
 * Created by LOUYOT Edouard on 19/03/2015.
 */
public class CompteRenduActivity extends ActionBarActivity {
    private EditText compte_rendu;
    private Button btn_suivant2,btn_accueil;
    private String info,donnee2;

    public void addListenerOnButton(){
        compte_rendu = (EditText) findViewById(R.id.editText_compte_rendu);
        btn_suivant2 = (Button) findViewById(R.id.button_suivant2);
        btn_accueil = (Button) findViewById(R.id.button_accueil3);

        btn_accueil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent browserIntent =
                        new Intent(CompteRenduActivity.this, MainActivity.class);// retour sur le main activity
                startActivity(browserIntent);
            }
        });

        btn_suivant2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                info = compte_rendu.getText().toString();
                donnee2= "compte rendu :"+info;

                CandidatActivity.renc.setCompte_rendu(info);

                // try pour stocker les données
                CandidatActivity.renc.setCompte_rendu(donnee2);

                try
                {
                    // ouverture ou création du fichier
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                            openFileOutput("données.txt", Context.MODE_PRIVATE)));
                    // écriture dans le fichier
                    bw.write(donnee2);
                    // fermeture du fichier
                    bw.close();
                    Intent browserIntent =
                            new Intent(CompteRenduActivity.this, ValidationActivity.class);
                    startActivity(browserIntent);
                }
                catch( Exception e)
                {
                    Toast toast2 = Toast.makeText(getApplicationContext(), "Erreur", Toast.LENGTH_LONG);
                    toast2.show();
                }
            }
        });
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compte_rendu);
        addListenerOnButton();
    }
}
