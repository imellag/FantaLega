package com.example.fantalega;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.fantalega.campionato.FormationActivity;

public class ScegliGiocatoreAttaccanteActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scegli_attaccante);

        Button conferma = findViewById(R.id.conferma_attaccante);
        Button indietro = findViewById(R.id.indietro_attaccante);
        TextView nomeGiocatore = findViewById(R.id.nome_giocatore);
        TextView nomeSquadra = findViewById(R.id.nome_squadra);
        TextView match = findViewById(R.id.match);
        LinearLayout attaccante1 = findViewById(R.id.attaccante1);
        LinearLayout attaccante2 = findViewById(R.id.attaccante2);
        LinearLayout attaccante3 = findViewById(R.id.attaccante3);
        LinearLayout attaccante4 = findViewById(R.id.attaccante4);
        LinearLayout attaccante5 = findViewById(R.id.attaccante5);
        LinearLayout attaccante6 = findViewById(R.id.attaccante6);
attaccante1.setBackground(ContextCompat.getDrawable(this,R.drawable.blueborder));
        conferma.setOnClickListener(v -> {
            Intent intent = new Intent(this, FormationActivity.class);
            startActivity(intent);
            ProgressBar progressBar = findViewById(R.id.progressBar);
            progressBar.setProgress(50); // Imposta il progresso al 50%
        });

        indietro.setOnClickListener(v -> {
            Intent intent = new Intent(this, FormationActivity.class);
            startActivity(intent);
        });

        attaccante1.setOnClickListener(v -> {
            nomeGiocatore.setText("CAMBIAGHI");
            nomeSquadra.setText("(Empoli)");
            match.setText("EMPOLI VS MILAN");

        });
        attaccante2.setOnClickListener(v -> {
            nomeGiocatore.setText("NGONGE");
            nomeSquadra.setText("(Napoli)");
            match.setText("NAPOLI VS LAZIO");

        });

        attaccante3.setOnClickListener(v -> {
            nomeGiocatore.setText("NIANG");
            nomeSquadra.setText("(Empoli)");
            match.setText("EMPOLI VS MILAN");

        });

        attaccante4.setOnClickListener(v -> {
            nomeGiocatore.setText("LUKAKU");
            nomeSquadra.setText("(Roma)");
            match.setText("ROMA VS CAGLIARI");

        });

        attaccante5.setOnClickListener(v -> {
            nomeGiocatore.setText("KRSTOVIC");
            nomeSquadra.setText("(Lecce)");
            match.setText("FROSINONE VS LECCE");

        });

        attaccante6.setOnClickListener(v -> {
            nomeGiocatore.setText("GONZALEZ");
            nomeSquadra.setText("(Fiorentina)");
            match.setText("EMPOLI VS MILAN");


        });

    }


}
