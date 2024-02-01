package com.example.fantalega;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.campionato.ChampionshipActivity;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class ClassificaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
        ChipNavigationBar navigationBar = findViewById(R.id.navigation_bar);
        navigationBar.setItemSelected(R.id.navigation_classifica, true);
        navigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int id) {


                if (id == R.id.navigation_calendar) {
                    Intent intent = new Intent(ClassificaActivity.this, CalendarioActivity.class);
                    startActivity(intent);

                }
                if (id == R.id.navigation_campionato) {
                    Intent intent2 = new Intent(ClassificaActivity.this, ChampionshipActivity.class);
                    startActivity(intent2);
                }
                if (id == R.id.navigation_home) {
                    Intent intent3 = new Intent(ClassificaActivity.this, HomeActivity.class);
                    startActivity(intent3);

                }
            }
        });




    }
}
