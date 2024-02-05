package com.example.fantalega;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.fantalega.campionato.FormationActivity;
import com.example.fantalega.campionato.RosterActivity;
import com.example.fantalega.campionato.MatchLiveActivity;

public class HomeFragment extends Fragment {

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.activity_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button formation = view.findViewById(R.id.inserisci_formazione);
        formation.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), FormationActivity.class);
            startActivity(intent);
        });

        TextView rosa = view.findViewById(R.id.tvRosa);
        rosa.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), RosterActivity.class);
            startActivity(intent);
        });

        // crasha
        TextView matchLive = view.findViewById(R.id.tvMatchLive);
        matchLive.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), MatchLiveActivity.class);
            startActivity(intent);
        });
    }
}
