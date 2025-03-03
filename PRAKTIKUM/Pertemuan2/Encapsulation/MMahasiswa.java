/*
 * Nama File : MMahasiswa.java
 * Deskripsi : berisi atribut dan method dalam class MMahasiswa
 * Pembuat   : Khoirul Nasid Furqon - 24060123120042
 * Tanggal   : 27 Februari 2025
 */

public class MMahasiswa{
    public static void main(String[] args){
        // Inisialisasi
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah Jarkom = new MataKuliah("JARKOM", "Jaringan Komputer", 3);
        Mahasiswa mahasiswa = new Mahasiswa("24060123120042", "Khoirul", "Informatika");
        Dosen dosen = new Dosen("1234", "khoirul", "Informatika");
        Kendaraan motor = new Kendaraan("K 123 AB", "Mobil");
        
        mahasiswa.setDosen(dosen);
        mahasiswa.setKendaraan(motor);
        mahasiswa.addMatkul(PBO);
        mahasiswa.addMatkul(Jarkom);
        System.out.println("\nJumlah Mata Kuliah = " + mahasiswa.getJumlahMatkul());
        System.out.println("Jumlah SKS = " + mahasiswa.getJumlahSKS());
    }
}