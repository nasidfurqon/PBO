// /*
//  * Nama File : MTitik.java
//  * Deskripsi : berisi realisasi dan driver class Titik
//  * Pembuat   : Khoirul Nasid Furqon - 24060123120042
//  * Tanggal   : 19 Februari 2025
//  */

// public class MTitik {
//     public static void main(String[] args){
//         Titik T1 = new Titik(); // Membuat Titik T1(0,0)
//         T1.setAbsis(3); //  mengubah absis T1 dengan nilai 3
//         T1.setOrdinat(4); // mengubah ordinat T1 dengan nilai 4
//         T1.printTitik(); // Mencetak koordinat T1 ke layar
//         T1.geser(3, 4); // menggeser T1 sejauh (3,4)
//         T1.printTitik(); // Mencetak koordinat T1 ke layar

//         Titik T2 = T1; // Membuat Titik T2 sebagai salinan dari objek Titik T1
//         T2.printTitik(); // Mencetak koordinat T2 ke layar
//         T1.setAbsis(10); // mengubah absis T1 dengan nilai 10
//         T1.setOrdinat(10); // mengubah absis T2 dengan nilai 10
//         T2.printTitik(); // Mencetak koordinat T2 ke layar
//         T1.printTitik(); // Mencetak koordinat T1 ke layar

//         Titik T3 = new Titik(3,5); // Membuat Titik T3(3,5)

//         System.out.println("Jumlah objek titik = " + Titik.getCounterTitik());
//         System.out.println("Jumlah objek Titik = "+T3.getCounterTitik());
        
//         System.out.println("Titik T3 = ");
//         T3.printTitik(); // Mencetak koordinat T3 ke layar
//         System.out.println("Kuadran dari Titik T3 = " + T3.getKuadran()); 

//         System.out.println("Jarak antara Titik T3 dengan titik pusat = " + T3.getJarakPusat()); // mengembalikan nilai jarak antara titik T3 dengan titik pusat(0,0)

//         System.out.println("Jarak antara Titik T3 dengan Titik T2 = " + T3.getJarak(T2)); // mengembalikan nilai jarak antara titik T3 dengan titik T2

//         T3.refleksiY(); // Merefleksikan Titik T3 terhadap sumbu Y
//         System.out.println("Refleksi Titik T3 Terhadap sumbu Y! ");
//         T3.printTitik(); // Mencetak koordinat T3 ke layar

//         T3.refleksiX(); // Merefleksikan Titik T3 terhadap sumbu X
//         System.out.println("Refleksi Titik T3 Terhadap sumbu X! ");
//         T3.printTitik(); // Mencetak koordinat T3 ke layar

//         Titik T4 = T3.getRefleksiY(); // Membuat Titik T4 dengan nilai dari refleksi objek T3 terhadap sumbu Y
//         System.out.println("Titik baru dari refleksi titik T3 terhadap sumbu Y adalah  = ");
//         T4.printTitik(); // Mencetak koordinat T3 ke layar

//         Titik T5 = T3.getRefleksiX(); // Membuat Titik T5 dengan nilai dari refleksi objek T3 terhadap sumbu X
//         System.out.println("Titik baru dari refleksi titik T3 terhadap sumbu X adalah  = ");
//         T5.printTitik(); // Mencetak koordinat T3 ke layar
//     }
// }
