package MATERI;
// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 7 Maret 2025
// File         : AngkaSialException
// Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial!!!");
    }    
}
