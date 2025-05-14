// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 14 Mei 2025
// File         : MySQLPersonDAO.java
// Deskripsi    : Implementasi PersonDAO untuk MySQL

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception{
        String name = person.getName();

        // membuat koneksi, nama, db, user, password menyesuaikan 
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "khoirul");

        // kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);

        // tutup koneksi database
        con.close();
    }
    
}
