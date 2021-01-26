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
import java.awt.Color;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import models.DailyDataModel;
import models.PresensiModel;
import models.RekapanModel;
import models.TeacherModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.FirebaseConnection;
import views.dark.format.presensiTemplate;

import static utils.Constants.LOGIN_ENTER_COLOR;
import static utils.Constants.LOGIN_NORMAL_COLOR;

/**
 *
 * @author Azriel
 */
public class DataForm extends javax.swing.JFrame {

    /**
     * Creates new form Home+
     */
    DefaultTableModel dtm;
    DatabaseReference db;
    ArrayList<TeacherModel> gurulist = new ArrayList<TeacherModel>();
    boolean status_db = false, status_guru = false;

    public void initguru() {
        gurulist.clear();
        db.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot ds) {
                status_db = true;
                for (DataSnapshot ss : ds.getChildren()) {
                    TeacherModel guru = ss.getValue(TeacherModel.class);
                    gurulist.add(guru);
                }
                status_guru = true;

            }

            @Override
            public void onCancelled(DatabaseError de) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    public DataForm() {
        initComponents();
        setLocation();
        try {
            db = FirebaseConnection.getRef("Guru");
        } catch (IOException ex) {
            System.out.println(ex);
        }
        initguru();

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
        cmbTahun = new javax.swing.JComboBox<>();
        cmbSemester = new javax.swing.JComboBox<>();
        cmbTriwulan = new javax.swing.JComboBox<>();
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

        cmbBulan.setBackground(new java.awt.Color(45, 48, 52));
        cmbBulan.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        cmbBulan.setForeground(new java.awt.Color(255, 255, 255));
        cmbBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[ Pilih Bulan ]", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
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

        cmbTahun.setBackground(new java.awt.Color(45, 48, 52));
        cmbTahun.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        cmbTahun.setForeground(new java.awt.Color(255, 255, 255));
        cmbTahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[ Pilih Tahun ]", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));
        cmbTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTahunActionPerformed(evt);
            }
        });

        cmbSemester.setBackground(new java.awt.Color(45, 48, 52));
        cmbSemester.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        cmbSemester.setForeground(new java.awt.Color(255, 255, 255));
        cmbSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[ Pilih Semester ]", "1", "2" }));
        cmbSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSemesterActionPerformed(evt);
            }
        });

        cmbTriwulan.setBackground(new java.awt.Color(45, 48, 52));
        cmbTriwulan.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        cmbTriwulan.setForeground(new java.awt.Color(255, 255, 255));
        cmbTriwulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[ Pilih Pertriwulan ]", "Jan-Feb-Mar", "Apr-May-Jun", "Jul-Aug-Sep", "Oct-Nov-Dec" }));
        cmbTriwulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTriwulanActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(85, 99, 233));
        jButton1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ekspor ke Excel");
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
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
                            .addComponent(cmbTahun, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbSemester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbTriwulan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(cmbTriwulan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
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

    private void cmbTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTahunActionPerformed
        // TODO add your handling code here:
        if (check(cmbTahun)) {
            System.out.println("RUN FILTER");
            resetfilter(cmbTahun);
            String thn = cmbTahun.getSelectedItem().toString();
            String awal = thn + "-01-01";
            String akhir = thn + "-12-31";
            filter(awal, akhir);
        }

    }//GEN-LAST:event_cmbTahunActionPerformed

    private void cmbBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBulanActionPerformed
        // TODO add your handling code here:
        if (check(cmbBulan)) {
            System.out.println("RUN FILTER");
            resetfilter(cmbBulan);
            String bln = cmbBulan.getSelectedItem().toString();
            String awal = "2020-" + bln + "-01";
            String akhir = "2020-" + bln + "-31";
            filter(awal, akhir);
        }
    }//GEN-LAST:event_cmbBulanActionPerformed

    private void cmbSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSemesterActionPerformed
        // TODO add your handling code here:
        if (check(cmbSemester)) {
            System.out.println("RUN FILTER");
            String semester = cmbSemester.getSelectedItem().toString();
            resetfilter(cmbSemester);
            Date dt = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
            String tahun_sekarang = sdf.format(dt);

            if (semester.equals("1")) {
                String awal = tahun_sekarang + "-01-01";
                String akhir = tahun_sekarang + "-06-31";
                filter(awal, akhir);
            } else if (semester.equals("2")) {
                String awal = tahun_sekarang + "-07-01";
                String akhir = tahun_sekarang + "-12-31";
                filter(awal, akhir);
            }
        }

    }//GEN-LAST:event_cmbSemesterActionPerformed


    private void cmbTriwulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTriwulanActionPerformed
        if (check(cmbTriwulan)) {
            System.out.println("RUN FILTER");
            String triwulan = cmbTriwulan.getSelectedItem().toString();
            resetfilter(cmbTriwulan);

            Date dt = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
            String tahun_sekarang = sdf.format(dt);

            if (triwulan.equalsIgnoreCase("jan-feb-mar")) {
                String awal = tahun_sekarang + "-01-01";
                String akhir = tahun_sekarang + "-03-31";
                filter(awal, akhir);
            } else if (triwulan.equalsIgnoreCase("apr-may-jun")) {
                String awal = tahun_sekarang + "-04-01";
                String akhir = tahun_sekarang + "-06-31";
                filter(awal, akhir);
            } else if (triwulan.equalsIgnoreCase("jul-aug-sep")) {
                String awal = tahun_sekarang + "-07-01";
                String akhir = tahun_sekarang + "-09-31";
                filter(awal, akhir);
            } else if (triwulan.equalsIgnoreCase("oct-nov-des")) {
                String awal = tahun_sekarang + "-10-01";
                String akhir = tahun_sekarang + "-12-31";
                filter(awal, akhir);
            }

        }

    }//GEN-LAST:event_cmbTriwulanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ExportExcel();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(Color.decode(LOGIN_ENTER_COLOR));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(Color.decode(LOGIN_NORMAL_COLOR));
    }//GEN-LAST:event_jButton1MouseExited
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
    int loopbox = 1;

    private void resetfilter(JComboBox box) {
        if (loopbox == 1) {
            loopbox--;
            ArrayList<JComboBox> array = new ArrayList<JComboBox>();
            array.add(cmbTriwulan);
            array.add(cmbSemester);
            array.add(cmbTahun);
            array.add(cmbBulan);

            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) != box) {
                    array.get(i).setSelectedIndex(0);
                }
            }
        } else if (loopbox == 0) {
            loopbox = 1;
            resetfilter(box);
        } else {
            loopbox--;
        }

    }

    private boolean check(JComboBox box) {
        boolean status = false;
        if (box.getSelectedIndex() != 0) {
            status = true;
        }
        return status;
    }

    public void filter(String awal, String akhir) {
        if (status_db && status_guru) {

            for (int i = 0; i < gurulist.size(); i++) {
                TeacherModel guru = gurulist.get(i);
                guru.setJml_masuk(0);
                final int nomor = i;
                System.out.println("Nomor : " + nomor);
                DatabaseReference dbRef2 = null;
                try {
                    dbRef2 = FirebaseConnection.getRef("RekapHarianBaru");
                } catch (IOException ex) {
                    System.out.println(ex);
                }

                System.out.println("ini yang muncul:" + dbRef2);
                System.out.println(awal + " Sampai " + akhir);
                // Untuk Kehadiran Harus ada Waktu Keluar
                // contoh kalo yang dibawah ss.child(uid).child("waktu_masuk").getValue(String.class);
                // Kalo Gk ada  Di anggap gk hadir DI Rekapan
                dbRef2.orderByKey().startAt(awal).endAt(akhir).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dPresensi) {
                        boolean change = false;
                        for (DataSnapshot ss : dPresensi.getChildren()) {
                            DailyDataModel pm = ss.child(guru.getRfid_key()).getValue(DailyDataModel.class);
                            if (ss.child(guru.getRfid_key()).getValue(DailyDataModel.class) == null) {
                                System.out.println("BREAK");
                                continue;
                            }
                            System.out.println("Start");
                            System.out.println("PM : " + pm);
                            System.out.println(guru.getRfid_key());
                            String w_masuk = pm.getWaktu_masuk();
                            String tanggal = pm.getTanggal();
                            guru.setJml_masuk(guru.getJml_masuk() + 1);
                            gurulist.get(nomor).setJml_masuk(guru.getJml_masuk());
                            System.out.println(guru.getJml_masuk());
                            System.out.println("OwO");
//                            System.out.println("Rekapan Tahun: " + dPresensi);
                        }
                        addRowDTM();
                    }

                    @Override
                    public void onCancelled(DatabaseError de) {
                        System.out.println("The read failed: " + de.getCode());
                    }
                });
            }

        } else if (status_db && !status_guru) {
            JOptionPane.showMessageDialog(null, "Cek Database Guru");
            initguru();
        } else {
            JOptionPane.showMessageDialog(null, "Cek Koneksi");
            initguru();
        }
    }

    private void addRowDTM() {
        String[] kolom = {"No", "GNRS", "Nama", "RFID Key", "Jumlah Kehadiran"};
        dtm = new DefaultTableModel(null, kolom);
        for (int i = 0; i < gurulist.size(); i++) {
            TeacherModel guru = gurulist.get(i);
            System.out.println("Add Row Guru : " + guru.getJml_masuk());
            dtm.addRow(new String[]{(i + 1) + ".", guru.getGnrs(), guru.getName(), guru.getRfid_key(), String.valueOf(guru.getJml_masuk())});
        }
        jTable1.setModel(dtm);
    }

    public void ExportExcel() {
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
                JOptionPane.showMessageDialog(null,"Ekspor Berhasil");
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbBulan;
    private javax.swing.JComboBox<String> cmbSemester;
    private javax.swing.JComboBox<String> cmbTahun;
    private javax.swing.JComboBox<String> cmbTriwulan;
    private javax.swing.JButton jButton1;
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
