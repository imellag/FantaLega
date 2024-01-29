package com.example.fantalega.campionato;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.HomeActivity;
import com.example.fantalega.R;

public class FormationActivity extends AppCompatActivity {

    private Button btnPlayer1; // Bottoni per i giocatori
    // Definisci altri bottoni per i giocatori...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formation);

        // Inizializza i bottoni dei giocatori
        btnPlayer1 = findViewById(R.id.btnPlayer1);
        // Inizializza gli altri bottoni dei giocatori...

        TextView openBench = findViewById(R.id.tvOpenBench);
        openBench.setOnClickListener(v -> {
            // Apri la schermata dei campionati
            Intent intent = new Intent(this, BenchActivity.class);
            startActivity(intent);
        });

        btnPlayer1.setOnClickListener(this::onPlayerButtonClicked);
        // Imposta OnClickListener per gli altri bottoni dei giocatori...

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
