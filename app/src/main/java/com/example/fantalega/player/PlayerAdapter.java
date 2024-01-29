package com.example.fantalega.player;

import com.example.fantalega.PlayerStatsActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;

import com.example.fantalega.R;

import java.util.List;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder> {

    private List<Player> players;
    private View.OnClickListener onPlayerClickListener;

    public PlayerAdapter(List<Player> players, View.OnClickListener onPlayerClickListener) {
        this.players = players;
        this.onPlayerClickListener = onPlayerClickListener;
    }

    @NonNull
    @Override
    public PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_player_stats, parent, false);
        return new PlayerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerViewHolder holder, int position) {
        Player player = players.get(position);
        holder.itemView.setTag(player);
        holder.tvPlayerName.setText(player.getName());
        holder.itemView.setOnClickListener(onPlayerClickListener);

        holder.itemView.setOnClickListener(view -> {
            // Intent per avviare l'Activity delle statistiche
            Intent intent = new Intent(view.getContext(), PlayerStatsActivity.class);
            intent.putExtra("player_id", player.getId()); // Assumi che ogni giocatore abbia un ID unico
            view.getContext().startActivity(intent);
        });
    }


    @Override
    public int getItemCount() {
        return players.size();
    }

    static class PlayerViewHolder extends RecyclerView.ViewHolder {
        TextView tvPlayerName;

        PlayerViewHolder(View itemView) {
            super(itemView);
            tvPlayerName = itemView.findViewById(R.id.playerName);
        }
    }
}
