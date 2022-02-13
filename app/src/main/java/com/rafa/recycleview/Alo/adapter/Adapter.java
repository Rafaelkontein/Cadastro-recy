package com.rafa.recycleview.Alo.adapter;

import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rafa.recycleview.Alo.Model.Model;
import com.rafa.recycleview.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Model> Listafilme;
    public Adapter(List<Model>lista) {

        this.Listafilme=lista;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista,parent,false);



        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Model filme =Listafilme.get( position );

        holder.info.setText(filme.getInfoo());
        holder.inp.setHint(filme.getInp());

    }

    @Override
    public int getItemCount() {
        return  Listafilme.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView info;
        EditText inp;
        public MyViewHolder( View itemView) {
            super(itemView);


            info=itemView.findViewById(R.id.infor);
            inp=itemView.findViewById(R.id.inp);

        }
    }
}
