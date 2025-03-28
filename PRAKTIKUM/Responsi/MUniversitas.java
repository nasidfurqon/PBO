// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 28 Maret 2025
// File         : MUniversitas.java
// Deskripsi    : Class untuk menyimpan driver untuk Universitas


public class MUniversitas {
    public static void main(String[] args) {
        Fakultas FSM = new Fakultas("Sains dan Matematika", 4000000, 5000000);
        Fakultas FT = new Fakultas("Teknik", 5000000, 10000000);
        Fakultas FPP = new Fakultas("Peternakan dan Pertanian", 6000000, 7000000);

        Mahasiswa m1 = new Mahasiswa("Khoirul", "khoi@gmai.com", "24060123120042", 4, FSM);
        Mahasiswa m2 = new Mahasiswa("nasid", "nasid@gmai.com", "24010123120042", 8, FT);
        Mahasiswa m3 = new Mahasiswa("furqon", "furqon@gmai.com", "24070123120042", 1, FPP);

        Dosen d1 = new Dosen("Khoirul S.Kom.", "khoi@gmail.com", "1111111", 10, FSM);
        Dosen d2 = new Dosen("nasid S.T.", "nasid@gmail.com", "2222222", 5, FT);
        Dosen d3 = new Dosen("furqon S.T.", "furqon@gmail.com", "33333", 5, FPP);

        Tendik t1 = new Tendik("Khoi", "khoi12@gmail.com", "3912933", 1);

        System.out.println("Jumlah Objek Mahasiswa yang dibuat : " + Mahasiswa.getCounterMahasiswa());
        System.out.println("Jumlah Objek Dosen yang dibuat : " + Dosen.getCounterDosen());
        System.out.println("Jumlah Objek Tendik yang dibuat : " + Tendik.getCounterTendik() + "\n");

        System.out.println("===== FSM =====");
        System.out.println(FSM.getNama());
        System.out.println(FSM.getGajiPokok());
        System.out.println(FSM.gettarifUKT());
        System.out.println();

        System.out.println("===== FT =====");
        System.out.println(FT.getNama());
        System.out.println(FT.getGajiPokok());
        System.out.println(FT.gettarifUKT());
        System.out.println();

        System.out.println("===== FPP =====");
        System.out.println(FPP.getNama());
        System.out.println(FPP.getGajiPokok());
        System.out.println(FPP.gettarifUKT());
        System.out.println();


        System.out.println("===== MAHASISWA =====");
        System.out.println("Data dari Mahasiswa m1!");
        m1.printInfo();
        System.err.println();

        System.out.println("Data dari Mahasiswa m2!");
        m2.printInfo();
        System.err.println();

        System.out.println("Data dari Mahasiswa m3!");
        m3.printInfo();
        System.err.println();

        System.out.println("===== DOSEN =====");
        System.out.println("Data dari Dosen d1!");
        d1.printInfo();
        System.err.println();

        System.out.println("Data dari Dosen d2!");
        d2.printInfo();
        System.err.println();

        System.out.println("Data dari Dosen d3!");
        d3.printInfo();
        System.err.println();

        System.out.println("===== TENDIK =====");
        System.out.println("Data dari Tendik t1!");
        t1.printInfo();
        System.err.println();

        System.out.println("===== ADA PERUBAHAN GAJI POKOK DAN UKT DI FSM =====");
        FSM.setGajiPokok(8000000);
        FSM.settarifUKT(3000000);

        System.out.println("Data dari Mahasiswa m1!");
        m1.printInfo();
        System.err.println();
        System.out.println("Data dari Dosen d1!");
        d1.printInfo();
        System.err.println();

        System.out.println("===== PINDAH FAKULTAS =====");
        m2.setFakultas(FPP);
        d2.setFakultas(FPP);

        System.out.println("Data dari Mahasiswa m2!");
        m2.printInfo();
        System.err.println();
        System.out.println("Data dari Dosen d2!");
        d2.printInfo();
        System.err.println();   
    }
}

