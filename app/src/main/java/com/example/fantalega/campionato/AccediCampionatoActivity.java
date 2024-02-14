package com.example.fantalega.campionato;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.FragmentActivity;
import com.example.fantalega.R;

public class AccediCampionatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accedi_campionato);

        Button accedi = findViewById(R.id.entra_campionato);
        TextView crea = findViewById(R.id.create);

        accedi.setOnClickListener(v -> {

            mostraPopUpDiConferma();
        });

        crea.setOnClickListener(v -> {
            Intent intent = new Intent(this, CreaCampionatoActivity.class);
            startActivity(intent);
            finish();
        });

    }

    private void mostraPopUpDiConferma() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Conferma Azione");
        builder.setMessage("Vuoi entrare nella lega Culurgiones FC?");

        builder.setPositiveButton("Conferma", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent intent = new Intent(AccediCampionatoActivity.this, FragmentActivity.class);
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
