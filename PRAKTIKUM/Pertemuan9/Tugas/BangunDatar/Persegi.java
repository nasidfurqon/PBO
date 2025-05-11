
// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 10 Mei 2025
// File         : Persegi.java
// Deskripsi    : implementasi Persegi sebagai BangunDatar

public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}
