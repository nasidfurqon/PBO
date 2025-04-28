// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 23 April 2025
// File         : Pegawai.java
// Deskripsi    : Program untuk menyimpan Parent, Pegawai

package PostTest;

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public Pegawai(){
        nama = "";
    }
    public Pegawai(String nama){
        this.nama = nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji Pokok: " + gajiPokok);
    }
}