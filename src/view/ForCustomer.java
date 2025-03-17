package view;
/**
 *
 * @author LENOVO
 */
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import kodeprogram.Customer;
public class ForCustomer extends javax.swing.JFrame {

    /**
     * Creates new form ForCustomer
     */
    private final Customer customer;
    public ForCustomer() {
        initComponents();
        customer = new Customer(this);
        customer.isitabel();
        
    }
    public JTextField getTextHarga(){
        return TextHarga;
    }
    public JTextField getTextNama(){
        return TextNama;
    }
    public JTextField getTextNoHP(){
        return TextNoHP;
    }
    public JTextField getNoBeli(){
        return noBeli;
    }
    public JTextField getTextID(){
    return idbrg;
    }
    public JTextField getTextJumlah(){
        return TextJumlah;
    }
    public JButton getButtonBeli(){
        return ButtonBeli;
    }
    public JButton getButtonTidakbeli(){
        return ButtonTidakbeli;
    }
    public JComboBox getBoxBayar(){
        return BoxBayar;
    }
    public JComboBox getBoxJenisBeli(){
        return BoxJenisBeli1;
    }
    public JTable getTableCustomer(){
        
       return tabelCustomer;
    }
    public JTextField getTanggalBeli2(){
        return TextTanggalBeli;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        no_label = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        noBeli = new javax.swing.JTextField();
        TextNama = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TextNoHP = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        BoxJenisBeli1 = new javax.swing.JComboBox<>();
        idbrg = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextHarga = new javax.swing.JTextField();
        TextJumlah = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BoxBayar = new javax.swing.JComboBox<>();
        TextTanggalBeli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ButtonBeli = new javax.swing.JButton();
        ButtonTidakbeli = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelCustomer = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        no_label.setBackground(java.awt.Color.orange);
        no_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        no_label.setForeground(new java.awt.Color(185, 141, 35));
        no_label.setText("No");
        getContentPane().add(no_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 147, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(185, 141, 35));
        jLabel16.setText("DAFTAR PESANAN");
        jLabel16.setToolTipText("");
        jLabel16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(255, 204, 204), java.awt.Color.gray, java.awt.Color.white));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 66, 470, 63));

        noBeli.setEditable(false);
        noBeli.setBackground(new java.awt.Color(204, 204, 204));
        noBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noBeliActionPerformed(evt);
            }
        });
        getContentPane().add(noBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 151, 229, -1));

        TextNama.setBackground(new java.awt.Color(204, 204, 204));
        TextNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNamaActionPerformed(evt);
            }
        });
        getContentPane().add(TextNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 181, 229, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(185, 141, 35));
        jLabel13.setText("Nama");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 177, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(185, 141, 35));
        jLabel14.setText("No. Hp");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 207, -1, -1));

        TextNoHP.setBackground(new java.awt.Color(204, 204, 204));
        TextNoHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNoHPActionPerformed(evt);
            }
        });
        getContentPane().add(TextNoHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 208, 229, 26));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(185, 141, 35));
        jLabel15.setText("Jenis Pembelian");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 240, -1, -1));

        BoxJenisBeli1.setBackground(new java.awt.Color(204, 204, 204));
        BoxJenisBeli1.setMaximumRowCount(23);
        BoxJenisBeli1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JOOX 7 Hari", "JOOX 30 Hari", "JOOX 90 Hari", "JOOX 180 Hari", "JOOX 360 Hari", "Spotify Mini/hari", "Spotify Individual/2bulan", "Spotify Duo/2bulan", "Spotify Family/2bulan", "Youtube Music Premium/1bulan", " ", " " }));
        BoxJenisBeli1.setToolTipText("");
        BoxJenisBeli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxJenisBeli1ActionPerformed(evt);
            }
        });
        getContentPane().add(BoxJenisBeli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 244, 229, -1));

        idbrg.setBackground(new java.awt.Color(204, 204, 204));
        idbrg.setForeground(new java.awt.Color(109, 109, 109));
        idbrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idbrgActionPerformed(evt);
            }
        });
        getContentPane().add(idbrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 274, 229, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(185, 141, 35));
        jLabel17.setText("ID");
        jLabel17.setRequestFocusEnabled(false);
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(185, 141, 35));
        jLabel5.setText("Harga");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 300, 60, -1));

        TextHarga.setEditable(false);
        TextHarga.setBackground(new java.awt.Color(204, 204, 204));
        TextHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextHargaActionPerformed(evt);
            }
        });
        getContentPane().add(TextHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 300, 229, 26));

        TextJumlah.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(TextJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 332, 229, -1));

        jLabel8.setBackground(new java.awt.Color(185, 141, 35));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(185, 141, 35));
        jLabel8.setText("Jumlah");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 332, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(185, 141, 35));
        jLabel7.setText("Metode Bayar");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 360, -1, -1));

        BoxBayar.setBackground(new java.awt.Color(204, 204, 204));
        BoxBayar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bank", "GoPay", "Indomaret" }));
        BoxBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxBayarActionPerformed(evt);
            }
        });
        getContentPane().add(BoxBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 360, 229, -1));

        TextTanggalBeli.setBackground(new java.awt.Color(204, 204, 204));
        TextTanggalBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTanggalBeliActionPerformed(evt);
            }
        });
        getContentPane().add(TextTanggalBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 392, 229, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(185, 141, 35));
        jLabel6.setText("Tanggal Beli");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 388, 131, -1));

        ButtonBeli.setText("Simpan");
        ButtonBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBeliActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 442, 100, -1));

        ButtonTidakbeli.setText("Hapus");
        ButtonTidakbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTidakbeliActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonTidakbeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 442, 100, -1));

        tabelCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelCustomerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelCustomer);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 483, 857, 148));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/73a9c0c53fa7c2e04bc22d2053f4a8c2.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(850, 804));
        jLabel1.setMinimumSize(new java.awt.Dimension(850, 804));
        jLabel1.setPreferredSize(new java.awt.Dimension(850, 804));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noBeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noBeliActionPerformed

    private void TextNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNamaActionPerformed

    private void TextNoHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNoHPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNoHPActionPerformed

    private void BoxJenisBeli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxJenisBeli1ActionPerformed
        String jenis; String nilai; String id = null;
        jenis = String.valueOf(BoxJenisBeli1.getSelectedItem());

        switch(jenis){
            case ("JOOX 7 Hari"):
            nilai="10000";
            id="1";
            break;
            case("JOOX 30 Hari"):
            nilai="35000";
            id="2";
            break;
            case("JOOX 90 Hari"):
            nilai="93000";
            id="3";
            break;
            case("JOOX 180 Hari"):
            nilai="181000";
            id="4";
            break;
            case("JOOX 360 Hari"):
            nilai="300000";
            id="5";
            break;
            case("Spotify Mini/hari"):
            nilai="3000";
            id="6";
            break;
            case("Spotify Individual/2bulan"):
            nilai="55000";
            id="7";
            break;
            case("Spotify Duo/2bulan"):
            nilai="73000";
            id="8";
            break;
            case("Spotify Family/2bulan"):
            nilai="89000";
            id="9";
            break;
            case("Youtube Music Premium/1bulan"):
            nilai="50000";
            id="10";
            break;
            default:
            nilai="Tidak Terdaftar";
        }
        TextHarga.setText(""+nilai);
        idbrg.setText(""+id);
    }//GEN-LAST:event_BoxJenisBeli1ActionPerformed

    private void idbrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idbrgActionPerformed

    private void TextHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextHargaActionPerformed

    private void BoxBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxBayarActionPerformed

    private void TextTanggalBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTanggalBeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextTanggalBeliActionPerformed

    private void ButtonBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBeliActionPerformed
        customer.insert();
        customer.isitabel();
    }//GEN-LAST:event_ButtonBeliActionPerformed

    private void ButtonTidakbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTidakbeliActionPerformed
        dispose();
    }//GEN-LAST:event_ButtonTidakbeliActionPerformed

    private void tabelCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelCustomerMouseClicked
        int baris = tabelCustomer.rowAtPoint(evt.getPoint());
        String nomor = tabelCustomer.getValueAt(baris, 0).toString();
        noBeli.setText(String.valueOf(nomor));
        String nama1 = tabelCustomer.getValueAt(baris, 1).toString();
        TextNama.setText(nama1);
        String NoHp = tabelCustomer.getValueAt(baris, 2).toString();
        TextNoHP.setText(NoHp);
        String jenis1 = tabelCustomer.getValueAt(baris, 3).toString();
        BoxJenisBeli1.setSelectedItem(jenis1);
        String id1 = tabelCustomer.getValueAt(baris, 4).toString();
        idbrg.setText(id1);
        String harga1 = tabelCustomer.getValueAt(baris, 5).toString();
        TextHarga.setText(harga1);
        String jumlah1 = tabelCustomer.getValueAt(baris, 6).toString();
        TextJumlah.setText(jumlah1);
        String metbayar1 = tabelCustomer.getValueAt(baris, 7).toString();
        BoxBayar.setSelectedItem(metbayar1);
        String tanggal1 = tabelCustomer.getValueAt(baris, 8).toString();
        TextTanggalBeli.setText(tanggal1);
    }//GEN-LAST:event_tabelCustomerMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ForCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ForCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxBayar;
    private javax.swing.JComboBox<String> BoxJenisBeli1;
    private javax.swing.JButton ButtonBeli;
    private javax.swing.JButton ButtonTidakbeli;
    private javax.swing.JTextField TextHarga;
    private javax.swing.JTextField TextJumlah;
    private javax.swing.JTextField TextNama;
    private javax.swing.JTextField TextNoHP;
    private javax.swing.JTextField TextTanggalBeli;
    private javax.swing.JTextField idbrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField noBeli;
    private javax.swing.JLabel no_label;
    private javax.swing.JTable tabelCustomer;
    // End of variables declaration//GEN-END:variables
}
