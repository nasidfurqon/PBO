/*
 * Nama File : Titik.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat   : Khoirul Nasid Furqon - 24060123120042
 * Tanggal   : 19 Februari 2025
 */
public class Titik {
    // ATRIBUT
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    // METHOD

    // konstruktor untuk membuat titik(0,0)
    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // konstruktor untuk membuat titik dengan nilai absis dan ordinat dari input user
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik ++;
    }

    // mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }
    // mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    // mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    // mengeset absis titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis += x;
        ordinat += y;
    }

    // mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // mengembalikan kuadran dari Titik
    public int getKuadran() {
        if (getAbsis() >= 0 && getOrdinat() >= 0) {
            return 1;
        } else if (getAbsis() < 0 && getOrdinat() >= 0) {
            return 2;
        } else if (getAbsis() < 0 && getOrdinat() < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    // mengembalikan jarak dari Titik dengan jarak pusat
    public double getJarakPusat() {
        return Math.sqrt((getAbsis()*getAbsis()) + (getOrdinat()*getOrdinat()));
    }

    // mengembalikan jarak Titik dengan Titik T
    public double getJarak(Titik T) {
        return Math.sqrt(((getAbsis()-T.getAbsis()) * (getAbsis()-T.getAbsis())) + ((getOrdinat() - T.getOrdinat()) * (getOrdinat() - T.getOrdinat())));
    }

    // membuat refleksi dari Titik terhadap sumbu Y
    public void refleksiY() {
        setAbsis(getAbsis()* -1);    
    }

    // membuat refleksi dari Titik terhadap sumbu X
    public void refleksiX() {
        setOrdinat(getOrdinat()* -1);    
    }

    // Mengembalikan Titik baru sebagai refleksi dari terhadap sumbu Y dari Current Titik 
    public Titik getRefleksiY() {
        return new Titik(getAbsis() * -1, getOrdinat());
    }

    // Mengembalikan Titik baru sebagai refleksi dari terhadap sumbu X dari Current Titik 
    public Titik getRefleksiX() {
        return new Titik(getAbsis(), getOrdinat() * -1);
    }
    // end class titik
}
