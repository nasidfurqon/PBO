/*
 * Nama File : Kendaraan.java
 * Deskripsi : berisi atribut dan method dalam class Kendaraan
 * Pembuat   : Khoirul Nasid Furqon - 24060123120042
 * Tanggal   : 27 Februari 2025
 */

public class Kendaraan {
    private String noPlat;
    private String jenis;

    public Kendaraan(){
        noPlat = "";
        jenis = "";
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public void setNoPlat(String n){
        noPlat = n;
    }

    public void setJenis(String n){
        jenis = n;
    }
}

