// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 14 Maret 2025
// File         : BangunDatar.java
// Deskripsi    : Program untuk menyimpan parent, BangunDatar

public abstract class BangunDatar{
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

    public abstract double getLuas();
    public abstract double getKeliling();
    
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}

/* SOAL  : 
1. Apakah method yang dibuat pada langkah nomor 4 dapat digunakan untuk membandingkan objek
bangun datar yang berbeda?
2. Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah Anda membuat method isEqualLuas()
dan isEqualKeliling pada class BangunDatar? Mengapa?
3. Apakah kelebihan saat class BangunDatar dijadikan sebagai abstract class daripada non-abstract class?
JAWABAN :
1. Bisa. hal ini karena masih digunakan untuk membandingkan antara objek bangun datar. Lalu kedua method tersebut juga membandingkan nilai hasil perhitungan luas dan keliling, bukan tipe spesifik objeknya.
2. Tidak bisa. Hal ini karena isEqualLuas() dan isEqualKeliling() memanggil getLuas() dan getKeliling(), yang hanya ada di BangunDatar.
3. Mencegah inisiasi langsung dan memastikan seluruh child mewarisi method abstract dari parent, sehingga lebih serasi
 */

