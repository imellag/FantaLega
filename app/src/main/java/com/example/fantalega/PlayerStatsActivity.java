package com.example.fantalega;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PlayerStatsActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private ImageView playerImage;
    private TextView playerName;
    private TextView playerSurname;
    private Spinner seasonSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_stats);

        int playerId = getIntent().getIntExtra("player_id", -1);
        if (playerId != -1) {
            // Esempio: Caricamento dati asincrono (ad es., da un database o un API)
            loadPlayerData(playerId);
        }
        else {
            // Gestisci l'errore: l'ID del giocatore non è stato passato correttamente
            finish();
            return;
        }

        // Initialize views
        //playerImage = findViewById(R.id.playerImage);
        playerName = findViewById(R.id.playerName);
        playerSurname = findViewById(R.id.playerSurname);
        seasonSpinner = findViewById(R.id.seasonSpinner);

        // Set up the spinner adapter
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.season_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        seasonSpinner.setAdapter(adapter);

        // Set the spinner's listener
        seasonSpinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedSeason = parent.getItemAtPosition(position).toString();
        // TODO: Handle the selected season
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }

    private void loadPlayerData(int playerId) {
        // Carica i dati del giocatore (può essere un'operazione asincrona)
        // Dopo aver caricato i dati, aggiorna la UI

        // Esempio: simulazione del caricamento dei dati
        new Thread(() -> {
            // Simula il caricamento dei dati (es: query al database)
            // Player player = ...carica dati...

            // Aggiorna la UI con i dati del giocatore
            runOnUiThread(() -> {
                // Ad esempio, se hai un TextView per il nome del giocatore
                TextView textViewPlayerName = findViewById(R.id.playerName);
                textViewPlayerName.setText(""/* nome del giocatore */);
                // Aggiorna altri elementi della UI qui
            });
        }).start();
    }
}
