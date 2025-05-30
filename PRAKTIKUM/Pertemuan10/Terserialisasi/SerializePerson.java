// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 14 Mei 2025
// File         : SerializePerson.java
// Deskripsi    : Program untuk serialisasi objek Person
import java.io.*;

//class Person
class Person implements Serializable {
    private String name;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

//class SerializePerson
public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Khoirul");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
