// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 14 Maret 2025
// File         : Persegi.java
// Deskripsi    : Program untuk menyimpan child, Persegi

public class Persegi extends BangunDatar{
    private double sisi;
    private static int counterPersegi = 0;
    
    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi*sisi;
    }
    
    public double getKeliling(){
        return sisi*4;
    }

    public double getDiagonal(){
        return Math.sqrt(2) * sisi;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: "+ sisi);
    }

    public static void printCounterPersegi(){
        System.out.println("Jumlah Objek Peregi: "+ counterPersegi);
    }
}
