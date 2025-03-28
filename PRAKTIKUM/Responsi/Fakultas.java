// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 28 Maret 2025
// File         : Fakultas.java
// Deskripsi    : Class untuk menyimpan Fakultas

public class Fakultas{
    private String nama;
    private double tarifUKT;
    private double gajiPokok;

    public Fakultas(){
        nama = "";
        tarifUKT = 0.0;
        gajiPokok = 0.0;
    }

    public Fakultas(String nama, double tarifUKT, double gajiPokok){
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }

    public String getNama(){
        return nama;
    }

    public double gettarifUKT(){
        return tarifUKT;
    }

    public double getGajiPokok(){
        return gajiPokok;
    }

    public void setNama(String n){
        nama = n;
    }

    public void settarifUKT(double tarifUkt){
        tarifUKT = tarifUkt;
    }

    public void setGajiPokok(double gaji){
        gajiPokok = gaji;
    }
}