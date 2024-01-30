package com.example.fantalega.campionato;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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
        // Aggiungere attaccante 3

        // Inizializza gli altri bottoni dei giocatori...

        TextView openBench = findViewById(R.id.tvOpenBench);
        openBench.setOnClickListener(v -> {
            // Apri la schermata dei campionati
            Intent intent = new Intent(this, BenchActivity.class);
            startActivity(intent);
        });

        btnGoalkeeper.setOnClickListener(this::onPlayerButtonClicked);
        btnDefender1.setOnClickListener(this::onPlayerButtonClicked);
        btnDefender2.setOnClickListener(this::onPlayerButtonClicked);
        btnDefender3.setOnClickListener(this::onPlayerButtonClicked);
        btnDefender4.setOnClickListener(this::onPlayerButtonClicked);
        btnMidfielder1.setOnClickListener(this::onPlayerButtonClicked);
        btnMidfielder2.setOnClickListener(this::onPlayerButtonClicked);
        btnMidfielder3.setOnClickListener(this::onPlayerButtonClicked);
        btnMidfielder4.setOnClickListener(this::onPlayerButtonClicked);
        // Aggiungere centrocampista 5 (3-5-2)
        btnStriker1.setOnClickListener(this::onPlayerButtonClicked);
        btnStriker2.setOnClickListener(this::onPlayerButtonClicked);
        // Aggiungere attaccante 3

        // Inizializza e imposta listener per il bottone della formazione consigliata
        Button btnRecommendedFormation = findViewById(R.id.btnRecommendedFormation);
        btnRecommendedFormation.setOnClickListener(v -> onRecommendedFormationClicked());

        // Inizializza e imposta listener per il bottone di salvataggio formazione
        Button btnSaveFormation = findViewById(R.id.btnSaveFormation);
        btnSaveFormation.setOnClickListener(v -> onSaveFormationClicked());
    }

    private void onPlayerButtonClicked(View view) {
        // Logica per selezionare il giocatore per la posizione
        // Potresti voler avviare un'altra Activity per selezionare il giocatore
        Toast.makeText(this, "Seleziona giocatore per la posizione", Toast.LENGTH_SHORT).show();
    }

    private void onRecommendedFormationClicked() {
        // Logica per impostare la formazione consigliata
        Toast.makeText(this, "Formazione consigliata impostata", Toast.LENGTH_SHORT).show();
    }

    private void onSaveFormationClicked() {
        // Logica per salvare la formazione (riportare alla schermata precedente che non so quale sia)
        Toast.makeText(this, "Formazione salvata", Toast.LENGTH_SHORT).show();
    }

    // Aggiungi qui ulteriori metodi come necessario...
}
