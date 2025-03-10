package MATERI;
// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 7 Maret 2025
// File         : AngkaSial.java
// Deskripsi    : Program penggunaan exception buatan sendiri
//                Pengenalan klausa 'throw' dan 'throws'   
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka +" bukan angka");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            // Method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");;
        }
    }
}

/*
    PERTANYAAN: 
    1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
    2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?

    JAWABAN :
    1.Tidak di eksekusi. Karena jika terjadi eksepsi, program akan masuk ke kondisi if dan akan langsung melempar eksepsi,
        sehingga kode dibawahnya tidak akan dieksekusi
    2. Iya dieksekusi. Karena pada pemanggilan method cobaAngka pada baris 19 menyebabkan eksepsi,
        sehingga akan dilempar ke kondisi catch yang mana terdapat di baris 21.  
 */