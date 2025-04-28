// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 23 April 2025
// File         : Manajer.java
// Deskripsi    : Program untuk menyimpan Child, Manajer

package PostTest;

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}