package com.marianamontano.petface;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class preferido extends AppCompatActivity {

    ArrayList<Detalle_Mascotas> mas;
    private RecyclerView LisMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preferido);

        Toolbar ActionBar = findViewById(R.id.actionbar);
        setSupportActionBar(ActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        LisMascotas = (RecyclerView) findViewById(R.id.rvMascotasPreferidas);

        LinearLayoutManager llam = new LinearLayoutManager(this);
        llam.setOrientation(LinearLayoutManager.VERTICAL);

        LisMascotas.setLayoutManager(llam);
        iniListaMascotas();
        iniAdaptador();

    }

    public void iniAdaptador (){
        MascotaAdaptador adaptador = new MascotaAdaptador(mas);
        LisMascotas.setAdapter(adaptador);
    }

    public void iniListaMascotas () {

        mas = new ArrayList<Detalle_Mascotas>();
        mas.add(new Detalle_Mascotas("Kira",R.drawable.kira));
        mas.add(new Detalle_Mascotas("Sonya",R.drawable.sonya));
        mas.add(new Detalle_Mascotas("Zeus",R.drawable.zeus));
        mas.add(new Detalle_Mascotas("Rocco",R.drawable.rocco));
        mas.add(new Detalle_Mascotas("Nala",R.drawable.nala));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_fav, menu);
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

        return super.onOptionsItemSelected(item);
    }


}