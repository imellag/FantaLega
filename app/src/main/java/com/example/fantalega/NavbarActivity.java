package com.example.fantalega;

/*import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.campionato.ChampionshipActivity;

public class NavbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_bar_fragment);

        Button Home = findViewById(R.id.btnHome);
        Button Classifica = findViewById(R.id.btnClassifica);
        Button Calendario = findViewById(R.id.btnCalendario);
        Button Campionato = findViewById(R.id.btnCampionati);
        Home.setOnClickListener(v -> {
            // Apri la schermata dei campionati
            Intent intent = new Intent(NavbarActivity.this, HomeActivity.class);
            startActivity(intent);
        });
        Classifica.setOnClickListener(v -> {
            // Apri la schermata dei campionati
            Intent intent = new Intent(NavbarActivity.this, ChampionshipActivity.class);
            startActivity(intent);
        });
      /*  Calendario.setOnClickListener(v -> {
            // Apri la schermata dei campionati
            Intent intent = new Intent(NavbarActivity.this, CalendarioActivity.class);
            startActivity(intent);
        });
        Campionato.setOnClickListener(v -> {
            // Apri la schermata dei campionati
            Intent intent = new Intent(NavbarActivity.this, CampionatoActivity.class);
            startActivity(intent);
        });

           }

}

        */
