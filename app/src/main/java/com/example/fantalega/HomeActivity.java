package com.example.fantalega;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.campionato.ChampionshipActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //
        // Pulsante per la sezione "Campionati"
        //  Button btnChampionships = findViewById(R.id.btnCampionati);
        //btnChampionships.setOnClickListener(v -> {
        // Apri la schermata dei campionati
        //  Intent intent = new Intent(HomeActivity.this, ChampionshipActivity.class);
        //startActivity(intent);
        // });
    }
}
