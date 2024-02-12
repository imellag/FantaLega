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

public class ScegliGiocatorePortiereActivity extends AppCompatActivity {

    private SharedPreferences preferences;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scegli_portiere);

        initSharedPreferences();

        Button conferma = findViewById(R.id.conferma_attaccante);
        Button indietro = findViewById(R.id.indietro_attaccante);

        TextView nomeGiocatore = findViewById(R.id.nome_giocatore);
        TextView nomeSquadra = findViewById(R.id.nome_squadra);
        TextView match = findViewById(R.id.match);

        LinearLayout portiere1 = findViewById(R.id.portiere1);
        LinearLayout portiere2 = findViewById(R.id.portiere2);
        LinearLayout portiere3 = findViewById(R.id.portiere3);

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

        portiere1.setOnClickListener(v -> {
            nomeGiocatore.setText("MAIGNAN");
            nomeSquadra.setText("(Milan)");
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

    private void initSharedPreferences() {
        preferences = getSharedPreferences("PlayerPrefs", Context.MODE_PRIVATE);
    }
}
