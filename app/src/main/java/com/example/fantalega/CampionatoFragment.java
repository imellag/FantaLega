package com.example.fantalega;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fantalega.campionato.AccediCampionatoActivity;
import com.example.fantalega.campionato.CreaCampionatoActivity;

public class CampionatoFragment extends Fragment {
    public CampionatoFragment() {
        // Costruttore pubblico vuoto richiesto
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.activity_championship, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button accedi = view.findViewById(R.id.accedi_campionato);

        Button crea = view.findViewById(R.id.crea_campionato);


        accedi.setOnClickListener(v -> {

            Intent intent = new Intent(getActivity(), AccediCampionatoActivity.class);
            startActivity(intent);

        });

        crea.setOnClickListener(v -> {

            Intent intent = new Intent(getActivity(), CreaCampionatoActivity.class);
            startActivity(intent);

        });
    }
}
