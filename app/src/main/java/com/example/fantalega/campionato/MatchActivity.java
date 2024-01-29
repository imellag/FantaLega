package com.example.fantalega.campionato;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fantalega.player.PlayerStatsActivity;
import com.example.fantalega.R;
import com.example.fantalega.player.Player;
import com.example.fantalega.player.PlayerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MatchActivity extends AppCompatActivity {

    private RecyclerView rvTeam1Players;
    private RecyclerView rvTeam2Players;
    private PlayerAdapter playerAdapterTeam1;
    private PlayerAdapter playerAdapterTeam2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

        rvTeam1Players = findViewById(R.id.rvTeam1Players);
        rvTeam2Players = findViewById(R.id.rvTeam2Players);

        // Crea le liste di giocatori per le squadre
        List<Player> team1Players = getPlayersForTeam1();
        List<Player> team2Players = getPlayersForTeam2();

        // Configura gli adapter e i RecyclerView
        playerAdapterTeam1 = new PlayerAdapter(team1Players, view -> onPlayerItemClick(view, team1Players));
        rvTeam1Players.setAdapter(playerAdapterTeam1);
        rvTeam1Players.setLayoutManager(new LinearLayoutManager(this));

        playerAdapterTeam2 = new PlayerAdapter(team2Players, view -> onPlayerItemClick(view, team2Players));
        rvTeam2Players.setAdapter(playerAdapterTeam2);
        rvTeam2Players.setLayoutManager(new LinearLayoutManager(this));
    }

    private void onPlayerItemClick(View view, List<Player> players) {
        RecyclerView recyclerView = (RecyclerView) view.getParent();
        int position = recyclerView.getChildAdapterPosition(view);
        if (position != RecyclerView.NO_POSITION) {
            Player player = players.get(position);
            onPlayerClick(player);
        }
    }

    // Metodo per gestire il clic su un giocatore
    private void onPlayerClick(Player player) {
        // Avvia una nuova Activity con i dettagli del giocatore
        Intent intent = new Intent(this, PlayerStatsActivity.class);
        intent.putExtra("player_id", player.getId());
        startActivity(intent);
    }

    // Metodi per ottenere i giocatori (da modificare con i tuoi dati)
    private List<Player> getPlayersForTeam1() {
        // Ottieni e ritorna la lista dei giocatori per la Squadra 1
        return new ArrayList<>();
    }

    private List<Player> getPlayersForTeam2() {
        // Ottieni e ritorna la lista dei giocatori per la Squadra 2
        return new ArrayList<>();
    }
}
