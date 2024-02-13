package com.example.fantalega.campionato;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.R;
import com.example.fantalega.ScegliGiocatoreAttaccanteActivity;
import com.example.fantalega.player.PlayerStatsActivity;

public class ConsigliatoAttaccanteActivity extends AppCompatActivity {

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giocatore_suggerito_attaccante);

        initSharedPreferences();

        TextView nomeGiocatore = findViewById(R.id.nome_giocatore);
        Button indietro = findViewById(R.id.indietro);
        Button modifica = findViewById(R.id.modifica_giocatore);
        Button conferma = findViewById(R.id.conferma);

        modifica.setOnClickListener(v -> {

            Intent intent = new Intent(this, ScegliGiocatoreAttaccanteActivity.class);
            startActivity(intent);
            finish();
        });

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
    }

    public void onStatsClick(View view) {
        Intent intent = new Intent(this, PlayerStatsActivity.class);
        startActivity(intent);
    }

    private void initSharedPreferences() {
        preferences = getSharedPreferences("PlayerPrefs", Context.MODE_PRIVATE);
    }
}

