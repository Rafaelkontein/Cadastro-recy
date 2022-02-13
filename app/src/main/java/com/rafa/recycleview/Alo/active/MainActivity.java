package com.rafa.recycleview.Alo.active;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.rafa.recycleview.Alo.Model.Model;
import com.rafa.recycleview.Alo.Model.RecyclerClickListener;
import com.rafa.recycleview.Alo.adapter.Adapter;
import com.rafa.recycleview.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private List<Model> cadastro= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

         // listagem de filmes
        this.criarFilmes();

        // Aqui é gerenciador de layot

        Adapter adapter=new Adapter(cadastro);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

    }

    public void criarFilmes(){

        Model info=new Model("Razão Social", "Razão Social");
        this.cadastro.add(info);

        info=new Model("CEP", "CEP");
        this.cadastro.add(info);





        info=new Model("Endereço", "Endereço");
        this.cadastro.add(info);

        info=new Model("Numero", "Numero");
        this.cadastro.add(info);

        info=new Model("Complemento", "Complemento");
        this.cadastro.add(info);

        info=new Model("Bairro", "Bairro");
        this.cadastro.add(info);
        info=new Model("Cidade", "Cidade");
        this.cadastro.add(info);
        info=new Model("UF", "estado");
        this.cadastro.add(info);



    }
}
