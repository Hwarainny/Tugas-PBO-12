/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.sql.*;
public class Koneksi {
    public static Connection getConnection(){
        Connection conn = null;
        try{
            String url = "jdbc:mysql://localhost:3306/db_praktikum";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi Berhasil");
        } catch(SQLException e){
            System.out.println("Koneksi gagal : " + e.getMessage());
        }
        return conn;
    }
}