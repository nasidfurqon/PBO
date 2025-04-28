// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 23 April 2025
// File         : TesPolimorfisme.java
// Deskripsi    : Program untuk menyimpan driver

package PostTest;
import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

// PERTANYAAN : 
// 1. Jelaskan manfaat polimorfisme pada kasus ini.
// 2. Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! Apa permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?

// JAWABAN : 
// 1. Efisiensi kode di main, sehingga lebih sederhana dan  fleksibel.  
// 2. Kita harus menyimpan objek pada tipe aslinya. Selain itu, kita tidak dapat menyimpan semua objek dalam satu array yang bertipe Pegawai.