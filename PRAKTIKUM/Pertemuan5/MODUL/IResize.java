// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 21 Maret 2025
// File         : IResize.java
// Deskripsi    : Program untuk menyimpan interface IResize


public interface IResize {
    // menambahkan ukuran menjadi 10% lebih besar 
    public void zoomIn();
    
    // mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // menskalakan ukuran menjadi sesuai inputan
    public void zoom(int percent );   
}
