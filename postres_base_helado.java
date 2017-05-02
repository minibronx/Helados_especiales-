package com.app.erick.heladosespeciales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class postres_base_helado extends AppCompatActivity {
    Button b1, b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postres_base_helado);
    }


    public void TiposHelados(View v) {
        Intent intent = new Intent(this, tipos_helados.class);
        startActivity(intent);
    }
}
