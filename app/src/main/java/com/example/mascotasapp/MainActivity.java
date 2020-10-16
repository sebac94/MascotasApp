package com.example.mascotasapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Mascota> listDatos;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler=(RecyclerView) findViewById(R.id.rvLista);
        recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        listDatos=new ArrayList<Mascota>();
        cargarMascotas();
        AdapterDatos adapter = new AdapterDatos(listDatos);
        recycler.setAdapter(adapter);

        ImageButton test = (ImageButton) findViewById(R.id.btnVolver);
        test.setVisibility(View.INVISIBLE);


    }

    private void cargarMascotas() {
        listDatos.add(new Mascota("Ricky",R.drawable.uno_opt));
        listDatos.add(new Mascota("Molo",R.drawable.dos_opt));
        listDatos.add(new Mascota("Tomi",R.drawable.tres_opt));
        listDatos.add(new Mascota("Yaki",R.drawable.cuatro_opt));
        listDatos.add(new Mascota("Ben",R.drawable.cinco_opt));
    }

    public void irFavoritos(View v){
        Intent intent = new Intent(MainActivity.this, Favoritos.class);
        startActivity(intent);
    }

    public void irInicio(View v){
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }

}