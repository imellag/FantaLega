package com.example.fantalega.campionato;
import com.example.fantalega.R;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MatchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

        // Simula i dati della formazione dell'utente e dell'avversario
        String[] userFormation = {"Giocatore1", "Giocatore2", "Giocatore3", /*... altri giocatori ...*/};
        String[] opponentFormation = {"Avversario1", "Avversario2", "Avversario3", /*... altri giocatori ...*/};

        // Popola le liste nella UI con i dati simulati
        populateFormationList(R.id.listViewUserFormation, userFormation);
        populateFormationList(R.id.listViewOpponentFormation, opponentFormation);
    }

    private void populateFormationList(int listViewId, String[] players) {
        ListView listView = findViewById(listViewId);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, players);
        listView.setAdapter(adapter);
    }
}
