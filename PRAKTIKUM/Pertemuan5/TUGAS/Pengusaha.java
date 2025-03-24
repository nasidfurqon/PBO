// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 24 Maret 2025
// File         : Pengusaha.java
// Deskripsi    : Program untuk menyimpan Child, Pengusaha

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia {
    private String npwp;
    private static int counterPengusaha;

    public Pengusaha() {
        super();
        npwp = "";
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() {
        return npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    // MASA KERJA DALAM HARI
    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(tgl_mulai_kerja, now);
        int total = period.getYears() * 365 + period.getMonths() * 30 + period.getDays();
        return total + 4;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP                : " + getNpwp());
        System.out.println("Masa Kerja          : " + hitungMasaKerja() / 365 + " tahun " + (hitungMasaKerja() % 365) / 30 + " bulan "  + (hitungMasaKerja() % 365) % 30 + " hari");
    }

    @Override
    public double hitungPajak() {
        return this.getPendapatan() * 0.15;
    }
}