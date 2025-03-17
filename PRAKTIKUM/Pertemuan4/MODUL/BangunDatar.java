// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 14 Maret 2025
// File         : BangunDatar.java
// Deskripsi    : Program untuk menyimpan parent, BangunDatar

public class BangunDatar{
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: "+ counterBangunDatar);
    }
    
    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi: "+jmlSisi);
        System.out.println("Warna: "+warna);
        System.out.println("Border: "+border);
    }
}

/* SOAL  : tambahkan keyword final pada method printInfo() di dalam kelas BangunDatar.
 Bagaimana pengaruhnya dengan method printInfo() pada kelas Persegi dan Lingkaran?
    JAWABAN  : method printInfo() pada kelas Persegi dan Lingkaran menjadi erorr. 
    hal ini karena atribut final pada dasarnya tidak bisa dilakukan override pada child, sehingga tidak bisa digunakan.
 */

