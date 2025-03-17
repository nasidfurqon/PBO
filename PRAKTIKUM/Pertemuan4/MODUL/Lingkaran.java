// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 14 Maret 2025
// File         : Lingkaran.java
// Deskripsi    : Program untuk menyimpan child, Lingkaran

public class Lingkaran extends BangunDatar{
    private double jari;
    private static int counterLingkaran = 0;
    
    public Lingkaran(){
        jari = 0;
    }

    public Lingkaran(double diameter, String warna, String border){
        jari = diameter/2;
        super(1, warna, border);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * Math.pow(jari, 2);
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo(){
        System.out.println("Jumlah Sisi: "+ jmlSisi);
        System.out.println("Warna: "+warna);
        System.out.println("Border: "+border);
        System.out.println("Jari: "+jari);
    }

    
    public static void printCounterLingkaran(){
        System.out.println("Jumlah Objek Lingkaran: "+ counterLingkaran);
    }
}
