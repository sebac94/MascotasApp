package com.example.mascotasapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {
    ArrayList<Mascota> listDatos;

    public AdapterDatos(ArrayList<Mascota> listDatos) {
        this.listDatos = listDatos;
    }

    @NonNull
    @Override
    public AdapterDatos.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlist,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDatos.ViewHolderDatos holder, int position) {
       // holder.asignarDatos(listDatos.get(position));
        holder.nombre.setText(listDatos.get(position).getNombre());
        holder.foto.setImageResource(listDatos.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView nombre;
        ImageView foto;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            nombre=(TextView) itemView.findViewById(R.id.idDato);
            foto=(ImageView) itemView.findViewById(R.id.idImagen);
        }

        /*public void asignarDatos(String s) {
            dato.setText(s);
        }*/
    }
}
