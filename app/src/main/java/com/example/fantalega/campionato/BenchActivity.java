package com.example.fantalega.campionato;

import com.example.fantalega.player.PlayerStatsActivity;
import com.example.fantalega.R;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BenchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bench);

        // Setting click listeners for all players
        setPlayerClickListener(R.id.goalkeeper1, "Goalkeeper 1");
        setPlayerClickListener(R.id.goalkeeper2, "Goalkeeper 2");

        setPlayerClickListener(R.id.defender1, "Defender 1");
        setPlayerClickListener(R.id.defender2, "Defender 2");
        setPlayerClickListener(R.id.defender3, "Defender 3");
        setPlayerClickListener(R.id.defender4, "Defender 4");

        setPlayerClickListener(R.id.midfielder1, "Midfielder 1");
        setPlayerClickListener(R.id.midfielder2, "Midfielder 2");
        setPlayerClickListener(R.id.midfielder3, "Midfielder 3");
        setPlayerClickListener(R.id.midfielder4, "Midfielder 4");

        setPlayerClickListener(R.id.striker1, "Striker 1");
        setPlayerClickListener(R.id.striker2, "Striker 2");
        setPlayerClickListener(R.id.striker3, "Striker 3");
    }

    private void setPlayerClickListener(int textViewId, String playerName) {
        TextView playerView = findViewById(textViewId);
        playerView.setOnClickListener(v -> openPlayerDetails(playerName));
    }

    private void openPlayerDetails(String playerName) {
        Intent intent = new Intent(BenchActivity.this, PlayerStatsActivity.class);
        intent.putExtra("PLAYER_NAME", playerName);
        startActivity(intent);
    }
}
