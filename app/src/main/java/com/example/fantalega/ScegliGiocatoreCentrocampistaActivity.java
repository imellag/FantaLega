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

public class ScegliGiocatoreCentrocampistaActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scegli_centrocampista);

        Button conferma = findViewById(R.id.conferma_attaccante);
        Button indietro = findViewById(R.id.indietro_attaccante);
        TextView nomeGiocatore = findViewById(R.id.nome_giocatore);
        TextView nomeSquadra = findViewById(R.id.nome_squadra);
        TextView match = findViewById(R.id.match);

        LinearLayout centrocampista1 = findViewById(R.id.centrocampista1);
        LinearLayout centrocampista2 = findViewById(R.id.centrocampista2);
        LinearLayout centrocampista3 = findViewById(R.id.centrocampista3);
        LinearLayout centrocampista4 = findViewById(R.id.centrocampista4);
        LinearLayout centrocampista5 = findViewById(R.id.centrocampista5);
        LinearLayout centrocampista6 = findViewById(R.id.centrocampista6);
        LinearLayout centrocampista7 = findViewById(R.id.centrocampista7);
        LinearLayout centrocampista8 = findViewById(R.id.centrocampista8);


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

        centrocampista1.setOnClickListener(v -> {
            nomeGiocatore.setText("PULISIC");
            nomeSquadra.setText("(Milan)");
            match.setText("EMPOLI VS MILAN");

        });

        centrocampista2.setOnClickListener(v -> {
            nomeGiocatore.setText("GUENDOUNZI");
            nomeSquadra.setText("(Lazio)");
            match.setText("INTER VS LAZIO");

        });

        centrocampista3.setOnClickListener(v -> {
            nomeGiocatore.setText("EDERSON");
            nomeSquadra.setText("(Atalanta)");
            match.setText("SASSUOLO VS ATALANTA");

        });

        centrocampista4.setOnClickListener(v -> {
            nomeGiocatore.setText("COLPANI");
            nomeSquadra.setText("(Monza)");
            match.setText("ROMA VS MONZA");

        });

        centrocampista5.setOnClickListener(v -> {
            nomeGiocatore.setText("MAZZITELLI");
            nomeSquadra.setText("(Frosinone)");
            match.setText("FROSINONE VS TORINO");
        });

        centrocampista6.setOnClickListener(v -> {
            nomeGiocatore.setText("PEREYRA");
            nomeSquadra.setText("(Udinese)");
            match.setText("UDINESE VS GENOA");

        });

        centrocampista7.setOnClickListener(v -> {
            nomeGiocatore.setText("TRAORE");
            nomeSquadra.setText("(Napoli)");
            match.setText("NAPOLI VS MILAN");

        });

        centrocampista8.setOnClickListener(v -> {
            nomeGiocatore.setText("IKONE");
            nomeSquadra.setText("(Fiorentina)");
            match.setText("FIORENTINA VS BOLOGNA");

        });
    }


}
