package com.marianamontano.petface;

public class Detalle_Mascotas {
    private String nombre_mascota;
    private int photo;
    int fav;

    public Detalle_Mascotas(String nombre_mascota, int photo) {
        this.nombre_mascota = nombre_mascota;
        this.photo = photo;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public int getFoto() {
        return photo;
    }

    public int getFav() {
        return fav;
    }

    public void setFav(int fav) {
        this.fav = fav;
    }

    public void setFoto(int photo) {
        this.photo = photo;
    }
}
