package com.example.fantalega;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class CampionatoFragment extends Fragment {
    public CampionatoFragment() {
        // Costruttore pubblico vuoto richiesto
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        return inflater.inflate(R.layout.activity_championship, container, false);
    }
}
