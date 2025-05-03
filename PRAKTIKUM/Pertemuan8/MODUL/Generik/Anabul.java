package Generik;
// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 26 April 2025
// File         : Anabul.java
// Deskripsi    : Program untuk menyimpan Parent, Anabul

public abstract class Anabul {
    private String nama;

    public Anabul(){
        nama = "";
    }

    public Anabul (String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String n){
        nama = n;
    }
    
    public abstract void Gerak();

    public abstract void Bersuara();
}