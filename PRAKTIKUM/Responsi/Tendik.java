// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 28 Maret 2025
// File         : Tendik.java
// Deskripsi    : Class untuk menyimpan Tendik, Tendik merupakan child dari Karyawan

public class Tendik extends Karyawan{
    private static int counter;

    public Tendik(){
        super();
        counter ++;
    }

    public Tendik(String nama, String email, String NIP, int masaKerja){
        super(nama, email, NIP, masaKerja);
        counter ++;
    }

    public static int getCounterTendik(){
        return counter;
    }
    
    @Override
    public double getGaji(){
        return 4000000 + (masaKerja * 0.01 * 4000000);
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Gaji    : "+ getGaji());
    }
}
