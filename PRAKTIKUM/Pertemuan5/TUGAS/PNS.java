// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 24 Maret 2025
// File         : PNS.java
// Deskripsi    : Program untuk menyimpan Child, PNS

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia {
    private String nip;
    private static int counterPNS;

    public PNS() {
        super();
        nip = "";
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, "", pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    // MASA KERJA DALAM HARI
    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(tgl_mulai_kerja, now);
        int total = period.getYears() * 365 + period.getMonths() * 30 + period.getDays();
        return total + 2;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP                 : " + getNip());
        System.out.println("Masa Kerja          : " + hitungMasaKerja() / 365 + " tahun " + (hitungMasaKerja() % 365) / 30 + " bulan " + (hitungMasaKerja() % 365) % 30 + " hari");
    }

    @Override
    public double hitungPajak() {
        return this.getPendapatan() * 0.1;
    }
}