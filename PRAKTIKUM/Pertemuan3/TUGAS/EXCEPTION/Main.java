// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 7 Maret 2025
// File         : Main.java
// Deskripsi    : Driver untuk Pemesanan menu dengan eksepsi

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi menu
        Menu menu1 = new Menu("Nasi Goreng", 25000, 10);
        Menu menu2 = new Menu("Mie Ayam", 20000, 15);

        Scanner scanner = new Scanner(System.in);

        // Interaksi dengan pengguna
        System.out.println("Menu:");
        System.out.println("1. Nasi Goreng - Rp25000");
        System.out.println("2. Mie Ayam - Rp20000");

        try {
            // Meminta input dari pengguna
            System.out.print("Pilih menu (1/2): ");
            int pilihanMenu = scanner.nextInt();

            System.out.print("Jumlah pesanan: ");
            int jumlahPesanan = scanner.nextInt();

            // Menentukan menu yang dipilih
            Menu menu = null;
            if (pilihanMenu == 1) {
                // TO DO 3: Tetapkan menu yang dipilih ke menu1 
                menu = menu1;
                
            } else if (pilihanMenu == 2) {
                // TO DO 4: Tetapkan menu yang dipilih ke menu2 
                menu = menu2;
            } else {
                // TO DO 5: Tampilkan pesan bahwa menu tidak valid dan menghentikan eksekusi program   
                System.out.println("`Menu tidak valid");
                System.exit(0);
            }
            
            // TO DO 6: Periksa apakah menu yang dipilih tidak null, jika null, seharusnya menimbulkan (throw) MenuTidakTersediaException
            if(menu.getNama() == null){
                throw new MenuTidakTersediaException("Menu yang dipilih tidak tersedia ");
            }
            // Memeriksa apakah stok mencukupi
            // TO DO 7: Seharusnya menimbulkan (throw) JumlahPesananMelebihiStokException jika jumlah pesanan melebihi stok yang tersedia
            if(jumlahPesanan > menu.getStok()){
                throw new JumlahPesananMelebihiStokException("jumlah pesanan melebihi stok yang tesedia");
            }
            // Melakukan pemesanan
            Pesanan pesanan = new Pesanan(menu, jumlahPesanan);
            menu.kurangiStok(jumlahPesanan);

            System.out.println("Pesanan berhasil dilakukan.");
            System.out.println("Total harga: Rp" + pesanan.getTotal());

        } catch (MenuTidakTersediaException | JumlahPesananMelebihiStokException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
