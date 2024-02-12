package com.example.fantalega.campionato;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.FragmentActivity;
import com.example.fantalega.R;

public class FormazioneConsigliata extends AppCompatActivity {

    Button btnSaveFormation, btnFormazioneConsigliata;
    private int selectedPlayerButtonId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formazione_suggerita);

        // Bottoni per i giocatori
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btn10 = findViewById(R.id.btn10);
        Button btn11 = findViewById(R.id.btn11);

        TextView openBench = findViewById(R.id.tvOpenBench);
        openBench.setOnClickListener(v -> {
            // Apri la schermata dei campionati
            Intent intent = new Intent(this, BenchActivity.class);
            startActivity(intent);
        });

        btn1.setOnClickListener(this::onPlayerGoalkeeperButtonClicked);
        btn2.setOnClickListener(this::onPlayerDefenderButtonClicked);
        btn3.setOnClickListener(this::onPlayerDefenderButtonClicked);
        btn4.setOnClickListener(this::onPlayerDefenderButtonClicked);
        btn5.setOnClickListener(this::onPlayerDefenderButtonClicked);
        btn6.setOnClickListener(this::onPlayerMidfielderButtonClicked);
        btn7.setOnClickListener(this::onPlayerMidfielderButtonClicked);
        btn8.setOnClickListener(this::onPlayerMidfielderButtonClicked);
        btn9.setOnClickListener(this::onPlayerMidfielderButtonClicked);
        btn10.setOnClickListener(this::onPlayerStrikerButtonClicked);
        btn11.setOnClickListener(this::onPlayerStrikerButtonClicked);

        // Inizializza e imposta listener per il bottone di salvataggio formazione
        btnSaveFormation = findViewById(R.id.btnSaveFormation);
        btnSaveFormation.setOnClickListener(v -> onSaveFormationClicked());

        btnFormazioneConsigliata = findViewById(R.id.btnFormazioneConsigliata);
        btnFormazioneConsigliata.setOnClickListener(v -> onFormazioneConsigliataClicked());
    }

    private void onPlayerStrikerButtonClicked(View view) {
        selectedPlayerButtonId = view.getId();
        Intent intent = new Intent(this, ConsigliatoAttaccanteActivity.class);
        startActivity(intent);
    }
    private void onPlayerMidfielderButtonClicked(View view) {
        selectedPlayerButtonId = view.getId();
        Intent intent = new Intent(this, ConsigliatoCentrocampistaActivity.class);
        startActivity(intent);
    }
    private void onPlayerDefenderButtonClicked(View view) {
        selectedPlayerButtonId = view.getId();
        Intent intent = new Intent(this, ConsigliatoDifensoreActivity.class);
        startActivity(intent);
    }
    private void onPlayerGoalkeeperButtonClicked(View view) {
        selectedPlayerButtonId = view.getId();
        Intent intent = new Intent(this, ConsigliatoPortiereActivity.class);
        startActivity(intent);
    }

    private void onSaveFormationClicked() {
        btnSaveFormation.setOnClickListener(v -> {
            Toast.makeText(this, "Formazione salvata", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, FragmentActivity.class);
            startActivity(intent);
        });
    }
    private void onFormazioneConsigliataClicked() {
        btnFormazioneConsigliata.setOnClickListener(v -> {
            Intent intent = new Intent(this, FormazioneConsigliata.class);
            startActivity(intent);
            finish();
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences prefs = getSharedPreferences("PlayerPrefs", MODE_PRIVATE);

        boolean playerAdded = prefs.getBoolean("playerAdded", false);
        if (playerAdded)  {
            String playerName = prefs.getString("selectedPlayerName", "");
            Log.d("Debug", "Testo attuale del giocatore: " + playerName);

            // Mappa l'ID del bottone all'ID della textView corrispondente
            String textViewId = mapPlayerButtonToTextView(selectedPlayerButtonId);

            // Verifica se l'ID della textView è valido
            if (textViewId != null) {
                // Trova la textView corrispondente e aggiorna il suo testo
                int textViewResId = getResources().getIdentifier(textViewId, "id", getPackageName());
                TextView textViewToUpdate = findViewById(textViewResId);
                textViewToUpdate.setText(playerName);
            }

            // Pulisci le preferenze condivise
            SharedPreferences.Editor editor = prefs.edit();
            editor.clear();
            editor.apply();
        }
    }

    private String mapPlayerButtonToTextView(int buttonId) {
        String textViewId;
        if (buttonId == R.id.btn1) {
            textViewId = "tv1";
        } else if (buttonId == R.id.btn2) {
            textViewId = "tv2";
        } else if (buttonId == R.id.btn3) {
            textViewId = "tv3";
        } else if (buttonId == R.id.btn4) {
            textViewId = "tv4";
        } else if (buttonId == R.id.btn5) {
            textViewId = "tv5";
        } else if (buttonId == R.id.btn6) {
            textViewId = "tv6";
        } else if (buttonId == R.id.btn7) {
            textViewId = "tv7";
        } else if (buttonId == R.id.btn8) {
            textViewId = "tv8";
        } else if (buttonId == R.id.btn9) {
            textViewId = "tv9";
        } else if (buttonId == R.id.btn10) {
            textViewId = "tv10";
        } else if (buttonId == R.id.btn11) {
            textViewId = "tv11";
        } else {
            textViewId = null; // ID non valido
        }
        return textViewId;
    }

}
