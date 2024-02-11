package com.example.fantalega.campionato;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.R;
import com.example.fantalega.ScegliGiocatoreActivity;

public class ChampionshipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_championship);
    }

    public void aggiungiCampionato(View view) {
        Intent intent = new Intent(this, CreaCampionatoActivity.class);
        startActivity(intent);
    }

    public void accediCampionato(View view) {
        Intent intent = new Intent(this, AccediCampionatoActivity.class);
        startActivity(intent);
    }
}
