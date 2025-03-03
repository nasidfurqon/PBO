/*
 * Nama File : MataKuliah.java
 * Deskripsi : berisi atribut dan method dalam class Mata Kuliah
 * Pembuat   : Khoirul Nasid Furqon - 24060123120042
 * Tanggal   : 27 Februari 2025
 */

public class MataKuliah {
    private String idMatkul;
    private String nama;
    private int sks;

    public MataKuliah(){
        idMatkul = "";
        nama = "";
        sks = 0;
    }

    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatkul(){
        return idMatkul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    public void setIdMatkul(String n){
        idMatkul = n;
    }

    public void setNama(String n){
        nama = n;
    }

    public void setSks(int n){
        sks = n;
    }
}
