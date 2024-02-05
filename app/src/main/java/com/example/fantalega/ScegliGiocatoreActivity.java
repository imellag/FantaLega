package com.example.fantalega;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.fantalega.campionato.FormationActivity;

import java.util.zip.Inflater;

public class ScegliGiocatoreActivity extends AppCompatActivity {


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scegli_attaccante);

        Button conferma= findViewById(R.id.conferma_attaccante);
        Button indietro = findViewById(R.id.indietro_attaccante);


        conferma.setOnClickListener(v -> {
            Toast.makeText(this, "Attaccante inserito", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, FormationActivity.class);
            startActivity(intent);
        });

        indietro.setOnClickListener(v -> {
            Intent intent = new Intent(this, FormationActivity.class);
            startActivity(intent);
        });
    }







}
