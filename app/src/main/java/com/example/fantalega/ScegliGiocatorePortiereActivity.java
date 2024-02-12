package com.example.fantalega;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.campionato.FormationActivity;

public class ScegliGiocatorePortiereActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scegli_portiere);

        Button conferma = findViewById(R.id.conferma_attaccante);
        Button indietro = findViewById(R.id.indietro_attaccante);
        TextView nomeGiocatore = findViewById(R.id.nome_giocatore);
        TextView nomeSquadra = findViewById(R.id.nome_squadra);
        TextView match = findViewById(R.id.match);

        LinearLayout portiere1 = findViewById(R.id.portiere1);
        LinearLayout portiere2 = findViewById(R.id.portiere2);
        LinearLayout portiere3 = findViewById(R.id.portiere3);



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
        portiere1.setOnClickListener(v -> {
            nomeGiocatore.setText("MAIGNAN");
            nomeSquadra.setText("(MILAN)");
            match.setText("MILAN VS NAPOLI");
        });
        portiere2.setOnClickListener(v -> {
            nomeGiocatore.setText("TURATI");
            nomeSquadra.setText("(Frosinone)");
            match.setText("INTER VS LAZIO");
        });
        portiere3.setOnClickListener(v -> {
            nomeGiocatore.setText("OKOYE");
            nomeSquadra.setText("(Inter)");
            match.setText("INTER VS LAZIO");
        });

    }


}
