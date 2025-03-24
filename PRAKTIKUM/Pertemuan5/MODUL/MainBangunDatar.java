// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 14 Maret 2025
// File         : MainBangunDatar.java
// Deskripsi    : Driver untuk Bangun Datar   

public class MainBangunDatar {
    public static void main(String[] args) {
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

        // BangunDatar P1 = new BangunDatar() {};
        BangunDatar P2 = new Persegi(4, "Green", "Tipis");
        BangunDatar L1 = new Lingkaran(10, "Blue", "Normal");
        Lingkaran L2 = new Lingkaran (10, "Blue", "Normal");
        P2.printInfo();
        System.out.println();

        L1.printInfo();
        System.out.println();

        L2.printInfo();
        System.out.println();

        System.out.println("Apakah luas Persegi P1 dengan Lingkaran L1 sama ? " +P2.isEqualLuas(L1));
        System.out.println("Apakah keliling Persegi P1 dengan Lingkaran L1 sama ? " +P2.isEqualKeliling(L1));

        System.out.println();
        System.out.println("Sisi dari P2 sebelum di Resize = " + ((Persegi)P2).getSisi());
        ((Persegi)P2).zoomOut();
        System.out.println("Sisi dari P2 setelah di Resize menggunakan ZoomOut = " + ((Persegi)P2).getSisi());
        System.out.println();
    }
}
