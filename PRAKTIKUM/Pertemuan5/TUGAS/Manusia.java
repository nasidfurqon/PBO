// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 24 Maret 2025
// File         : Manusia.java
// Deskripsi    : Program untuk menyimpan Parent, Manusia

import java.time.LocalDate;

public abstract class Manusia implements Pajak {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns;

    public Manusia() {
        nama = "";
        tgl_mulai_kerja = LocalDate.now();
        alamat = "";
        pendapatan = 0;
        counterMns++;
    }

    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public static void setCounterMns(int counterMns) {
        Manusia.counterMns = counterMns;
    }

    public void cetakInfo() {
        System.out.println("Nama                : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + tgl_mulai_kerja);
        System.out.println("Alamat              : " + alamat);
        System.out.printf("Pendapatan          : %.2f%n", pendapatan);
    }

    public abstract int hitungMasaKerja();
}