package Generik;
// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 3 Mei 2025
// File         : ContohMetodeGenerik.java
// Deskripsi    : Prgram untuk mengendalikan kelas Datum

public class ContohMetodeGenerik {
     public <T extends Anabul> void PrintDatum(Datum<T> datum) {
        T anabul = datum.getIsi();

        if (anabul != null){
            System.out.println("Nama Anabul: " + anabul.getNama());
            anabul.Gerak();
            anabul.Bersuara();
        } 
        else{
            System.out.println("Kosong");
        }
    }

    public <T> void setIsiData(Datum<T> datum, T data) {
        datum.setIsi(data);
    }

    public static void main(String[] args) {
        Anabul anabul1 = new Kucing("budi");
        Anabul anabul2 = new Anjing("budii");
        ContohMetodeGenerik controller = new ContohMetodeGenerik();
        Datum<Anabul> x = new Datum<>();
        
        x.setIsi(anabul1);
        controller.PrintDatum(x);
        System.out.println();

        controller.setIsiData(x, anabul2);
        controller.PrintDatum(x);

    }
}
