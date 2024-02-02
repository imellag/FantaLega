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
    }

    private void openSection(Class<?> activityClass) {
        // Apri la schermata della sezione corrispondente
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }
}
