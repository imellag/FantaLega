package com.example.fantalega;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.example.fantalega.campionato.AccediCampionatoActivity;
import com.example.fantalega.campionato.CreaCampionatoActivity;
import com.example.fantalega.login.LoginActivity;

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

        Button logout = view.findViewById(R.id.logout);

        logout.setOnClickListener(v -> {

            mostraPopUpDiConferma();

        });


        accedi.setOnClickListener(v -> {

            Intent intent = new Intent(getActivity(), AccediCampionatoActivity.class);
            startActivity(intent);

        });

        crea.setOnClickListener(v -> {

            Intent intent = new Intent(getActivity(), CreaCampionatoActivity.class);
            startActivity(intent);

        });
    }


    private void mostraPopUpDiConferma() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Logout");
        builder.setMessage("Vuoi effettuare il logout?");

        builder.setPositiveButton("Conferma", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });


        builder.setNegativeButton("Annulla", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
