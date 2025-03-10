package MATERI;
// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 7 Maret 2025
// File         : Asersi2.java
// Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai 0

import javax.print.DocFlavor.READER;

// class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0): "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

// JAWABAN : 
/* Konsep Asersi diatas masih salah karena asersi hanya digunakan dalam main, 
 * sehingga jika menggunakan kelas lingkaran di tempat lain, maka jari-jari 0 masih bisa lolos.
 * 
 */
