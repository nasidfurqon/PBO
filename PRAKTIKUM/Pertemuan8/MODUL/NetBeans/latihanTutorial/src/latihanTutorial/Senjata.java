/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanTutorial;
// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 3 Mei 2025
// File         : Senjata.java
// Deskripsi    : Program untuk menyimpan Class Senjata

/**
 *
 * @author ASUS
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
    }

    private void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    private String getBunyi() {
        return bunyi;
    }
    
    private void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
    
    private boolean isMenusuk() {
        return menusuk;
    }
    
    public void menembak(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.print(getBunyi() + " ");
        }
        System.out.println("");
    }

    public void pasangBayonet() {
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }

    public String menusuk() {
        if (isMenusuk()) {
            return "Jleb! ";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }
}
