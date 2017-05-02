package com.app.erick.heladosespeciales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion);
    }

    public void Helados(View v) {
        Intent intent = new Intent(this, postres_base_helado.class);
        startActivity(intent);
    }
}
