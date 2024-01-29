package com.example.fantalega.campionato;

import com.example.fantalega.R;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ChampionshipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_championship);

        // Pulsante per la sezione "Match"
        findViewById(R.id.btnMatch).setOnClickListener(view -> openSection(MatchActivity.class));

        // Pulsante per la sezione "Inserisci Formazione"
        findViewById(R.id.btnFormazione).setOnClickListener(view -> openSection(FormationActivity.class));

        // Pulsante per la sezione "La Tua Rosa"
        findViewById(R.id.btnRosa).setOnClickListener(view -> openSection(RosterActivity.class));
    }

    private void openSection(Class<?> activityClass) {
        // Apri la schermata della sezione corrispondente
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }
}
