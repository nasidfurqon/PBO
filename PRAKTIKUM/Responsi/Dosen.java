// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 28 Maret 2025
// File         : Dosen.java
// Deskripsi    : Class untuk menyimpan Dosen, Dosen merupakan child dari Karyawan

public class Dosen extends Karyawan {
    private Fakultas fakultas;
    private static int counter;

    public Dosen(){
        super();
        fakultas =  new Fakultas();
        counter ++;
    }

    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas){
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
        counter ++;
    }
    
    public static int getCounterDosen(){
        return counter;
    }

    public Fakultas getFakultas(){
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas){
        this.fakultas = fakultas;
    }

    @Override
    public double getGaji(){
        return fakultas.getGajiPokok() + (masaKerja * 0.01 * fakultas.getGajiPokok());
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas    : " + fakultas.getNama());
        System.out.println("Gaji    : " + getGaji());
    }
}
