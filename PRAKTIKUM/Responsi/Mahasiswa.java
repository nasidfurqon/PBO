// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 28 Maret 2025
// File         : Mahasiswa.java
// Deskripsi    : Class untuk menyimpan Mahasiswa, Mahasiswa merupakan child dari CivitasAkademika

public class Mahasiswa extends CivitasAkademika {
    private String NIM;
    private int semester;
    private Fakultas fakultas;
    private static int counter;

    public Mahasiswa(){
        super();
        NIM = "";
        semester = 0;
        fakultas = new Fakultas();
        counter ++;
    }

    public Mahasiswa(String nama, String email, String NIM, int semester, Fakultas fakultas){
        super(nama, email);
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
        counter ++;
    }
    
    public static int getCounterMahasiswa(){
        return counter;
    }

    public String getNIM(){
        return NIM;
    }

    public int getSemester(){
        return semester;
    }

    public Fakultas getFakultas(){
        return fakultas;
    }

    public void setNIM(String nim){
        NIM = nim;
    }

    public void setSemester(int sem){
        semester = sem;
    }

    public void setFakultas(Fakultas fakultas){
        this.fakultas = fakultas;
    }

    public double getBiayaUKT(){
        double diskon = (semester - 1) * 0.05;
        double selisih = fakultas.gettarifUKT() * diskon;
        return fakultas.gettarifUKT()  - selisih;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIM         : " + NIM);
        System.out.println("semester    : "+ semester);
        System.out.println("Fakultas    : "+ fakultas.getNama());
        System.out.println("Biaya UKT   : "+ getBiayaUKT());
    }
}
