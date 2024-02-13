package com.example.fantalega.campionato;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.R;
import com.example.fantalega.ScegliGiocatoreAttaccanteActivity;
import com.example.fantalega.ScegliGiocatoreDifensoreActivity;

public class ConsigliatoDifensoreActivity extends AppCompatActivity {

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giocatore_suggerito_difensore);

        initSharedPreferences();

        TextView nomeGiocatore = findViewById(R.id.nome_giocatore);
        Button conferma = findViewById(R.id.conferma);
        Button indietro = findViewById(R.id.indietro);
        Button modifica = findViewById(R.id.modifica_giocatore);

        modifica.setOnClickListener(v -> {

            Intent intent = new Intent(this, ScegliGiocatoreDifensoreActivity.class);
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
    private void initSharedPreferences() {
        preferences = getSharedPreferences("PlayerPrefs", Context.MODE_PRIVATE);
    }
}

