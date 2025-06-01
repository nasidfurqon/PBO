/* Nama File    : LambdaList.java
 * Deskripsi    : Ekspresi lambda pada list, digunakan sebagai parameter pada method.
 * Pembuat      : Khoirul Nasid Furqon/24060123120042
 * Tanggal      : 27 Mei 2025
 */

package MODUL;
import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}