package Modul;
// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 7 Mei 2025
// File         : ArrayListTest.java
// Deskripsi    : Program untuk simulasi penggunaan kelas java.utils.ArrayList

import java.util.ArrayList;
public class ArrayListTest {
    public static void main (String[] args){
        // inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();

        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");

        // menghapus elemen
        strings.remove("praktikum");

        // iterasi pada keseluruhan ArrayList
        for (String s : strings) {
            System.out.print(s+ " ");
        }
    }
}
