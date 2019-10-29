package com.example.kuis1mprecycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> mahasiswaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview_1);

        adapter = new KeluargaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Keluarga("Minato Namikaze", "Kakek", R.drawable.gam1));
        mahasiswaArrayList.add(new Keluarga("Kushina Uzumaki", "Nenek", R.drawable.gam2));
        mahasiswaArrayList.add(new Keluarga("Naruto Uzumaki", "Ayah", R.drawable.gam3));
        mahasiswaArrayList.add(new Keluarga("Hinata Hyuuga", "Adik 1", R.drawable.gam4));
        mahasiswaArrayList.add(new Keluarga("Boruto & Himawari", "Kakak & Adik",R.drawable.gam5));
    }
}


