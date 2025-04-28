// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 23 April 2025
// File         : Programmer.java
// Deskripsi    : Program untuk menyimpan Child, Programmer


package PostTest;

public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
