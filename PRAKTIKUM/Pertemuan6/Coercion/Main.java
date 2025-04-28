package Coercion;
public class Main {

    public static void main(String[] args){
        int output = 'a'; 
        System.out.println(output); // bisa, menghasilkan ascii 
        
        double x = 15.5;
        // output = x; // tidak bisa dicasting langsung seperti ini
        
        int y = 25;
        double output2 = y;
        System.out.println(output2); // bisa, menghasilkan y dengan tambahan .0

        int z = 78;
        char output3 = (char) z;
        System.out.println(output3); // bisa, menghasilkan huruf dari z

        char a = 'a';
        double output4 = a;
        System.out.println(output4); // bisa, menghasilkan ascii dengan tambahan .0

    }
}