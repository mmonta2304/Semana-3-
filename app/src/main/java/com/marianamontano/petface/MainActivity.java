package com.marianamontano.petface;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.marianamontano.petface.adapter.MascotaAdaptador;
import com.marianamontano.petface.adapter.PageAdapter;
import com.marianamontano.petface.fragment.PerfilFragment;
import com.marianamontano.petface.fragment.RecyclerViewFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    public ImageButton btnEstrella;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidx.appcompat.widget.Toolbar miActionBar = findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout)  findViewById(R.id.tabLayout);
        viewPager = (ViewPager)  findViewById(R.id.viewPager);
        setUpViewPager();


        btnEstrella = (ImageButton)  findViewById(R.id.btnEstrella);


        if ((toolbar != null)){
            setSupportActionBar(toolbar);
        }

        btnEstrella.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Top 5 de Animales ",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Detalle_Mascotas.class);
                startActivity(intent);

            }
        });


    }

    private void setUpViewPager() {
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragment()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_doghouse);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_dogface);
    }

    private ArrayList<Fragment> agregarFragment(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new RecyclerViewFragment());
        fragments.add(new PerfilFragment());
        return  fragments;
    }


    private void setSupportActionBar(android.widget.Toolbar miActionBar) {
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
            case R.id.mAbout:
                Intent j = new Intent(this, about.class);
                startActivity(j);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}