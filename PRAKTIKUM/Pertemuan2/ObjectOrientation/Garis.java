/*
 * Nama File : Garis.java
 * Deskripsi : berisi atribut dan method dalam class Garis
 * Pembuat   : Khoirul Nasid Furqon - 24060123120042
 * Tanggal   : 19 Februari 2025
 */

public class Garis {
    // ATRIBUT
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // METHOD
    // KONSTRUKTOR

    // konstruktor untuk membuat Garis((0,0), (0,0))
    public Garis(){
        titikAwal = new Titik(0,0);
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    // konstruktor untuk membuat Garis dengan nilai titik awal dan titik akhir dari input user
    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris ++;
    }

    public static int getCounterGaris(){
        return counterGaris;
    }

    // SELEKTOR
    // GETTER
    // mengembalikan nilai titik awal
    public Titik getTitikAwal(){
        return titikAwal;   
    }
    
    // mengembalikan nilai titik akhir
    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    // SETTER
    // mengeset titik awal dengan nilai baru titik
    public void setTitikAwal(Titik titik){
        titikAwal = titik;
    }

    // mengeset titik akhir dengan nilai baru titik
    public void setTitikAkhir(Titik titik){
        titikAkhir = titik;
    }

    // mengembalikan nilai dari panjang garis
    public double getPanjangGaris(){
        return titikAwal.getJarak(titikAkhir);
    }

    // mengembalikan kemiringan dari garis
    public double getGradienGaris(){
        return ((titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis()));
    }

    // mengembalikan titik tengah dari garis
    public Titik getTitikTengah(){
        return new Titik((titikAwal.getAbsis() + titikAkhir.getAbsis())/2, (titikAwal.getOrdinat() + titikAkhir.getOrdinat())/2);
    }

    // mengembalikan true jika garis sejajar dengan garis baru, dan false jika tidak
    public boolean isSejajar(Garis garis){
        return this.getGradienGaris() == garis.getGradienGaris(); 
    }

    // mengembalikan true jika garis tegak lurus dengan garis baru, dan false jik   a tidak
    public boolean isTegakLurus(Garis garis){
        return (this.getGradienGaris() * garis.getGradienGaris()) == -1.0;
    }

    // menampilkan titik awal dan titik akhir dari garis ke layar
    public void printGaris(){
        System.out.println("Garis  = ((" + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() +"), (" + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat() + "))");
    }

    // menampilkan persamaan garis
    public void printPersamaanGaris(){
        System.out.println("y = " + getGradienGaris() + "x + " + (titikAwal.getOrdinat() - (getGradienGaris()*titikAwal.getAbsis())));
    }

    // end class garis
}
