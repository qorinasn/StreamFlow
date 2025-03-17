package kodeprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Konek {
    private static Connection mysqlConn;
    public static void main(String[] args) throws SQLException {
        konek();
    }
    public static Connection konek() throws SQLException{
        if(mysqlConn==null){
            try{
                String A ="jdbc:mysql://localhost:3306/uas_ppbo";
                String user ="root";
                String pass ="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlConn = (Connection) DriverManager.getConnection(A,user,pass);
                System.out.println("BERHASIL!");
            }catch(SQLException e){
                System.out.println("MOHON MAAF GAGAL");
            }
        }
        return mysqlConn;
    }
}
