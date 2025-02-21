/*
 * Nama File : MGaris.java
 * Deskripsi : berisi realisasi dan driver dari class Garis
 * Pembuat   : Khoirul Nasid Furqon - 24060123120042
 * Tanggal   : 19 Februari 2025
 */

public class MGaris {
    public static void main(String[] args){
        Garis G1 = new Garis(); // Membuat Garis G1((0,0),(0,0))
        Garis G2 = new Garis(new Titik(1,5), new Titik(5,1)); // Membuat Garis G1((1,5),(5,1))
        Garis G3 = new Garis(new Titik(2,3), new Titik(6,7)); // Membuat Garis G1((2,3),(6,7)))

        
        Titik T1 = new Titik(1, 1); // Membuat Titik T1(1,1)
        Titik T2 = new Titik(5, 5); // Membuat Titik T1(5,5)
        G1.setTitikAwal(T1); // mengubah koordinat titik awal dengan nilai dari Titik T1
        G1.setTitikAkhir(T2); // mengubah koordinat titik awal dengan nilai dari Titik T1
        System.out.println("GARIS G1 = ");
        G1.printGaris(); // Mencetak koordinat titik awal dan titik akhir dari Garis G1 ke layar
        System.out.println("GARIS G2 = ");
        G2.printGaris(); // Mencetak koordinat titik awal dan titik akhir dari Garis G2 ke layar
        System.out.println("GARIS G3 = ");
        G3.printGaris(); // Mencetak koordinat titik awal dan titik akhir dari Garis G3 ke layar

        System.out.println("koordinat Titik awal dari garis G1 = "); // Mencetak koordinat titik awal dari garis G1
        G1.getTitikAwal().printTitik();
        System.out.println("koordinat Titik akhir dari garis G1 = "); // mencetak koordinat titik akhir dari garis G1
        G1.getTitikAkhir().printTitik();
        System.out.println("Jumlah objek garis = "  + Garis.getCounterGaris());

        System.out.println("panjang dari garis G1 = " + G1.getPanjangGaris()); // mengembalikan nilai dari panjang garis G1
        
        System.out.println("Kemiringan dari garis G1 = " + G1.getGradienGaris()); // memgembalikan nilai kemiringan dari garis G1
        
        System.out.println("Titik tengah dari garis G1 = "); // mengembalikan koordinat titik tengah dari garis G1
        (G1.getTitikTengah()).printTitik();

        System.out.println("Apakah garis G1 sejajar dengan Garis G2  = " + G1.isSejajar(G2)); // mengecek apakah garis G1 sejajar dengan garis G2
        System.out.println("Apakah garis G1 sejajar dengan Garis G3  = " + G1.isSejajar(G3)); // mengecek apakah garis G1 sejajar dengan garis G3
    
        System.out.println("Apakah garis G1 tegak lurus dengan Garis G2  = " + G1.isTegakLurus(G2)); // mengecek apakah garis G1 tegak lurus dengan garis G2
        System.out.println("Apakah garis G1 tegak lurus dengan Garis G3  = " + G1.isTegakLurus(G3)); // mengecek apakah garis G1 tegak lurus dengan garis G3

        System.out.println("Persamaan garis dari G1 menjadi = ");
        G1.printPersamaanGaris(); // mencetak persamaan garis G1
        System.out.println("Persamaan garis dari G2 menjadi = ");
        G2.printPersamaanGaris(); // mencetak persamaan garis G2
        System.out.println("Persamaan garis dari G3 menjadi = ");
        G3.printPersamaanGaris(); // mencetak persamaan garis G3
    }
}
