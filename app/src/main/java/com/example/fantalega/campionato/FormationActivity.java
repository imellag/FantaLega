package com.example.fantalega.campionato;
import com.example.fantalega.R;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class FormationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formation);

        // Simula i dati della rosa dei giocatori disponibili
        String[] playerList = {"Giocatore1", "Giocatore2", "Giocatore3", /*... altri giocatori ...*/};

        // Popola la lista nella UI con i dati simulati
        populatePlayerList(R.id.listViewAvailablePlayers, playerList);

        // Pulsante per salvare la formazione
        Button btnSaveFormation = findViewById(R.id.btnSaveFormation);
        btnSaveFormation.setOnClickListener(view -> {
            // Implementa la logica per salvare la formazione
            // Qui puoi aggiungere la logica per salvare i giocatori selezionati
        });
    }

    private void populatePlayerList(int listViewId, String[] players) {
        ListView listView = findViewById(listViewId);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, players);
        listView.setAdapter(adapter);
    }
}
