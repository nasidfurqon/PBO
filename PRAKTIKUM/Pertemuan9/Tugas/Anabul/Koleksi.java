package Tugas.Anabul;

// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 10 Mei 2025
// File         : Main.java
// Deskripsi    : Program untuk menyimpan Kelas Koleksi Anabul

import java.util.ArrayList;

public class Koleksi {
    private ArrayList<Anabul> koleksi;

    public Koleksi() {
        koleksi = new ArrayList<>();
    }

    public void add(Anabul anabul) {
        koleksi.add(anabul);
    }

    public void showAll() {
        for (Anabul anabul : koleksi) {
            System.out.println("Nama: " + anabul.getNama());
            anabul.Gerak();
            anabul.Bersuara();
            System.out.println();  
        }
    }
}