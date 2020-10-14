package com.marianamontano.petface;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Detalle_Mascotas> mascotas;
    private RecyclerView ListaMascotas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar ActionBar = findViewById(R.id.actionbar);
        setSupportActionBar(ActionBar);


        ListaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        ListaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializaAdaptador();

    }

    public void inicializaAdaptador (){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        ListaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas () {

        mascotas = new ArrayList<Detalle_Mascotas>();
        mascotas.add(new Detalle_Mascotas("Sonya",R.drawable.sonya));
        mascotas.add(new Detalle_Mascotas("Saba",R.drawable.saba));
        mascotas.add(new Detalle_Mascotas("Kira",R.drawable.kira));
        mascotas.add(new Detalle_Mascotas("Nala",R.drawable.nala));
        mascotas.add(new Detalle_Mascotas("Tango",R.drawable.tango));
        mascotas.add(new Detalle_Mascotas("Danco",R.drawable.danco));
        mascotas.add(new Detalle_Mascotas("Jessy",R.drawable.jessy));
        mascotas.add(new Detalle_Mascotas("Rocco",R.drawable.rocco));
        mascotas.add(new Detalle_Mascotas("Booster",R.drawable.boster));
        mascotas.add(new Detalle_Mascotas("Zeus",R.drawable.zeus));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_over, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.Configuracion:
                Intent intent=new Intent(this, ajustes.class);
                startActivity(intent);
                break;
        }
        switch (item.getItemId()){
            case R.id.btFav:
                Intent i = new Intent(this, preferido.class);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}