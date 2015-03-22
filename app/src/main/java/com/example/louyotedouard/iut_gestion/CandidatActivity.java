package com.example.louyotedouard.iut_gestion;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.louyotedouard.iut_gestion.classe.Candidat;
import com.example.louyotedouard.iut_gestion.classe.Diplome;
import com.example.louyotedouard.iut_gestion.classe.Rencontre;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;


public class CandidatActivity extends ActionBarActivity {
    private EditText nom,prenom,email,nomdiplome,anneediplome,etatdiplome;
    private Button btn_suivant1,btn_accueil;
    private RadioButton emploi,recherche,lpwce,lpasr;
    private String info,info2,info3,donnee,formation,situation;
    private Diplome diplome;
    static Rencontre renc ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.candidat);
        addListenerOnButton();
    }
    public void addListenerOnButton(){
        nom = (EditText) findViewById(R.id.editText_nom);
        prenom = (EditText) findViewById(R.id.editText_prenom);
        email = (EditText) findViewById(R.id.editText_email);
        nomdiplome = (EditText) findViewById(R.id.editText_nomdiplome);
        anneediplome = (EditText) findViewById(R.id.editText_anneediplome);
        etatdiplome = (EditText) findViewById(R.id.editText_etatdiplome);
        btn_suivant1 = (Button) findViewById(R.id.button_suivant1);
        btn_accueil = (Button) findViewById(R.id.button_accueil4);
        emploi = (RadioButton) findViewById(R.id.radioButton_emploi);
        recherche = (RadioButton) findViewById(R.id.radioButton_recherche);
        lpwce = (RadioButton) findViewById(R.id.radioButton_lpwce);
        lpasr = (RadioButton) findViewById(R.id.radioButton_lpasr);

        lpasr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                formation = "lp asr";
            }
        });
        lpwce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                formation = "lp wce";
            }
        });
        emploi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                situation = "En emploi";
            }
        });
        recherche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                situation = "Recherche d' emploi";
            }
        });
        btn_accueil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent browserIntent =
                        new Intent(CandidatActivity.this, MainActivity.class);// retour sur le main activity
                startActivity(browserIntent);
            }
        });
        btn_suivant1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                info = nom.getText().toString();
                info2 = prenom.getText().toString();
                info3 = email.getText().toString();
                diplome = new Diplome((nomdiplome.getText().toString()), (anneediplome.getText().toString()), (etatdiplome.getText().toString()));
                donnee= "nom:"+info+" ,prénom:"+info2+" email:"+info3+" situation actuel :"+situation+" diplome :"+diplome+ " formation :"+formation;
                Candidat c = new Candidat(info, info2, info3, situation, diplome );

                String format = "dd/MM/yy";
                java.util.Date date = new java.util.Date();
                renc = new Rencontre(c,  date, formation );


                Toast toast = Toast.makeText(getApplicationContext(), c.toString(), Toast.LENGTH_LONG);

                toast.show();
            // try pour stocker les données
            try
            {
                // ouverture ou création du fichier
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                        openFileOutput("données.txt", Context.MODE_PRIVATE)));
                // écriture dans le fichier
                bw.write(donnee);
                // fermeture du fichier
                bw.close();
                Intent browserIntent =
                        new Intent(CandidatActivity.this, CompteRenduActivity.class);
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



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
