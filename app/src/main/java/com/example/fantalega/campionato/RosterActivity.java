package com.example.fantalega.campionato;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.R;

public class RosterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roster);

        // Simula i dati della rosa dei giocatori dell'utente
        String[] goalkeeperList = {"Portiere1", "Portiere2", /*... altri portieri ...*/};
        String[] defenderList = {"Difensore1", "Difensore2", /*... altri difensori ...*/};
        String[] midfielderList = {"Centrocampista1", "Centrocampista2", /*... altri centrocampisti ...*/};
        String[] forwardList = {"Attaccante1", "Attaccante2", /*... altri attaccanti ...*/};

        // Popola le liste nella UI con i dati simulati
        populatePlayerList(R.id.listViewGoalkeepers, goalkeeperList);
        populatePlayerList(R.id.listViewDefenders, defenderList);
        populatePlayerList(R.id.listViewMidfielders, midfielderList);
        populatePlayerList(R.id.listViewForwards, forwardList);
    }

    private void populatePlayerList(int listViewId, String[] players) {
        ListView listView = findViewById(listViewId);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, players);
        listView.setAdapter(adapter);
    }
}
