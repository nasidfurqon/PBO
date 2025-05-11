package Modul;
// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 7 Mei 2025
// File         : BangunDatarGenericTest.java
// Deskripsi    : main class untuk generic bangun datar 

public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);

        System.out.println("keliling Lingkaran : " + bdg.hitungKeliling());
        System.out.println("tipe generic : " + bdg.get().getClass().getName());
    }   
}
