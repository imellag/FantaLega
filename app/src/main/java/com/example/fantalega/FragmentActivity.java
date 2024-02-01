package com.example.fantalega;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

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
                .commit();

    }
}
