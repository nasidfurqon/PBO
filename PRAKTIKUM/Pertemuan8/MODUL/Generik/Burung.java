package Generik;
// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 26 April 2025
// File         : Burung.java
// Deskripsi    : Program untuk menyimpan Child, Burung

public class Burung extends Anabul {
    public Burung(){
        super();
    }

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara Cuit");
    }
}
