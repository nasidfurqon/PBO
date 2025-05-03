/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;
// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 3 Mei 2025
// File         : KontrolSenjata.java
// Deskripsi    : Program untuk menyimpan Class KontrolSenjata

/**
 *
 * @author ASUS
 */
public class KontrolSenjata {
    private Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return this.senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru) {
        this.senjata.setPeluru(this.senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
        
    }
    
    public void menembak(int jumlah) {
        if(this.senjata.getPeluru() > 0){
            System.out.println(">> Siap menembak " + jumlah + " kali");
            for (int i = 0; i < jumlah; i++) {
                if(this.senjata.getPeluru() <= 0){
                    System.out.println("Gagal tembak, Peluru Habis");
                }
                else{
                    System.out.println(this.senjata.getBunyi());
                    this.senjata.setPeluru(this.senjata.getPeluru() - 1);
                }
            }
            System.out.println(">> Peluru sisa: " + this.senjata.getPeluru());
        }
        else{
            System.out.println(">> Siap menembak " + jumlah + " kali");
            System.out.println("Peluru Habis");
        }
    }
    
    public String menusuk() {
        if(this.senjata.isMenusuk()) {
            return "Jleb!";
        }
        else{
            return "Gagal, belum terpasang bayonet";
        }
    }
    
    public void pasangBayonet() {
        this.senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}
