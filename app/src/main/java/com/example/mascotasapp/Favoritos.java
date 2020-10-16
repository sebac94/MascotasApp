package com.example.mascotasapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Favoritos extends AppCompatActivity {

    ArrayList<Mascota> listDatos;
    RecyclerView recycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favoritos);

        recycler=(RecyclerView) findViewById(R.id.rvLista);
        recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        listDatos=new ArrayList<Mascota>();
        cargarMascotas();
        AdapterDatos adapter = new AdapterDatos(listDatos);
        recycler.setAdapter(adapter);
    }

    private void cargarMascotas() {
        listDatos.add(new Mascota("Ricky",R.drawable.uno_opt));
        listDatos.add(new Mascota("Ricky",R.drawable.uno_opt));
        listDatos.add(new Mascota("Ricky",R.drawable.uno_opt));
        listDatos.add(new Mascota("Ricky",R.drawable.uno_opt));
    }

}
