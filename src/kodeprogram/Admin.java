package kodeprogram;

import com.mysql.jdbc.PreparedStatement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.ForAdmin;
import view.Login;

/**
 *
 * @author LENOVO
 */

public class Admin extends Person {
    protected String no;
    protected String idbrg;
    protected String tambahstok;
    protected String nobeli;
    protected String nama1;
    protected String nomorhp;
    protected String jenis;
    protected String id;
    protected String harga;
    protected String jmlh;
    protected String metode;
    protected String tanggalbeli;

    public Admin() {
        
    }

  
    
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getIdbrg() {
        return idbrg;
    }

    public void setIdbrg(String idbrg) {
        this.idbrg = idbrg;
    }

    public String getTambahstok() {
        return tambahstok;
    }

    public void setTambahstok(String tambahstok) {
        this.tambahstok = tambahstok;
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

    public String getJmlh() {
        return jmlh;
    }

    public void setJmlh(String jmlh) {
        this.jmlh = jmlh;
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
    
    
    public ForAdmin p;
    public Admin (ForAdmin p){
        this.p = p;
    }
    public Login l;
    public Admin(Login l, ForAdmin p){
        this.l = l;
        this.p = p;
    }
    
 public void kosongkan_pesanan(){
        p.getNoBeli().setText("");
        p.getTextNama().setText("");
        p.getTextNoHP().setText("");
        p.getBoxJenisBeli().setSelectedItem(this);
        p.getIdbrg().setText("");
        p.getTextHarga().setText("");
        p.getBoxBayar().setSelectedItem(this);
        p.getTanggalBeli2().setText("");
        p.getTabelCustomer().clearSelection();
 }
 public void isitabel2() {
     DefaultTableModel a = new DefaultTableModel();

        a.addColumn("No");
        a.addColumn("Id");
        a.addColumn("Tambahan");
        try{
            query = "SELECT*FROM pembelian_admin";
            koneksi = (Connection)Konek.konek();
            s = koneksi.createStatement();
            rs = s.executeQuery(query);
            while(rs.next()){
                a.addRow(
                new Object[]{rs.getString(1), rs.getInt(2), rs.getString(3)});
            }
            
            p.getTabelTambah().setModel(a);
            }catch(SQLException e){
                System.out.println("Error : "+e.getMessage());
        }
 }

 public void simpandata_admin(){
     try{
         PreparedStatement s=(PreparedStatement) Konek.konek().prepareStatement(""+"INSERT INTO pembelian_admin VALUES "
                 + "(null,?,?)");
         s.setString(1, idbrg);
         s.setString(2, tambahstok);
         s.executeUpdate();
         isitabel2();
         s.close();
         JOptionPane.showMessageDialog(null, "Proses Simpan Berhasil");
     }catch(HeadlessException|SQLException e){
         JOptionPane.showMessageDialog(null, e.getMessage());
     }
     
 }
    @Override
 public void insert(){
        setIdbrg(p.getIdbrg().getText());
        setTambahstok(p.getStok().getText());
        simpandata_admin();
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
                   new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getString(9)});
               }
               p.getTabelCustomer().setModel(model);
           }catch (SQLException e){
               System.out.println("Error : "+e.getMessage());
           }
     }

 public void simpandata_pesanan(){
         try{
             PreparedStatement statement = (PreparedStatement) Konek.konek().prepareStatement(""+
                     "INSERT INTO tabel_customer (no_beli, nama, no_hp, jenis_pembelian, id_brg, harga, jumlah, metode_bayar, waktu_pembelian) VALUES (null,?,?,?,?,?,?,?,?)");
             
             statement.setString(1, nama1);
             statement.setString(2, nomorhp);
             statement.setString(3, jenis);
             statement.setString(4, id);
             statement.setString(5, harga);
             statement.setString(6, jmlh);
             statement.setString(7, metode);
             statement.setString(8, tanggalbeli);
             statement.executeUpdate();
             
             statement.close();
             JOptionPane.showMessageDialog(null, "Proses Beli Berhasil");
         }catch(HeadlessException|SQLException e){
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
 }
 
   
public void insert2(){
    setNama1(p.getTextNama().getText());
    setNomorhp(p.getTextNoHP().getText());
    setJenis(p.getBoxJenisBeli().getSelectedItem().toString());
    setId(p.getTextID().getText());
    setHarga(p.getTextHarga().getText());
    setJmlh(p.getJumlah1().getText());
    setMetode(p.getBoxBayar().getSelectedItem().toString());
    setTanggalbeli(p.getTanggalBeli2().getText());
    simpandata_pesanan();
         }
public void editdata_pesanan(){
    try{
    PreparedStatement s=(PreparedStatement)Konek.konek().prepareStatement(""+"UPDATE tabel_customer SET nama=?, no_hp=?, jenis_pembelian=?, id_brg=?, harga=?, jumlah=?, metode_bayar=?, waktu_pembelian=? WHERE no_beli=?");
    
    s.setString(1, nama1);
    s.setString(2, nomorhp);
    s.setString(3, jenis);
    s.setString(4, id);
    s.setString(5, harga);
    s.setString(6, jmlh);
    s.setString(7, metode);
    s.setString(8, tanggalbeli);
    s.setString(9, nobeli);
    s.executeUpdate();
    s.close();
         JOptionPane.showMessageDialog(null, "Proses Edit Berhasil");
     }catch(HeadlessException|SQLException e){
         JOptionPane.showMessageDialog(null, e.getMessage());
}
isitabel();
        kosongkan_pesanan();
}
    @Override
    public void update(){
        
    setNobeli(p.getNoBeli().getText());
    setNama1(p.getTextNama().getText());
    setNomorhp(p.getTextNoHP().getText());
    setJenis(p.getBoxJenisBeli().getSelectedItem().toString());
    setId(p.getTextID().getText());
    setHarga(p.getTextHarga().getText());
    setJmlh(p.getJumlah1().getText());
    setMetode(p.getBoxBayar().getSelectedItem().toString());
    setTanggalbeli(p.getTanggalBeli2().getText());
    editdata_pesanan();
}
public void hapusdata(int a){
    try{
        PreparedStatement s=(PreparedStatement)Konek.konek().prepareStatement(""
                +"DELETE FROM tabel_customer WHERE no_beli=?");
        s.setInt(1, a);
        s.executeUpdate();
        
        s.close();
        JOptionPane.showMessageDialog(null, "Proses Hapus Berhasil");
    }catch(HeadlessException|SQLException e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
}
public void delete(){
    if(!p.getNoBeli().getText().trim().isEmpty()){
    int a = (Integer.parseInt(p.getNoBeli().getText()));
    hapusdata(a);
}
    else{
        JOptionPane.showMessageDialog(p, "Pilih data yang akan dihapus"
        );}
}

public void login(){
    
}

}


       



    

