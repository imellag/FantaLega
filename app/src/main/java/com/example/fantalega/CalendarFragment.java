package com.example.fantalega;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CalendarFragment extends Fragment {

    int i = 1;
    String[] mioArray = {"Culurgiones Fc", "AC Cipicchia", "San Benedetto FC", "Ac Milan", "Juventus FC", "Inter Fc",
            "As Lazio", "As Roma", "Pog Drug", "Sant'anna Fc"};

    public CalendarFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_calendar, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button avanti = view.findViewById(R.id.giornata_avanti);
        Button indetro = view.findViewById(R.id.giornata_indietro);
        List<TextView> squadre = new ArrayList<>();

        TextView giornata = view.findViewById(R.id.giornata);
        squadre.add(view.findViewById(R.id.squadra_1));
        squadre.add(view.findViewById(R.id.squadra_2));
        squadre.add(view.findViewById(R.id.squadra_3));
        squadre.add(view.findViewById(R.id.squadra_4));
        squadre.add(view.findViewById(R.id.squadra_5));
        squadre.add(view.findViewById(R.id.squadra_6));
        squadre.add(view.findViewById(R.id.squadra_7));
        squadre.add(view.findViewById(R.id.squadra_8));
        squadre.add(view.findViewById(R.id.squadra_9));
        squadre.add(view.findViewById(R.id.squadra_10));
        giornata.setText(i + "° Giornata");
        mescolaArray(mioArray);
        int j = 0;
        for (TextView text : squadre) {

            text.setText(mioArray[j]);
            j++;
        }
        avanti.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (i < 38) {
                    i++;

                    giornata.setText(i + "° Giornata");
                    mescolaArray(mioArray);
                    int j = 0;
                    for (TextView text : squadre) {

                        text.setText(mioArray[j]);
                        j++;
                    }
                }
            }
        });
        indetro.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (i > 1) {
                    i--;
                    giornata.setText(i + "° Giornata");
                    mescolaArray(mioArray);
                    int j = 0;
                    for (TextView text : squadre) {

                        text.setText(mioArray[j]);
                        j++;
                    }
                }
            }
        });


    }

    public static void mescolaArray(String[] array) {

        List<String> lista = Arrays.asList(array);
        Collections.shuffle(lista);

    }
}
