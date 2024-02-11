package com.example.fantalega.campionato;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.R;
import com.example.fantalega.ScegliGiocatoreActivity;

public class ConsigliatoAttaccanteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giocatore_suggerito);

        Button indietro = findViewById(R.id.indietro);
        Button modifica = findViewById(R.id.modifica_giocatore);

        modifica.setOnClickListener(v -> {

            Intent intent = new Intent(this, ScegliGiocatoreActivity.class);
            startActivity(intent);
            finish();
        });

        indietro.setOnClickListener(v -> {

            Intent intent = new Intent(this, FormationActivity.class);
            startActivity(intent);
            finish();

        });
    }
}

