package com.example.fantalega.player;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class PlayerStatsActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_stats);

        // Initialize views
        PieChart pieChart = findViewById(R.id.pieChart);
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
        entries.add(new PieEntry(1, "5"));
        entries.add(new PieEntry(3, "5.5"));
        entries.add(new PieEntry(3, "6"));
        entries.add(new PieEntry(1, "6.5"));
        entries.add(new PieEntry(4, "7"));
        entries.add(new PieEntry(3, "7.5"));
        entries.add(new PieEntry(1, "8"));

        PieDataSet set = new PieDataSet(entries, "");
        set.setColors(ColorTemplate.MATERIAL_COLORS);
        set.setSliceSpace(3f);
        set.setSelectionShift(5f);
        set.setValueTextSize(12f);

        PieData data = new PieData(set);
        pieChart.setData(data);
        pieChart.invalidate(); // aggiorna il grafico

        // Configurazioni aggiuntive se necessarie
        pieChart.setUsePercentValues(false);
        pieChart.getDescription().setEnabled(false);
        pieChart.setDrawEntryLabels(false);

        Legend l = pieChart.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.VERTICAL);
        l.setDrawInside(false);
        l.setWordWrapEnabled(true);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedSeason = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}
