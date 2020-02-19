/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.dark;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import models.PresensiModel;
import models.RekapanModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.FirebaseConnection;
import views.dark.format.presensiTemplate;

/**
 *
 * @author Azriel
 */
public class DataForm extends javax.swing.JFrame {

    /**
     * Creates new form Home+
     */
    
    DefaultTableModel dtm;
    
    public DataForm() {
        initComponents();
        setLocation();


//        showDataForm();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panelMain = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        panelSidebar = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        labelKehadiran3 = new javax.swing.JLabel();
        cmbBulan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        CmbTahun = new javax.swing.JComboBox<>();
        cmbSemester = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        panelAbsen = new javax.swing.JPanel();
        labelKehadiran = new javax.swing.JLabel();
        labelKehadiran1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMain.setBackground(new java.awt.Color(54, 57, 63));

        panelHeader.setBackground(new java.awt.Color(32, 34, 37));

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        panelSidebar.setBackground(new java.awt.Color(32, 34, 37));

        javax.swing.GroupLayout panelSidebarLayout = new javax.swing.GroupLayout(panelSidebar);
        panelSidebar.setLayout(panelSidebarLayout);
        panelSidebarLayout.setHorizontalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        panelSidebarLayout.setVerticalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );

        panelMenu.setBackground(new java.awt.Color(41, 43, 47));

        labelKehadiran3.setFont(new java.awt.Font("Poppins", 0, 28)); // NOI18N
        labelKehadiran3.setForeground(new java.awt.Color(103, 103, 103));
        labelKehadiran3.setText("Filter Status");

        cmbBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[ Pilih Bulan ]", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "12" }));
        cmbBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBulanActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Vector_1.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        CmbTahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[ Pilih Tahun ]", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));
        CmbTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbTahunActionPerformed(evt);
            }
        });

        cmbSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[ Pilih Semseter ]", "1", "2" }));
        cmbSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSemesterActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[ Pilih Pertriwulan ]", "Jan-Feb-Mar", "Apr-May-Jun", "Jul-Aug-Sep", "Oct-Nov-Dec" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jButton1.setText("Ekspor ke Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbBulan, 0, 225, Short.MAX_VALUE)
                            .addComponent(labelKehadiran3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CmbTahun, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbSemester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton1)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelKehadiran3)
                .addGap(18, 18, 18)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CmbTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(72, 72, 72))
        );

        jPanel1.setBackground(new java.awt.Color(54, 57, 63));

        panelAbsen.setBackground(new java.awt.Color(32, 34, 37));

        labelKehadiran.setFont(new java.awt.Font("Poppins", 0, 28)); // NOI18N
        labelKehadiran.setForeground(new java.awt.Color(103, 103, 103));
        labelKehadiran.setText("XII RPL 1");

        labelKehadiran1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        labelKehadiran1.setForeground(new java.awt.Color(103, 103, 103));
        labelKehadiran1.setText("Kelas");

        javax.swing.GroupLayout panelAbsenLayout = new javax.swing.GroupLayout(panelAbsen);
        panelAbsen.setLayout(panelAbsenLayout);
        panelAbsenLayout.setHorizontalGroup(
            panelAbsenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAbsenLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelAbsenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelKehadiran)
                    .addComponent(labelKehadiran1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAbsenLayout.setVerticalGroup(
            panelAbsenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAbsenLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelKehadiran1)
                .addGap(5, 5, 5)
                .addComponent(labelKehadiran)
                .addGap(20, 20, 20))
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAbsen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelAbsen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(panelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new HomeForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void CmbTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbTahunActionPerformed
        // TODO add your handling code here:
        String thn = CmbTahun.getSelectedItem().toString();
        String awal = thn +"-01-01";
        String akhir = thn +"-12-31";
        filter(awal ,akhir);
    }//GEN-LAST:event_CmbTahunActionPerformed

    private void cmbBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBulanActionPerformed
        // TODO add your handling code here:
        String bln = cmbBulan.getSelectedItem().toString();
        String awal = "2020-"+bln+"-01";
        String akhir = "2020-"+bln+"-31";
        filterBulan(awal,akhir);
    }//GEN-LAST:event_cmbBulanActionPerformed

    private void cmbSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSemesterActionPerformed
        // TODO add your handling code here:
        String semester = cmbSemester.getSelectedItem().toString();
        
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String tahun_sekarang = sdf.format(dt);
        
        if(semester == "1"){
            String awal = tahun_sekarang + "-01-01";
            String akhir = tahun_sekarang + "-06-31";
            filterSemester(awal,akhir);
        }else if(semester == "2"){
            String awal = tahun_sekarang + "-07-01";
            String akhir = tahun_sekarang + "-12-31";
            filterSemester(awal,akhir);
        }
    }//GEN-LAST:event_cmbSemesterActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        String triwulan = jComboBox3.getSelectedItem().toString();
        
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String tahun_sekarang = sdf.format(dt);
        
        if(triwulan.equalsIgnoreCase("jan-feb-mar")){
            String awal = tahun_sekarang + "-01-01";
            String akhir = tahun_sekarang + "-03-31";
            filter(awal,akhir);
        }else if(triwulan.equalsIgnoreCase("apr-may-jun")){
            String awal = tahun_sekarang + "-04-01";
            String akhir = tahun_sekarang + "-06-31";
            filter(awal,akhir);
        }else if(triwulan.equalsIgnoreCase("jul-aug-sep")){
            String awal = tahun_sekarang + "-07-01";
            String akhir = tahun_sekarang + "-09-31";
            filter(awal,akhir);
        }else if(triwulan.equalsIgnoreCase("oct-nov-des")){
            String awal = tahun_sekarang + "-10-01";
            String akhir = tahun_sekarang + "-12-31";
            filter(awal,akhir);
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ExportExcel();
    }//GEN-LAST:event_jButton1ActionPerformed
