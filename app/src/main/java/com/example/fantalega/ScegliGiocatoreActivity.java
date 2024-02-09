package com.example.fantalega;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.campionato.FormationActivity;

public class ScegliGiocatoreActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scegli_attaccante);

        Button conferma = findViewById(R.id.conferma_attaccante);
        Button indietro = findViewById(R.id.indietro_attaccante);

        conferma.setOnClickListener(v -> {
            Intent intent = new Intent(this, FormationActivity.class);
            startActivity(intent);
            ProgressBar progressBar = findViewById(R.id.progressBar);
            progressBar.setProgress(50); // Imposta il progresso al 50%
        });

        indietro.setOnClickListener(v -> {
            Intent intent = new Intent(this, FormationActivity.class);
            startActivity(intent);
        });
    }


}
