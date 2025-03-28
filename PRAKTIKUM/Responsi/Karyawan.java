// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 28 Maret 2025
// File         : Karyawan.java
// Deskripsi    : Class untuk menyimpan Karyawan, Karyawan merupakan child dari Civitas Akademika

public abstract class Karyawan extends CivitasAkademika {
    protected String NIP;
    protected int masaKerja;

    public Karyawan(){
        super();
        NIP = "";
        masaKerja = 0;
    }

    public Karyawan(String nama, String email, String NIP, int masaKerja){
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
    }

    public String getNIP(){
        return NIP;
    }

    public int getMasaKerja(){
        return masaKerja;
    }

    public void setNIP(String nip){
        NIP = nip;
    }

    public void setMasaKerja(int masaKerja){
        this.masaKerja = masaKerja;
    }

    public abstract double getGaji();

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIP :" + getNIP());
        System.out.println("masaKerja   :" + getMasaKerja());
    }
}
