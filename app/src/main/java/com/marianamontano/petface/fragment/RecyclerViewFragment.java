package com.marianamontano.petface.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.marianamontano.petface.Detalle_Mascotas;
import com.marianamontano.petface.R;
import com.marianamontano.petface.adapter.MascotaAdaptador;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {
    private ArrayList<Detalle_Mascotas> mascotas;
    private RecyclerView ListaMascotas;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);
        ListaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        ListaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializaAdaptador();
        return v;
    }

    public MascotaAdaptador adaptador;
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

}
