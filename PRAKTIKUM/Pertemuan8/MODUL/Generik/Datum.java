package Generik;
// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 3 Mei 2025
// File         : Datum.java
// Deskripsi    : Program untuk menyimpan Generik, Datum

class Datum<X>{
    X isi;
    public X getIsi(){
        return this.isi;
    }

    public void  setIsi(X x){
        this.isi = x;
    }
}