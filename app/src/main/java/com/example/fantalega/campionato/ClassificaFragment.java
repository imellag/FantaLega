package com.example.fantalega.campionato;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.fantalega.R;

public class ClassificaFragment extends Fragment {

    public ClassificaFragment() {
        // Costruttore pubblico vuoto richiesto
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflaziona il layout per questo fragment


        return inflater.inflate(R.layout.activity_ranking, container, false);
    }
}
