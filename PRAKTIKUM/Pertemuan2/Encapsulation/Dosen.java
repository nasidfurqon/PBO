/*
 * Nama File : Dosen.java
 * Deskripsi : berisi atribut dan method dalam class Dosen
 * Pembuat   : Khoirul Nasid Furqon - 24060123120042
 * Tanggal   : 27 Februari 2025
 */

public class Dosen{
    // ATRIBUT
    private String nip;
    private String nama;
    private String prodi;

    // KONSTRUKTOR tanpa parameter
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    // KONSTRUKTOR dengan parameter
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // SELEKTOR
    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    // MUTATOR
    public void setNip(String n){
        nip = n;
    }

    public void setNama(String n){
        nama = n;
    }

    public void setProdi(String n){
        prodi = n;
    }
}