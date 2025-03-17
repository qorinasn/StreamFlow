/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodeprogram;

import com.mysql.jdbc.PreparedStatement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import view.ForCustomer;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Customer extends Person {
    protected String nobeli;
    protected String nama1;
    protected String nomorhp;
    protected String jenis;
    protected String id;
    protected String harga;
    protected String jumlah;
    protected String metode;
    protected String tanggalbeli;

    private  ForCustomer panel;
    public Customer(ForCustomer panel){
        this.panel = panel;
    }

    public Customer() {
       
    }

    public String getNobeli() {
        return nobeli;
    }

    public void setNobeli(String nobeli) {
        this.nobeli = nobeli;
    }

    public String getNama1() {
        return nama1;
    }

    public void setNama1(String nama1) {
        this.nama1 = nama1;
    }

    public String getNomorhp() {
        return nomorhp;
    }

    public void setNomorhp(String nomorhp) {
        this.nomorhp = nomorhp;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getMetode() {
        return metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    public String getTanggalbeli() {
        return tanggalbeli;
    }

    public void setTanggalbeli(String tanggalbeli) {
        this.tanggalbeli = tanggalbeli;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

  
   
     public void isitabel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Nama");
        model.addColumn("Nomor HP");
        model.addColumn("Jenis Pembelian");
        model.addColumn("ID");
        model.addColumn("Harga");
        model.addColumn("Jumlah");
        model.addColumn("Metode Pembayaran");
        model.addColumn("Tanggal Beli");
        
           try{
               query = "SELECT*FROM tabel_customer";
               koneksi = (Connection)Konek.konek();
               s = koneksi.createStatement();
               rs = s.executeQuery(query);
               while(rs.next()){
                   model.addRow(
                   new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)});
               }
               panel.getTableCustomer().setModel(model);
           }catch (SQLException e){
               System.out.println("Error : "+e.getMessage());
           }
     }
     
  
  
   public void simpandata(){
         
         try{
             PreparedStatement statement = (PreparedStatement) Konek.konek().prepareStatement(""+
                     "INSERT INTO tabel_customer (no_beli, nama, no_hp, jenis_pembelian, id_brg, harga, jumlah, metode_bayar, waktu_pembelian) VALUES (null,?,?,?,?,?,?,?,?)");
             
             statement.setString(1, nama1);
             statement.setString(2, nomorhp);
             statement.setString(3, jenis);
             statement.setString(4, id);
             statement.setString(5, harga);
             statement.setString(6, jumlah);
             statement.setString(7, metode);
             statement.setString(8, tanggalbeli);
             statement.executeUpdate();
             isitabel();
             statement.close();
             JOptionPane.showMessageDialog(null, "Proses Beli Berhasil");
         }catch(HeadlessException|SQLException e){
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
     }
    @Override
         public void insert(){
             setNama1(panel.getTextNama().getText());
             setNomorhp(panel.getTextNoHP().getText());
             setJenis( panel.getBoxJenisBeli().getSelectedItem().toString());
             setId(panel.getTextID().getText());
             setHarga(panel.getTextHarga().getText());
             setJumlah(panel.getTextJumlah().getText());
             setMetode(panel.getBoxBayar().getSelectedItem().toString());
             setTanggalbeli(panel.getTanggalBeli2().getText());
             simpandata();
         }
}
     
