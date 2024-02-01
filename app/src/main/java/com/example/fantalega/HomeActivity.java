package com.example.fantalega;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
import com.example.fantalega.campionato.ChampionshipActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Pulsante per la sezione "Campionati"
        Button btnChampionships = findViewById(R.id.btnCampionati);
        btnChampionships.setOnClickListener(v -> {
            // Apri la schermata dei campionati
            Intent intent = new Intent(HomeActivity.this, ChampionshipActivity.class);
            startActivity(intent);
        });
    }
}
public class MenuPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;

    public MenuPagerAdapter(FragmentManager fragmentManager, List<Fragment> fragments) {
        super(fragmentManager);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
public class MenuItemFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_menu, container, false);
        // Personalizza la vista con i dati dell'elemento del menu
        return view;
    }
}



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button elemento1 = findViewById(R.id.elemento1);
        elemento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Elemento 1 cliccato", Toast.LENGTH_SHORT).show();
                // Aggiungi qui il codice per gestire il clic sull'elemento 1
            }
        });

        Button elemento2 = findViewById(R.id.elemento2);
        elemento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Elemento 2 cliccato", Toast.LENGTH_SHORT).show();
                // Aggiungi qui il codice per gestire il clic sull'elemento 2
            }
        });

        // Aggiungi più pulsanti e gestisci i clic come necessario

    }
}