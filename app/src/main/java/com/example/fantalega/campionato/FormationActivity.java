package com.example.fantalega.campionato;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.FragmentActivity;
import com.example.fantalega.R;

public class FormationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formation);

        // Inizializza i bottoni dei giocatori
        // Bottoni per i giocatori
        Button btnGoalkeeper = findViewById(R.id.btnGoalkeeper);
        Button btnDefender1 = findViewById(R.id.btnDefender1);
        Button btnDefender2 = findViewById(R.id.btnDefender2);
        Button btnDefender3 = findViewById(R.id.btnDefender3);
        Button btnDefender4 = findViewById(R.id.btnDefender4);
        Button btnMidfielder1 = findViewById(R.id.btnMidfielder1);
        Button btnMidfielder2 = findViewById(R.id.btnMidfielder2);
        Button btnMidfielder3 = findViewById(R.id.btnMidfielder3);
        Button btnMidfielder4 = findViewById(R.id.btnMidfielder4);
        // Aggiungere centrocampista 5 (3-5-2)
        Button btnStriker1 = findViewById(R.id.btnStriker1);
        Button btnStriker2 = findViewById(R.id.btnStriker2);


        TextView openBench = findViewById(R.id.tvOpenBench);
        openBench.setOnClickListener(v -> {
            // Apri la schermata dei campionati
            Intent intent = new Intent(this, BenchActivity.class);
            startActivity(intent);
        });

        btnGoalkeeper.setOnClickListener(this::onPlayerGoalkeeperButtonClicked);
        btnDefender1.setOnClickListener(this::onPlayerDefenderButtonClicked);
        btnDefender2.setOnClickListener(this::onPlayerDefenderButtonClicked);
        btnDefender3.setOnClickListener(this::onPlayerDefenderButtonClicked);
        btnDefender4.setOnClickListener(this::onPlayerDefenderButtonClicked);
        btnMidfielder1.setOnClickListener(this::onPlayerMidfielderButtonClicked);
        btnMidfielder2.setOnClickListener(this::onPlayerMidfielderButtonClicked);
        btnMidfielder3.setOnClickListener(this::onPlayerMidfielderButtonClicked);
        btnMidfielder4.setOnClickListener(this::onPlayerMidfielderButtonClicked);
        // Aggiungere centrocampista 5 (3-5-2)
        btnStriker1.setOnClickListener(this::onPlayerStrikerButtonClicked);
        btnStriker2.setOnClickListener(this::onPlayerStrikerButtonClicked);
        // Aggiungere attaccante 3

        // Inizializza e imposta listener per il bottone della formazione consigliata
        Button btnRecommendedFormation = findViewById(R.id.btnRecommendedFormation);
        btnRecommendedFormation.setOnClickListener(v -> onRecommendedFormationClicked());

        // Inizializza e imposta listener per il bottone di salvataggio formazione
        Button btnSaveFormation = findViewById(R.id.btnSaveFormation);
        btnSaveFormation.setOnClickListener(v -> onSaveFormationClicked());
    }

    private void onPlayerStrikerButtonClicked(View view) {
        Intent intent = new Intent(this, ConsigliatoAttaccanteActivity.class);
        startActivity(intent);
    }
    private void onPlayerMidfielderButtonClicked(View view) {
        Intent intent = new Intent(this, ConsigliatoCentrocampistaActivity.class);
        startActivity(intent);
    }
    private void onPlayerDefenderButtonClicked(View view) {
        Intent intent = new Intent(this, ConsigliatoDifensoreActivity.class);
        startActivity(intent);
    }
    private void onPlayerGoalkeeperButtonClicked(View view) {
        Intent intent = new Intent(this, ConsigliatoPortiereActivity.class);
        startActivity(intent);
    }

    private void onRecommendedFormationClicked() {
        Toast.makeText(this, "Formazione consigliata impostata", Toast.LENGTH_SHORT).show();
    }

    private void onSaveFormationClicked() {
        // Logica per salvare la formazione (bisogna schiacciare due volte)
        Button saveFormation = findViewById(R.id.btnSaveFormation);
        saveFormation.setOnClickListener(v -> {
            Toast.makeText(this, "Formazione salvata", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, FragmentActivity.class);
            startActivity(intent);
        });
    }
}
