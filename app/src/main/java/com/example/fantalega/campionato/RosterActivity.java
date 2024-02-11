package com.example.fantalega.campionato;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.fantalega.FragmentActivity;
import com.example.fantalega.R;
import com.example.fantalega.player.PlayerStatsActivity;

public class RosterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roster);

        AppCompatButton indietro = findViewById(R.id.btnTornaIndietro);

        indietro.setOnClickListener(v -> {
            Intent intent = new Intent(this, FragmentActivity.class);
            startActivity(intent);
        });
    }
    public void openStats(View view) {
        Intent intent = new Intent(this, PlayerStatsActivity.class);
        startActivity(intent);
    }
}
