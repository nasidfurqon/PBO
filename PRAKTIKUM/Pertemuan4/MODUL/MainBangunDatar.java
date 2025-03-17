// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 14 Maret 2025
// File         : MainBangunDatar.java
// Deskripsi    : Driver untuk Bangun Datar   

public class MainBangunDatar {
    public static void main(String[] args) {
        BangunDatar objekBangunDatar = new BangunDatar(12, "Red", "Tebal");
        objekBangunDatar.printInfo();
        System.out.println();
        
        System.out.println("mengganti border dan jumlah sisi untuk objekBangunDatar!");
        objekBangunDatar.setBorder("Tipis");
        objekBangunDatar.setJmlSisi(10);
        objekBangunDatar.printInfo();
        System.out.println();

        Persegi persegi1 = new Persegi(4, "Green", "Tipis");
        persegi1.printInfo();
        System.out.println("Luas dari persegi persegi1 = "+ persegi1.getLuas());
        System.out.println("Keliling dari persegi persegi1 = "+ persegi1.getKeliling());
        System.out.println("digaonal dari persegi persegi1 = " + persegi1.getDiagonal());
        System.out.println();

        System.out.println("mengganti nilai sisi untuk persegi1");
        persegi1.setSisi(10);
        persegi1.printInfo();
        System.out.println("Luas dari persegi persegi1 = "+ persegi1.getLuas());
        System.out.println("Keliling dari persegi persegi1 = "+ persegi1.getKeliling());
        System.out.println("digaonal dari persegi persegi1 = " + persegi1.getDiagonal());
        System.out.println();
        
        Lingkaran lingkaran1 = new Lingkaran(10, "Blue", "Normal");
        lingkaran1.printInfo();
        System.out.println("Luas dari lingkaran lingkaran1 = "+ lingkaran1.getLuas());
        System.out.println("Keliling dari lingkaran lingkaran1 = "+ lingkaran1.getKeliling());
        System.out.println();

        System.out.println("mengganti nilai jari untuk lingkaran1");
        lingkaran1.setJari(15);
        lingkaran1.printInfo();
        System.out.println("Luas dari lingkaran lingkaran1 = "+ lingkaran1.getLuas());
        System.out.println("Keliling dari lingkaran lingkaran1 = "+ lingkaran1.getKeliling());
        
        BangunDatar.printCounterBangunDatar();
    }
}
