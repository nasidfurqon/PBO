// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 24 Maret 2025
// File         : Petani.java
// Deskripsi    : Program untuk menyimpan Child, Petani

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia {
    private String asal_kota;
    private static int counterPetani;

    public Petani() {
        super();
        asal_kota = "";
        counterPetani++;
    }

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota() {
        return asal_kota;
    }
    public static int getCounterPetani() {
        return counterPetani;
    }

    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    // MASA KERJA DALAM HARI
    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(tgl_mulai_kerja, now);
        int total = period.getYears() * 365 + period.getMonths() * 30 + period.getDays();
        return total + 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota           : " + getAsalKota());
        System.out.println("Masa Kerja          : " + hitungMasaKerja() / 365 + " tahun " + (hitungMasaKerja() % 365) / 30 + " bulan " + (hitungMasaKerja() % 365) % 30 + " hari");
    }

    @Override
    public double hitungPajak() {
        return 0;
    }
}