import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosen;
    private Kendaraan kendaraan;

    public Mahasiswa(){
        nim  = "";
        nama = "";
        prodi = "";
        listMatkul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        dosen = new Dosen();
        kendaraan = new Kendaraan();
        listMatkul = new ArrayList<>();
    }

    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public Dosen getDosen(){
        return dosen;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public void setNim(String n){
        nim = n;
    }

    public void setNama(String n){
        nama = n;
    }

    public void setProdi(String n){
        prodi = n;
    }

    public void setDosen(Dosen n){
        dosen = n;
    }

    public void setKendaraan(Kendaraan n){
        kendaraan = n;
    }

    public void addMatkul(MataKuliah newMatkul){
        listMatkul.add(newMatkul);
    }

    public int getJumlahSKS(){
        int sum = 0;
        for (int i = 0; i < listMatkul.size(); i++) {
            sum += listMatkul.get(i).getSks();
        }
        return sum;
    }

    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    public void printDetailMHS(){
        System.out.println("NIM" + nim);
        System.out.println("Nama" + nama);
        System.out.println("Prodi" + prodi);
        int i;
        for (i = 0; i < listMatkul.size(); i++) {
            System.out.println(listMatkul.get(i).getNama());
        }
    }

    public void printMHS(){
        System.out.println("NIM" + nim);
        System.out.println("Nama" + nama);
        System.out.println("Prodi" + prodi);
    }
}
