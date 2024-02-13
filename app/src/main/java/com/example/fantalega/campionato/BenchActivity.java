package com.example.fantalega.campionato;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.fantalega.FragmentActivity;
import com.example.fantalega.R;
import com.example.fantalega.ScegliGiocatoreAttaccanteActivity;

public class BenchActivity extends AppCompatActivity {

    // Definisci un array con gli ID dei TextView per i giocatori
    private int[] giocatoriIds = {
            R.id.goalkeeper1, R.id.goalkeeper2, // 2 portieri
            R.id.defender1, R.id.defender2, R.id.defender3, R.id.defender4, // 4 difensori
            R.id.midfielder1, R.id.midfielder2, R.id.midfielder3, R.id.midfielder4, // 4 centrocampisti
            R.id.striker1, R.id.striker2, R.id.striker3 // 3 attaccanti
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bench);

        AppCompatButton indietro = findViewById(R.id.btnTornaIndietro);

        indietro.setOnClickListener(v -> {
            Intent intent = new Intent(this, FormationActivity.class);
            startActivity(intent);


        });
        // Itera su ogni ID dei TextView dei giocatori e imposta gli onClickListener
        for (int giocatoriId : giocatoriIds) {
            TextView textView = findViewById(giocatoriId);
            textView.setOnClickListener(v -> apriScegliGiocatoreActivity());
        }
    }

    // Metodo per aprire l'activity per la scelta del giocatore
    private void apriScegliGiocatoreActivity() {
        Intent intent = new Intent(this, ScegliGiocatoreAttaccanteActivity.class);
        startActivity(intent);
    }
}
