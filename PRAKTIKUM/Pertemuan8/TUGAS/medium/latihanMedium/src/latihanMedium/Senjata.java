/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

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
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }
     
    public String getBunyi() {
        return this.bunyi;
    }
    
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
    
    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
    
    public boolean isMenusuk() {
        return this.menusuk;
    }
    
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
   
    public int getPeluru() {
        return this.peluru;
    }
    
}
