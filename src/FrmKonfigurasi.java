/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program.parkir;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author eyu bonsai
 */
public class FrmKonfigurasi extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmKonfigurasi
     */
    public FrmKonfigurasi() {
        initComponents();
        data_untuk_combo();
    }
private void data_untuk_combo()
{
    try {        
        TxtJenis.removeAllItems();
        
            Connection c=ClassDatabase.getkoneksi();
            Statement s= c.createStatement();
            String sql="Select jenis from jenis_kendaraan group by id_jenis";
            ResultSet r=s.executeQuery(sql);
            
            while (r.next()) {
                TxtJenis.addItem(r.getString("jenis"));
            }
            r.close();
            s.close();
        }catch(SQLException e) {
            System.out.println(e);
        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtJenis = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        TxtTarif = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtJenisBaru = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setTitle("KONFIGURASI DATA PARKIR");

        jLabel1.setText("Jenis Kendaraan :");

        TxtJenis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        TxtJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtJenisActionPerformed(evt);
            }
        });

        jLabel2.setText("Ubah Jenis :");

        jButton1.setText("Perbaharui");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Batal ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblID.setText("-");

        jLabel3.setText("Tambah :");

        jButton3.setText("Tambah");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtTarif)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblID)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtJenisBaru, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtTarif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtJenisBaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtJenisActionPerformed
        // TODO add your handling code here:
        int i=TxtJenis.getSelectedIndex();
        if (i==-1)
        {
            return;
        }
         try {
             String kd=(String) TxtJenis.getSelectedItem();
            Connection c=ClassDatabase.getkoneksi();
            Statement s= c.createStatement();
            String sql = "Select * from jenis_kendaraan WHERE jenis=?";
            PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
            p.setString(1, kd);
            ResultSet result=p.executeQuery();
            result.next();            
            
            this.TxtTarif.setText(result.getString("jenis"));
            this.lblID.setText(result.getString("id_jenis"));
            }catch(SQLException e){
            System.out.println(e);        
         }
    }//GEN-LAST:event_TxtJenisActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
             String kd=(String) TxtJenis.getSelectedItem();
             String id=(String) lblID.getText();
             String tarifbaru=this.TxtTarif.getText();
            Connection c=ClassDatabase.getkoneksi();
            Statement s= c.createStatement();
            String sql = "Update jenis_kendaraan SET jenis=? WHERE id_jenis=?";
            PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
            p.setString(1, tarifbaru);
            p.setString(2, id);
            p.executeUpdate();
            
            p.close();
            data_untuk_combo();
            JOptionPane.showMessageDialog(this, "Sukses Update data");
            }catch(SQLException e){
            System.out.println(e);        
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try {

            Connection c=ClassDatabase.getkoneksi();
            Statement s= c.createStatement();
            String sql = "Insert into jenis_kendaraan (`jenis`) Values ('"+this.TxtJenisBaru.getText()+"')";
            PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);

            p.executeUpdate();
            
            p.close();
            data_untuk_combo();
            JOptionPane.showMessageDialog(this, "Sukses Tambah data");
            }catch(SQLException e){
            System.out.println(e);        
         }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox TxtJenis;
    private javax.swing.JTextField TxtJenisBaru;
    private javax.swing.JTextField TxtTarif;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblID;
    // End of variables declaration//GEN-END:variables
}
