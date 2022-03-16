package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//Daftar Mata Pelajaran Dengan Implementasi ArrayList
public class ListMapel {
    public static void main(String[] args){
        List<String> mapel = new ArrayList<>();
        mapel.add("Matematika");
        mapel.add("IPA");
        mapel.add("IPS");
        mapel.add("Bahasa Indonesia");
        //Method add() untuk menambahkan data ke dalam List mapel

        System.out.println("Jumlah Mapel: "+ mapel.size());
        //Method size() untuk mendapatkan ukuran dari List mapel

        //Looping for untuk menampilkan isi dari List mapel
        System.out.println("Daftar Mapel:");
        for(int i=0; i<mapel.size(); i++){
            System.out.println("\t"+ mapel.get(i));
            //Method get() untuk mendapatkan isi List mapel dengan indeks i
        }

        mapel.remove("IPS");
        //Method remove() untuk menghapus data "IPS" dari List mapel

        System.out.println("\nJumlah Mapel: "+ mapel.size());
        System.out.println("Daftar Mapel Baru:");
        for(int i=0; i<mapel.size(); i++){
            System.out.println("\t" + mapel.get(i));
        }
    }
}
