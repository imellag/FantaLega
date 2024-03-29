package com.example.fantalega;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScegliGiocatoreDifensoreActivity extends AppCompatActivity {

    private SharedPreferences preferences;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scegli_difensore);

        initSharedPreferences();

        Button conferma = findViewById(R.id.conferma_attaccante);
        Button indietro = findViewById(R.id.indietro_attaccante);

        TextView nomeGiocatore = findViewById(R.id.nome_giocatore);
        TextView nomeSquadra = findViewById(R.id.nome_squadra);
        TextView match = findViewById(R.id.match);

        LinearLayout difensore1 = findViewById(R.id.difensore1);
        LinearLayout difensore2 = findViewById(R.id.difensore2);
        LinearLayout difensore3 = findViewById(R.id.difensore3);
        LinearLayout difensore4 = findViewById(R.id.difensore4);
        LinearLayout difensore5 = findViewById(R.id.difensore5);
        LinearLayout difensore6 = findViewById(R.id.difensore6);
        LinearLayout difensore7 = findViewById(R.id.difensore7);
        LinearLayout difensore8 = findViewById(R.id.difensore8);

        conferma.setOnClickListener(v -> {
            SharedPreferences.Editor editor = preferences.edit();

            editor.putBoolean("playerAdded", true);
            Log.d("Debug", "Testo attuale della TextView: " + nomeGiocatore.getText().toString());
            editor.putString("selectedPlayerName", nomeGiocatore.getText().toString());
            editor.apply();

            finish();
        });

        indietro.setOnClickListener(v -> {
            SharedPreferences.Editor editor = preferences.edit();

            editor.putBoolean("playerAdded", false);
            editor.apply();

            finish();
        });


        difensore1.setOnClickListener(v -> {
            nomeGiocatore.setText("DIMARCO");
            nomeSquadra.setText("(Inter)");
            match.setText("INTER VS LAZIO");

        });

        difensore2.setOnClickListener(v -> {
            nomeGiocatore.setText("HERNANDEZ");
            nomeSquadra.setText("(Milan)");
            match.setText("EMPOLI VS MILAN");

        });

        difensore3.setOnClickListener(v -> {
            nomeGiocatore.setText("RUGANI");
            nomeSquadra.setText("(Juventus)");
            match.setText("JUVENTUS VS LECCE");

        });

        difensore4.setOnClickListener(v -> {
            nomeGiocatore.setText("SCALVINI");
            nomeSquadra.setText("(Atalanta)");
            match.setText("SASSUOLO VS ATALANTA");

        });

        difensore5.setOnClickListener(v -> {
            nomeGiocatore.setText("MARI");
            nomeSquadra.setText("(Monza)");
            match.setText("ROMA VS MONZA");
        });

        difensore6.setOnClickListener(v -> {
            nomeGiocatore.setText("BANI");
            nomeSquadra.setText("(Genoa)");
            match.setText("CAGLIARI VS GENOA");

        });

        difensore7.setOnClickListener(v -> {
            nomeGiocatore.setText("RRAHMANI");
            nomeSquadra.setText("(Napoli)");
            match.setText("NAPOLI VS MILAN");

        });

        difensore8.setOnClickListener(v -> {
            nomeGiocatore.setText("ZORTEA");
            nomeSquadra.setText("(Frosinone)");
            match.setText("FROSINONE VS TORINO");

        });
    }

    private void initSharedPreferences() {
        preferences = getSharedPreferences("PlayerPrefs", Context.MODE_PRIVATE);
    }
}
