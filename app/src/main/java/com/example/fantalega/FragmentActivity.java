package com.example.fantalega;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;


public class FragmentActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_container);
        // Pulsante per la sezione "Campionati"

        ChipNavigationBar navigationBar = findViewById(R.id.navigation_bar);
        Fragment fragment= new HomeFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_main, fragment)
                .setReorderingAllowed(true)
                .addToBackStack("")
                .commit();
        navigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int id) {

                Fragment fragment1 = null;
                FragmentManager fragmentManager;

                if (id == R.id.navigation_calendar) {
                    fragment1 = new CalendarFragment();
                } else if (id == R.id.navigation_campionato) {
                    fragment1 = new CampionatoFragment();
                } else if (id == R.id.navigation_classifica) {
                    fragment1 = new ClassificaFragment();

                } else if (id == R.id.navigation_home) {
                    fragment1 = new HomeFragment();

                }
                if (fragment1 != null) {
                    fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragment_main, fragment1)
                            .setReorderingAllowed(true)
                            .addToBackStack("")
                            .commit();
                }
            }

        });

    }
}
