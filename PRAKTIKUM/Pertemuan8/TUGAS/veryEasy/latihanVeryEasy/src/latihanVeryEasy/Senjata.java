/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;
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
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    private void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    private String getBunyi() {
        return bunyi;
    }
    
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
    
    public int getPeluru() {
        return this.peluru;
    }
    
    public void menembak() {
        if(this.peluru > 0){
            System.out.println(getBunyi());
            this.peluru -= 1;
        }
        else{
            System.out.println("Peluru Habis!");
        }
    }
}

