package com.thunderbolt.android.vista;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.db.android.facade.ProyectoFacade;
import com.db.android.facade.ProyectoFacadeLocal;
import com.db.android.model.Proyecto;
import com.thunderbolt.android.R;
import com.thunderbolt.android.vista.adaptador.RecyclerViewAdapterProyectos;
import com.thunderbolt.android.vista.utils.CrearPDF;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InicioActivity extends AppCompatActivity implements View.OnClickListener{

    private RecyclerView.LayoutManager manager;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        setToolbar();

        recyclerView = (RecyclerView) findViewById(R.id.listaProyectos);
        List<Proyecto> proyectos= new ArrayList<>();
        ProyectoFacadeLocal proyectoFacadeLocal = new ProyectoFacade();
        try {
            proyectos.addAll(proyectoFacadeLocal.buscarProyectos());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        RecyclerViewAdapterProyectos adaptador = new RecyclerViewAdapterProyectos(proyectos);
        manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adaptador);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.btnNuevoProyecto);
        fab.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnNuevoProyecto:
                Intent intent= new Intent(this,CrearProyectoActivity.class);
                intent.putExtra("editar",true);
                intent.putExtra("crear",true);
                startActivity(intent);
                break;
        }
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setTitle("Proyectos");
        }
    }
}
