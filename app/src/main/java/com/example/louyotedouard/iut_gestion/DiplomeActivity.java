package com.example.louyotedouard.iut_gestion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;

/**
 * Created by LOUYOT Edouard on 19/03/2015.
 */
public class DiplomeActivity extends Activity {
    private DatePicker date_diplome;
    private Button btn_valider, btn_accueil;
    private RadioButton admis,refuser;
    private int jours,mois,annee;
    private String info3,donnee;

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
        date_diplome = (DatePicker) findViewById(R.id.datePicker_diplome);

        btn_valider.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent browserIntent =
                        new Intent(DiplomeActivity.this, MainActivity.class);
                startActivity(browserIntent);
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