//test
    /**
     * @param args the command line arguments
     */
    
    final public void setLocation() {
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new DataForm().setVisible(true));
    }
    
        public void filter(String awal,String akhir){
        DatabaseReference ref = null;
     	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	Date date = new Date();
        System.out.println(dateFormat.format(date));
        
        try{
            ref = FirebaseConnection.getRef("Guru");
        }catch(IOException ex){
            System.out.println(ex);
        }
        String[] kolom = {"ID","Nama","Waktu Masuk","Status","Tahun"};
        dtm = new DefaultTableModel(null,kolom);
        ref.addValueEventListener(new ValueEventListener(){
            @Override
            public void onDataChange(DataSnapshot dGuru) {
                
                String tahun ="2020";
                for (DataSnapshot guruSnapshot : dGuru.getChildren()){

                    String uid = guruSnapshot.child("rfid_key").getValue(String.class);
                    String name = guruSnapshot.child("name").getValue(String.class);
                
                    
                    System.out.println("NAME : " + name);
                    System.out.println("GURU : " + guruSnapshot);
                    //        Untuk Split Tanggal
                    
                    String tanggal = "12-12-2020";
                    String[] array = tanggal.split("-");
//                startAt("01-01"+array[2]).endAt("31-12"+array[2])
//                child("06-02-"+array[2])
                    DatabaseReference dbRef2 = null;
                    try{
                        dbRef2 = FirebaseConnection.getRef("RekapHarianBaru");
                    }catch(IOException ex){
                        System.out.println(ex);
                    }
                    
                    System.out.println("ini yang muncul:"+dbRef2);
                    // Untuk Kehadiran Harus ada Waktu Keluar
                    // contoh kalo yang dibawah ss.child(uid).child("waktu_masuk").getValue(String.class);
                    // Kalo Gk ada  Di anggap gk hadir DI Rekapan
                    dbRef2.orderByKey().startAt(awal).endAt(akhir).addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dPresensi) {
                            for(DataSnapshot ss : dPresensi.getChildren() ){
                                RekapanModel pm = ss.getValue(RekapanModel.class);
                                String w_masuk = ss.child(uid).child("waktu_masuk").getValue(String.class);
                                String tanggal = ss.child(uid).child("tanggal").getValue(String.class);
                                if(ss.child(uid).child("tanggal").getValue(String.class) != null){
                                    dtm.addRow(new String[]{uid,name,w_masuk,"Hadir",tanggal});
                                }else{
//                                    dtm.addRow(new String[]{"Dia","Tidak","Hadir",uid,name});
                                }
                                System.out.println("Rekapan Tahun: " + dPresensi);
                            }
      
                        }
                        
                        @Override
                        public void onCancelled(DatabaseError de) {
                           System.out.println("The read failed: " + de.getCode());
                        }
                    });
                   
                }        
            }
            @Override
            public void onCancelled(DatabaseError de) {
                System.out.println("The read failed: " + de.getCode());
            }
        });
         jTable1.setModel(dtm);
    }
        
        public void filterBulan(String awal,String akhir){
        DatabaseReference ref = null;
     	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	Date date = new Date();
        System.out.println(dateFormat.format(date));
        
        try{
            ref = FirebaseConnection.getRef("Guru");
        }catch(IOException ex){
            System.out.println(ex);
        }
        String[] kolom = {"ID","Nama","Waktu Masuk","Status","Tahun"};

        dtm = new DefaultTableModel(null,kolom);
        ref.addValueEventListener(new ValueEventListener(){
            @Override
            public void onDataChange(DataSnapshot dGuru) {
                
                String tahun ="2020";
                for (DataSnapshot guruSnapshot : dGuru.getChildren()){

                    String uid = guruSnapshot.child("rfid_key").getValue(String.class);
                    String name = guruSnapshot.child("name").getValue(String.class);
                
                    
                    System.out.println("NAME : " + name);
                    System.out.println("GURU : " + guruSnapshot);
                    //        Untuk Split Tanggal
                    
                    String tanggal = "12-12-2020";
                    String[] array = tanggal.split("-");
//                startAt("01-01"+array[2]).endAt("31-12"+array[2])
//                child("06-02-"+array[2])
                    DatabaseReference dbRef2 = null;
                    try{
                        dbRef2 = FirebaseConnection.getRef("RekapHarianBaru");
                    }catch(IOException ex){
                        System.out.println(ex);
                    }
                    
                    System.out.println("ini yang muncul:"+dbRef2);
                    // Untuk Kehadiran Harus ada Waktu Keluar
                    // contoh kalo yang dibawah ss.child(uid).child("waktu_masuk").getValue(String.class);
                    // Kalo Gk ada  Di anggap gk hadir DI Rekapan
                    dbRef2.orderByKey().startAt(awal).endAt(akhir).addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dPresensi) {
                            for(DataSnapshot ss : dPresensi.getChildren() ){
                                RekapanModel pm = ss.getValue(RekapanModel.class);
                                String w_masuk = ss.child(uid).child("waktu_masuk").getValue(String.class);
                                String tanggal = ss.child(uid).child("tanggal").getValue(String.class);
                                if(ss.child(uid).child("tanggal").getValue(String.class) != null){
                                    dtm.addRow(new String[]{uid,name,w_masuk,"Hadir",tanggal});
                                }else{
//                                    dtm.addRow(new String[]{"Dia","Tidak","Hadir",uid,name});
                                }
                                System.out.println("Rekapan Tahun: " + dPresensi);
                            }
      
                        }
                        
                        @Override
                        public void onCancelled(DatabaseError de) {
                           System.out.println("The read failed: " + de.getCode());
                        }
                    });
                   
                }        
            }
            @Override
            public void onCancelled(DatabaseError de) {
                System.out.println("The read failed: " + de.getCode());
            }
        });
         jTable1.setModel(dtm);
    }
        
        public void filterSemester(String awal,String akhir){
        DatabaseReference ref = null;
     	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	Date date = new Date();
        System.out.println(dateFormat.format(date));
        
        try{
            ref = FirebaseConnection.getRef("Guru");
        }catch(IOException ex){
            System.out.println(ex);
        }
        String[] kolom = {"ID","Nama","Waktu Masuk","Status","Tahun"};
        DefaultTableModel dtm;
        dtm = new DefaultTableModel(null,kolom);
        ref.addValueEventListener(new ValueEventListener(){
            @Override
            public void onDataChange(DataSnapshot dGuru) {
                
                String tahun ="2020";
                for (DataSnapshot guruSnapshot : dGuru.getChildren()){

                    String uid = guruSnapshot.child("rfid_key").getValue(String.class);
                    String name = guruSnapshot.child("name").getValue(String.class);
                
                    
                    System.out.println("NAME : " + name);
                    System.out.println("GURU : " + guruSnapshot);
                    //        Untuk Split Tanggal
                    
                    String tanggal = "12-12-2020";
                    String[] array = tanggal.split("-");
//                startAt("01-01"+array[2]).endAt("31-12"+array[2])
//                child("06-02-"+array[2])
                    DatabaseReference dbRef2 = null;
                    try{
                        dbRef2 = FirebaseConnection.getRef("RekapHarianBaru");
                    }catch(IOException ex){
                        System.out.println(ex);
                    }
                    
                    System.out.println("ini yang muncul:"+dbRef2);
                    // Untuk Kehadiran Harus ada Waktu Keluar
                    // contoh kalo yang dibawah ss.child(uid).child("waktu_masuk").getValue(String.class);
                    // Kalo Gk ada  Di anggap gk hadir DI Rekapan
                    dbRef2.orderByKey().startAt(awal).endAt(akhir).addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dPresensi) {
                            for(DataSnapshot ss : dPresensi.getChildren() ){
                                RekapanModel pm = ss.getValue(RekapanModel.class);
                                String w_masuk = ss.child(uid).child("waktu_masuk").getValue(String.class);
                                String tanggal = ss.child(uid).child("tanggal").getValue(String.class);
                                if(ss.child(uid).child("tanggal").getValue(String.class) != null){
                                    dtm.addRow(new String[]{uid,name,w_masuk,"Hadir",tanggal});
                                }else{
//                                    dtm.addRow(new String[]{"Dia","Tidak","Hadir",uid,name});
                                }
                                System.out.println("Rekapan Tahun: " + dPresensi);
                            }
      
                        }
                        
                        @Override
                        public void onCancelled(DatabaseError de) {
                           System.out.println("The read failed: " + de.getCode());
                        }
                    });
                   
                }        
            }
            @Override
            public void onCancelled(DatabaseError de) {
                System.out.println("The read failed: " + de.getCode());
            }
        });
         jTable1.setModel(dtm);
    }
        
       public void ExportExcel(){
        FileOutputStream excelFou = null;
        BufferedOutputStream excelBou = null;
        XSSFWorkbook excelJTableExporter = null;
//        Choose Location saving file
//        PengelolaanData h = new PengelolaanData();
        JFileChooser excelFileChooser = new JFileChooser("C:\\Users\\emir\\Documents\\NetBeansProjects\\exportExcel");
//        change Dialog Box Title
        excelFileChooser.setDialogTitle("Save As");
//        Only filter files with these extensions "xls","xlsx","xlsm"
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
        excelFileChooser.setFileFilter(fnef);
//        TableModel model = h.tbl_pelanggan.getModel();
        int excelChooser = excelFileChooser.showSaveDialog(null);

//        check if save poi libararies to netbeans
        if (excelChooser == JFileChooser.APPROVE_OPTION) {

            try {
                //Import excel poi libraries to netbeans
                excelJTableExporter = new XSSFWorkbook();
                XSSFSheet excelSheet = excelJTableExporter.createSheet("JTable Sheet");
                //loop to get jtable column and rows
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    XSSFRow excelRow = excelSheet.createRow(i);
                    for (int j = 0; j < dtm.getColumnCount(); j++) {
                        XSSFCell excelCell = excelRow.createCell(j);

                        excelCell.setCellValue(dtm.getValueAt(i, j).toString());
                    }
                }   //Append xlsx file extensions to selected files to create unique file names
                excelFou = new FileOutputStream(excelFileChooser.getSelectedFile() + ".xlsx");
                excelBou = new BufferedOutputStream(excelFou);
                excelJTableExporter.write(excelBou);
                JOptionPane.showMessageDialog(null,"Success Export Excel");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (excelBou != null) {
                        excelBou.close();
                    }
                    if (excelFou != null) {
                        excelFou.close();
                    }
                    if (excelJTableExporter != null) {
                        excelJTableExporter.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } 
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbTahun;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbBulan;
    private javax.swing.JComboBox<String> cmbSemester;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelKehadiran;
    private javax.swing.JLabel labelKehadiran1;
    private javax.swing.JLabel labelKehadiran3;
    private javax.swing.JPanel panelAbsen;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelSidebar;
    // End of variables declaration//GEN-END:variables
}
