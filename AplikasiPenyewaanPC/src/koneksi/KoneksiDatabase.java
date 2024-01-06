/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

/**
 *
 * @author Mujahid
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class KoneksiDatabase {
 Connection koneksi;
 public static Connection BukaKoneksi(){
   try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/penyewaanpc","root","");
       return cn;
   }  catch (Exception e) {
       JOptionPane.showMessageDialog(null, e);
       return null;
   }
   
 }
}
