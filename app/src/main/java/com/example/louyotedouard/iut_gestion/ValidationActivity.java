package com.example.louyotedouard.iut_gestion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by LOUYOT Edouard on 19/03/2015.
 */
public class ValidationActivity extends Activity {
    private Button btn_abandon,btn_diplome,btn_accueil;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.validation);
        addListenerOnButton();
    }

    public void addListenerOnButton(){
        btn_abandon = (Button) findViewById(R.id.button_abandon);
        btn_diplome = (Button) findViewById(R.id.button_diplome);
        btn_accueil = (Button) findViewById(R.id.button_accueil1);

        btn_accueil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent browserIntent =
                        new Intent(ValidationActivity.this, MainActivity.class);// retour sur le main activity
                startActivity(browserIntent);
            }
        });

        btn_diplome.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                CandidatActivity.renc.setCloturer("poursuite d'étude");
                Intent browserIntent =
                        new Intent(ValidationActivity.this, DiplomeActivity.class);
                startActivity(browserIntent);
            }
        });
        btn_abandon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                CandidatActivity.renc.setCloturer("abandon");
                Intent browserIntent =
                        new Intent(ValidationActivity.this, CandidatActivity.class);// retour sur le main activity
                startActivity(browserIntent);
            }
        });
    }
}
