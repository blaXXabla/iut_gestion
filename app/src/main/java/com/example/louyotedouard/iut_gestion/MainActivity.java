package com.example.louyotedouard.iut_gestion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by LOUYOT Edouard
 */
public class MainActivity extends ActionBarActivity {
    private Button btn_addEtudiant,btn_listEtudiant;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        btn_addEtudiant = (Button) findViewById(R.id.button_addetudiant);
        btn_listEtudiant = (Button) findViewById(R.id.button_listetudiant);

        btn_addEtudiant.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent browserIntent =
                        new Intent(MainActivity.this, CandidatActivity.class);
                startActivity(browserIntent);
            }
        });
        btn_listEtudiant.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent browserIntent =
                        new Intent(MainActivity.this, AfficherActivity.class);
                startActivity(browserIntent);
            }
        });

    }
}
