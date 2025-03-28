// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 28 Maret 2025
// File         : CivitasAkademika.java
// Deskripsi    : Class untuk menyimpan CivitasAkademika, CivitasAkademika merupakan parent


public class CivitasAkademika {
    protected String nama;
    protected String email;
    
    public CivitasAkademika(){
        nama = "";
        email = "";
    }

    public CivitasAkademika(String nama, String email){
        this.nama = nama;
        this.email = email;
    }

    public String getNama(){
        return nama;
    }

    public String getEmail(){
        return email;
    }
    
    public void setNama(String n){
        nama = n;
    }

    public void setEmail(String e){
        email = e;
    }

    public void printInfo(){
        System.out.println("Nama    :" + getNama());
        System.out.println("Email   : "+ getEmail());
    }
}
