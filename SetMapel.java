package com.dicoding.javafundamental.collection;

import java.util.*;

//Daftar Mata Pelajaran Dengan Implementasi HashSet
public class SetMapel {
    public static void main(String[] args){
        Set<String> mapel = new HashSet<>();
        mapel.add("Matematika");
        mapel.add("IPA");
        mapel.add("IPA"); //Data "IPA" diisi double tapi hanya 1x ditampilkan
        mapel.add("Bahasa Indonesia");
        mapel.add("PKN");
        //Method add() untuk menambahkan data ke dalam Set mapel

        System.out.println("Jumlah Mapel: "+ mapel.size());
        //Method size() untuk mendapatkan ukuran dari Set mapel

        //Looping for untuk menampilkan isi dari Set mapel
        System.out.println("Daftar Mapel:");
        for(String mapel2 : mapel){
            System.out.println("\t"+ mapel2);
        }

        mapel.remove("Matematika");
        //Method remove() untuk menghapus data "Matematika" dari Set mapel

        System.out.println("\nJumlah Mapel: "+ mapel.size());
        System.out.println("Daftar Mapel Baru:");
        for(String mapel2 : mapel){
            System.out.println("\t"+ mapel2);
        }
    }
}
