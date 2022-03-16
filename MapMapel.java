package com.dicoding.javafundamental.collection;

import java.util.HashMap;
import java.util.Map;

//Daftar Mata Pelajaran Dengan Implementasi HashMap
public class MapMapel {
    public static void main(String[] args){
        Map<String, Mapel> mapel = new HashMap();
        mapel.put("1", new Mapel("Matematika", "Senin"));
        mapel.put("2", new Mapel("IPA", "Rabu"));
        mapel.put("3", new Mapel("IPS", "Kamis"));
        mapel.put("4", new Mapel("Bahasa Indonesia", "Selasa"));
        mapel.put("5", new Mapel("Bahasa Inggris", "Jumat"));
        //Method put() untuk menambahkan data ke Map mapel

        System.out.println("Jumlah Mapel: " + mapel.size());
        //Method size() untuk mendapatkan ukuran dari Map mapel

        //Looping for untuk menampilkan isi dari Map mapel
        System.out.println("Daftar Mapel:");
        for(String key : mapel.keySet()){
            System.out.println("\t" + key + ". " + mapel.get(key));
            //Method get() untuk mendapatkan isi Map mapel dengan key
        }

        mapel.remove("1");
        //Method remove() untuk menghapus data dari Set mapel dengan key "1"

        System.out.println("\nJumlah Mapel: " + mapel.size());
        System.out.println("Daftar Mapel:");
        for(String key : mapel.keySet()){
            System.out.println("\t" + key + ". " + mapel.get(key));
        }
    }
}
