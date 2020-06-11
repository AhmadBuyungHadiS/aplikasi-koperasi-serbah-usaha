package FinalProject;
/**
 * Nama : Ahmad Buyung Hadi S
 * Nim : E31191793 / C
 */

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Kelas koneksi untuk menghubungkan program kita dengan DataBase
 */
public final class Koneksi {
    public static Connection con;
    public static Statement stm;
    public static void main(String[] args) throws SQLException {
        Koneksi tes = new Koneksi();
        System.out.println(tes);
    }

    public Koneksi() throws SQLException {
        //bukaKoneksi();
    }

    public Connection bukaKoneksi() throws SQLException {
       try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/ksu_anugerah_motor",
                    "root",
                    "");
            stm = con.createStatement();
            System.out.println("Koneksi Berhasil");
            return con;
        } catch (SQLException se) {
            System.err.println("Tidak Ada Koneksi - " + se.getMessage());
            return null;
        } catch (ClassNotFoundException ex) {
            System.err.println("Tidak Dapat Membuka Koneksi - " + ex.getMessage());
            return null;
        }
    }
}
    