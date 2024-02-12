package com.example.fantalega;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


public class ScegliGiocatoreAttaccanteActivity extends AppCompatActivity {
    private SharedPreferences preferences;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scegli_attaccante);

        initSharedPreferences();

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

        attaccante1.setBackground(ContextCompat.getDrawable(this, R.drawable.blueborder));

        conferma.setOnClickListener(v -> {
            SharedPreferences.Editor editor = preferences.edit();

            editor.putBoolean("playerAdded", true);
            Log.d("Debug", "Testo attuale della TextView: " + nomeGiocatore.getText().toString());
            editor.putString("selectedPlayerName", nomeGiocatore.getText().toString());
            editor.apply();

            finish();
        });

        indietro.setOnClickListener(v -> {
            SharedPreferences.Editor editor = preferences.edit();

            editor.putBoolean("playerAdded", false);
            editor.apply();

            finish();
        });

        attaccante1.setOnClickListener(v -> {
            nomeGiocatore.setText("CAMBIAGHI");
            nomeSquadra.setText("(Empoli)");
            match.setText("EMPOLI VS MILAN");
        });

        attaccante2.setOnClickListener(v -> {
            nomeGiocatore.setText("NIANG");
            nomeSquadra.setText("(Empoli)");
            match.setText("EMPOLI VS MILAN");
        });

        attaccante3.setOnClickListener(v -> {
            nomeGiocatore.setText("NGONGE");
            nomeSquadra.setText("(Napoli)");
            match.setText("NAPOLI VS LAZIO");
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

    private void initSharedPreferences() {
        preferences = getSharedPreferences("PlayerPrefs", Context.MODE_PRIVATE);
    }
}
