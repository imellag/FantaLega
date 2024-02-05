package com.example.fantalega.player;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.R;

import java.util.ArrayList;
import java.util.List;

public class PlayerStatsActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_stats);

        int playerId = getIntent().getIntExtra("player_id", -1);
        if (playerId != -1) {
            // Esempio: Caricamento dati asincrono (ad es., da un database o un API)
            loadPlayerData(playerId);
        } else {
            // Gestisci l'errore: l'ID del giocatore non è stato passato correttamente
            finish();
            return;
        }

        // Initialize views
        PieChart pieChart = findViewById(R.id.pieChart);
        TextView playerName = findViewById(R.id.playerName);
        TextView playerSurname = findViewById(R.id.playerSurname);
        Spinner seasonSpinner = findViewById(R.id.seasonSpinner);

        // Set up the spinner adapter
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.season_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        seasonSpinner.setAdapter(adapter);

        // Set the spinner's listener
        seasonSpinner.setOnItemSelectedListener(this);

        // Crea i dati per il grafico a torta
        List<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(40.0f, "Label 1"));
        entries.add(new PieEntry(30.0f, "Label 2"));
        entries.add(new PieEntry(30.0f, "Label 3"));

        PieDataSet set = new PieDataSet(entries, "Etichetta del Dataset");
        set.setColors(ColorTemplate.MATERIAL_COLORS);
        set.setSliceSpace(3f);
        set.setSelectionShift(5f);

        PieData data = new PieData(set);
        pieChart.setData(data);
        pieChart.invalidate(); // aggiorna il grafico

        // Configurazioni aggiuntive se necessarie
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        Legend l = pieChart.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.VERTICAL);
        l.setDrawInside(false);
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
