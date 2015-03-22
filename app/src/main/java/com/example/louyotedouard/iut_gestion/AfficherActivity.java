package com.example.louyotedouard.iut_gestion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by LOUYOT Edouard on 20/03/2015.
 */
public class AfficherActivity extends ActionBarActivity{
    private ListView list;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afficher);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        list = (ListView) findViewById(R.id.listView_etudient);



    }

}
