
// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 14 Mei 2025
// File         : MainDAO.java
// Deskripsi    : Main Program untuk akses DAO


public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Khoirul");
        DAOManager m = new DAOManager();

        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
