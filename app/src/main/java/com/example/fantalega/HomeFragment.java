package com.example.fantalega;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Costruttore pubblico vuoto richiesto
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflaziona il layout per questo fragment
        return inflater.inflate(R.layout.activity_home, container, false);
    }
}
