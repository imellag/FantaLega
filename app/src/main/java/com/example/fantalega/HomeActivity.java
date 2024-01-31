package com.example.fantalega;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.ismaeldivita.chipnavigation.*;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.campionato.ChampionshipActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.navbar, menu);
        return true;
    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        // Pulsante per la sezione "Campionati"
    ChipNavigationBar navigationBar = findViewById(R.id.navigation_bar);
        navigationBar.setItemSelected(R.id.navigation_home, true);
    navigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
        @Override
        public void onItemSelected(int id) {


            if (id == R.id.navigation_calendar) {
                Intent intent = new Intent(HomeActivity.this, CalendarioActivity.class);
                startActivity(intent);

            }
            if (id == R.id.navigation_campionato) {
                Intent intent2 = new Intent(HomeActivity.this, ChampionshipActivity.class);
                startActivity(intent2);
            }
            if (id == R.id.navigation_classifica) {
                Intent intent3 = new Intent(HomeActivity.this, ClassificaActivity.class);
                startActivity(intent3);

            }
        }

    });
        Button btnChampionships = findViewById(R.id.btnCampionati);
        btnChampionships.setOnClickListener(v -> {
            // Apri la schermata dei campionati
            Intent intent = new Intent(HomeActivity.this, ChampionshipActivity.class);
            startActivity(intent);
        });



    }
}
