package com.example.fantalega.campionato;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.FragmentActivity;
import com.example.fantalega.R;

public class CreaCampionatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crea_campionato);
        Button crea = findViewById(R.id.btnConfirm);

        crea.setOnClickListener(v -> {
            Toast.makeText(this, "Lega Creata con successo!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(CreaCampionatoActivity.this, FragmentActivity.class);
            startActivity(intent);

        });
    }
}
