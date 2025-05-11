package Modul;
// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 7 Mei 2025
// File         : Lingkaran.java
// Deskripsi    : implementasi Lingkaran sebagai BangunDatar

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}
