/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program.parkir;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author eyu bonsai
 */
public class FrmKendaraanKeluar extends javax.swing.JInternalFrame {
private DefaultTableModel model;
    /**
     * Creates new form FrmKendaraanKeluar
     */
    public FrmKendaraanKeluar() {
        initComponents();
        model=new DefaultTableModel();
        this.jTable1.setModel(model);
        model.addColumn("Kode Parkir");
        model.addColumn("Nomor Polisi");
        model.addColumn("Jam Keluar");          
        loadData();
    }
private void loadData() {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {            
            Connection c=ClassDatabase.getkoneksi();
            Statement s= c.createStatement();
           java.util.Date today = new java.util.Date();
           java.sql.Date today2=new java.sql.Date(today.getTime());            
            String sql="Select * from parkir_data where date(masuk)='"+today2+"' and keluar IS NOT NULL";
            ResultSet r=s.executeQuery(sql);
            
            while (r.next()) {
                Object[] o=new Object[3];
                o[0]=r.getString("id_parkir");
                o[1]=r.getString("nomor_polisi");               
                o[2]=r.getString("keluar");
               
                
                
                model.addRow(o);
            }
            r.close();
            s.close();
            
        }catch(SQLException e) {
            System.out.println("Terjadi kesalahan" + e.getMessage());
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
        jLabel2 = new javax.swing.JLabel();
        cmdK = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        TxtNoPolis = new javax.swing.JTextField();
        lblJenis = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbljammasuk = new javax.swing.JLabel();
        lbljamkeluar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblLama = new javax.swing.JLabel();

        setTitle("KENDARAAN KELUAR");

        jLabel1.setText("Nomor Kendaraan :");

        jLabel2.setText("Jenis Kendaraan :");

        cmdK.setText("KELUAR");
        cmdK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdKActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TxtNoPolis.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TxtNoPolisCaretUpdate(evt);
            }
        });

        lblJenis.setText("-");

        jLabel3.setText("Jam Masuk :");

        lbljammasuk.setText("-");

        lbljamkeluar.setText("-");

        jLabel6.setText("Jam Keluar :");

        jLabel7.setText("Lama Parkir :");

        lblLama.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbljamkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbljammasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtNoPolis, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(95, 95, 95)
                                .addComponent(cmdK, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLama, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNoPolis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cmdK, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbljammasuk)))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbljamkeluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblLama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKActionPerformed
        // TODO add your handling code here:
        if("KELUAR".equals(this.cmdK.getText()))
        {
          try {
            
            Connection c=ClassDatabase.getkoneksi();
            Statement s= c.createStatement();
            String sql = "Update parkir_data SET keluar=NOW() Where nomor_polisi='"+this.TxtNoPolis.getText()+"'";
            com.mysql.jdbc.PreparedStatement p=(com.mysql.jdbc.PreparedStatement) c.prepareStatement(sql);            
            p.executeUpdate();
            
            p.close();
            JOptionPane.showMessageDialog(this, "Sukses Update data");
            loadData();
            }catch(SQLException e){
            System.out.println(e);        
         }
        }
        
    }//GEN-LAST:event_cmdKActionPerformed
private void getjenis(String idjenis)
{
    try {                
            String jenis="";
            Connection c=ClassDatabase.getkoneksi();
            Statement s= c.createStatement();
            String sql="Select * from jenis_kendaraan Where id_jenis='"+idjenis+"'";
            ResultSet r=s.executeQuery(sql);
            
            while (r.next()) {
                jenis=r.getString("jenis");
                lblJenis.setText(jenis);
                
            }
            r.close();
            s.close();
        }catch(SQLException e) {
            System.out.println(e);
        }
}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TxtNoPolisCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TxtNoPolisCaretUpdate
        // TODO add your handling code here:
        try {                
            String no_pol=(String) this.TxtNoPolis.getText();
            Connection c=ClassDatabase.getkoneksi();
            Statement s= c.createStatement();
            String sql="Select * from parkir_data Where nomor_polisi='"+no_pol+"' and keluar IS NULL";
            ResultSet r=s.executeQuery(sql);
            
            if(r.next())
            {
                java.util.Date today = new java.util.Date();
                Calendar cal = Calendar.getInstance(); 
                cal.getTime(); 
                
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String hariini=format.format(cal.getTime());
                this.lbljamkeluar.setText(hariini);
                this.cmdK.setText("KELUAR");
                getjenis(r.getString("id_jenis"));
                this.lbljammasuk.setText(r.getString("masuk"));
                 Date tgl1=format.parse(this.lbljammasuk.getText());
                 Date tgl2=format.parse(this.lbljamkeluar.getText());
        long diff=((tgl2.getTime()-tgl1.getTime()));
        long diffMinutes = diff / (60 * 1000)% 60;         
        long diffHours = diff / (60 * 60 * 1000)% 60;
       
        String lama_jam=String.valueOf(diffHours);
        String lama_menit=String.valueOf(diffMinutes);
      
            this.lblLama.setText(lama_jam+" jam "+lama_menit+ " menit");
        
        
                
            }else{
                this.cmdK.setText("Unknown");
                this.lblJenis.setText("-");
            }
            
            r.close();
            s.close();
        }catch(SQLException e) {
            System.out.println(e);
        } catch (ParseException ex) {
        Logger.getLogger(FrmKendaraanKeluar.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_TxtNoPolisCaretUpdate
 private void cetakbukti(String nopol,String lama)
    {
        try {
                        
            String reportName = ClassDatabase.PathReport + "BuktiParkir.jasper";
            HashMap parameter = new HashMap();
            File reportFile = new File(reportName);
            parameter.put("nopol",nopol);
            parameter.put("lama", lama);
           
            JasperReport jReport = (JasperReport)JRLoader.loadObject(reportFile.getPath());
            JasperPrint jPrint = JasperFillManager.fillReport(jReport, parameter, ClassDatabase.getkoneksi());
            JasperViewer.viewReport(jPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
           
            } catch (Exception ex) {
                System.out.println(ex);
            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtNoPolis;
    private javax.swing.JButton cmdK;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblJenis;
    private javax.swing.JLabel lblLama;
    private javax.swing.JLabel lbljamkeluar;
    private javax.swing.JLabel lbljammasuk;
    // End of variables declaration//GEN-END:variables
}
