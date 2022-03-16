package com.dicoding.javafundamental.collection;

public class Mapel {
    private String nama, hari;

    public Mapel(String nama, String hari){
        this.nama = nama;
        this.hari = hari;
    }

    @Override
    public String toString(){
        return "Mapel " + nama + " di hari " + hari;
    }
}
