package Modul;
// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 7 Mei 2025
// File         : MapTest.java
// Deskripsi    : Program untuk simulasi penggunaan kelas collection

import java.util.*;

public class MapTest {
    public static void main(String[] args){
        // Kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();

        // menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");

        // mengambil elemen pertama
        System.out.println(map.get(1));

        // mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> key = map.keySet();
        for (Integer i : key) {
            System.out.println("elemen ke " + i + ": " + map.get(i));
        }
    }
    
}
