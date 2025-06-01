/* Nama File    : LambdaMap.java
 * Deskripsi    : Ekspresi lambda pada Map.
 * Pembuat      : Khoirul Nasid Furqon/24060123120042
 * Tanggal      : 1 Juni 2025
 */

package TUGAS;

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("24060123120042", "Khoirul");
        mahasiswaMap.put("24060123120041", "nasid");
        mahasiswaMap.put("24060123120043", "furqon");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}