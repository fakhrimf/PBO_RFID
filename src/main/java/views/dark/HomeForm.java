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
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import models.DailyDataModel;
import models.PresensiModel;
import models.HomeModel;
import models.TeacherModel;
import utils.FirebaseConnection;
import views.dark.format.presensiTemplate;

/**
 *
 * @author Aditya
 */
public class HomeForm extends javax.swing.JFrame {

    DefaultTableModel dtm;
    ArrayList<String> uid_list, nama_list, waktu_list;
    DefaultTableModel model;
    DatabaseReference db;
    ArrayList<TeacherModel> gurulist = new ArrayList<TeacherModel>();
    ArrayList<String[]> datalist = new ArrayList<String[]>();
    boolean status_db = false, status_guru = false;
//    int progress_value;

    public void initguru() {
        gurulist.clear();
        db.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot ds) {
                for (DataSnapshot ss : ds.getChildren()) {
                    TeacherModel guru = ss.getValue(TeacherModel.class);
                    gurulist.add(guru);
                }
            }

            @Override
            public void onCancelled(DatabaseError de) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    public HomeForm() {
        initComponents();
        setLocation();
        try {
            db = FirebaseConnection.getRef("Guru");
        } catch (IOException ex) {
            System.out.println(ex);
        }
        initguru();
        getDataHome();
        showDataPresensi();
        responsive();
//        
//        try{
//                for(int a=1;a<=100;a++){
//                 abc(50);
//                
//                }
//                
//            }catch(Exception e)
//            {
//                System.out.println(e);
//            }
    }
    
//     public void abc(int a){
//        progress_value=a;
//    
//    }
     
//    public void paint(Graphics g){
//        super.paint(g);
//        
//        Graphics2D g2=(Graphics2D)g;
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
//        
//        g2.translate(this.getWidth()/2, this.getHeight()/2);
//        g2.rotate(Math.toRadians(270));
//        
//        Arc2D.Float arc=new Arc2D.Float(Arc2D.PIE);
//        
//        Ellipse2D circle=new Ellipse2D.Double(0,0,120,120);
//        arc.setFrameFromCenter(new Point(0,0), new Point(135,135));
//        circle.setFrameFromCenter(new Point(0,0), new Point(120,120));
//        
//        arc.setAngleStart(1);
//        arc.setAngleExtent(-progress_value*3.6);
//        g2.setColor(new Color(85, 99, 233));
//        g2.draw(arc);
//        g2.fill(arc);
//        
//        g2.setColor(new Color(32,34,37));
//        g2.draw(circle);
//        g2.fill(circle);
//        g2.setColor(new Color(85, 99, 233));
//        g2.rotate(Math.toRadians(90));
//        g.setFont(new Font("Poppins",Font.PLAIN,60));
//        
//        FontMetrics fm=g2.getFontMetrics();
//        Rectangle2D r=fm.getStringBounds(progress_value+"%", g);
//        
//        int x=(0-(int)r.getWidth()/2);
//        int y=(0-(int)r.getHeight()/2+fm.getAscent());
//        
//        g2.drawString(progress_value+"%",x,y);
//        
//        JPanel panel1 = this.panelAbsen;
//        panel1.setLayout(new java.awt.BorderLayout());
//    }

    private void responsive() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        int parentPanelWidth = width - (panelSidebar.getWidth() + panelMenu.getWidth());
        int parentPanelHeight = height - panelHeader.getHeight();
        panelMain.setSize(width, height);
        panelMenu.setSize(367, height);
        panelSidebar.setSize(56, height);
        jPanel17.setVisible(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        panelSidebar = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelBtnHome = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panelBtnPresensi = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelBtnRekapan = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panelAbsen = new javax.swing.JPanel();
        labelKehadiran = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jList16 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 720));

        panelMain.setBackground(new java.awt.Color(47, 51, 58));
        panelMain.setPreferredSize(new java.awt.Dimension(1280, 720));
        panelMain.setRequestFocusEnabled(false);

        panelHeader.setBackground(new java.awt.Color(32, 34, 37));

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1371, Short.MAX_VALUE)
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
            .addGap(0, 70, Short.MAX_VALUE)
        );
        panelSidebarLayout.setVerticalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelMenu.setBackground(new java.awt.Color(41, 43, 47));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Ellipse 6.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(142, 146, 151));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("John Doe");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(142, 146, 151));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PBO");

        panelBtnHome.setBackground(new java.awt.Color(47, 51, 58));
        panelBtnHome.setPreferredSize(new java.awt.Dimension(347, 72));
        panelBtnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnHomeMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelBtnHomeMouseReleased(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Vector_1.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 34)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(142, 146, 151));
        jLabel8.setText("Home");

        javax.swing.GroupLayout panelBtnHomeLayout = new javax.swing.GroupLayout(panelBtnHome);
        panelBtnHome.setLayout(panelBtnHomeLayout);
        panelBtnHomeLayout.setHorizontalGroup(
            panelBtnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtnHomeLayout.setVerticalGroup(
            panelBtnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBtnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBtnHomeLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelBtnPresensi.setBackground(new java.awt.Color(41, 43, 47));
        panelBtnPresensi.setPreferredSize(new java.awt.Dimension(347, 72));
        panelBtnPresensi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnPresensiMouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bx_bx-line-chart.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 34)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(142, 146, 151));
        jLabel9.setText("Presensi");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtnPresensiLayout = new javax.swing.GroupLayout(panelBtnPresensi);
        panelBtnPresensi.setLayout(panelBtnPresensiLayout);
        panelBtnPresensiLayout.setHorizontalGroup(
            panelBtnPresensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnPresensiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtnPresensiLayout.setVerticalGroup(
            panelBtnPresensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnPresensiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBtnPresensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBtnPresensiLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelBtnRekapan.setBackground(new java.awt.Color(41, 43, 47));
        panelBtnRekapan.setPreferredSize(new java.awt.Dimension(347, 72));
        panelBtnRekapan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnRekapanMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Vector (1)_1.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 34)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(142, 146, 151));
        jLabel10.setText("Rekapan");

        javax.swing.GroupLayout panelBtnRekapanLayout = new javax.swing.GroupLayout(panelBtnRekapan);
        panelBtnRekapan.setLayout(panelBtnRekapanLayout);
        panelBtnRekapanLayout.setHorizontalGroup(
            panelBtnRekapanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnRekapanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
        );
        panelBtnRekapanLayout.setVerticalGroup(
            panelBtnRekapanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnRekapanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBtnRekapanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBtnRekapanLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBtnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addComponent(panelBtnRekapan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelBtnPresensi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(panelBtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBtnPresensi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBtnRekapan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel2.setBackground(new java.awt.Color(47, 51, 58));
        jPanel2.setPreferredSize(new java.awt.Dimension(629, 588));

        jPanel1.setBackground(new java.awt.Color(47, 51, 58));
        jPanel1.setForeground(new java.awt.Color(47, 51, 58));
        jPanel1.setPreferredSize(new java.awt.Dimension(629, 588));

        panelAbsen.setBackground(new java.awt.Color(32, 34, 37));
        panelAbsen.setPreferredSize(new java.awt.Dimension(860, 329));
        panelAbsen.setVerifyInputWhenFocusTarget(false);

        labelKehadiran.setFont(new java.awt.Font("Poppins", 0, 64)); // NOI18N
        labelKehadiran.setForeground(new java.awt.Color(142, 146, 151));
        labelKehadiran.setText("Kehadiran");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Ellipse 2.png"))); // NOI18N

        javax.swing.GroupLayout panelAbsenLayout = new javax.swing.GroupLayout(panelAbsen);
        panelAbsen.setLayout(panelAbsenLayout);
        panelAbsenLayout.setHorizontalGroup(
            panelAbsenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAbsenLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(labelKehadiran, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18))
        );
        panelAbsenLayout.setVerticalGroup(
            panelAbsenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAbsenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAbsenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAbsenLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelKehadiran)
                        .addGap(93, 93, 93)))
                .addContainerGap())
        );

        jScrollPane1.setBackground(new java.awt.Color(32, 34, 37));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setForeground(new java.awt.Color(32, 34, 37));
        jScrollPane1.setToolTipText("");
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setColumnHeaderView(null);

        jTable1.setBackground(new java.awt.Color(32, 34, 37));
        jTable1.setForeground(new java.awt.Color(103, 103, 103));
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
        jTable1.setGridColor(new java.awt.Color(32, 34, 37));
        jTable1.setPreferredSize(new java.awt.Dimension(300, 500));
        jTable1.setRowHeight(40);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAbsen, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelAbsen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(47, 51, 58));
        jPanel17.setPreferredSize(new java.awt.Dimension(1200, 128));

        jScrollPane17.setBackground(new java.awt.Color(47, 51, 58));
        jScrollPane17.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        jList16.setBackground(new java.awt.Color(47, 51, 58));
        jList16.setForeground(new java.awt.Color(47, 51, 58));
        jList16.setSelectionForeground(new java.awt.Color(47, 51, 58));
        jScrollPane17.setViewportView(jList16);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 942, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(panelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                    .addGap(0, 429, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                    .addGap(0, 44, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1371, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelBtnRekapanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnRekapanMouseClicked
        // TODO add your handling code here:
        new DataForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_panelBtnRekapanMouseClicked

    private void panelBtnPresensiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnPresensiMouseClicked
        //        showDataPresensi();
    }//GEN-LAST:event_panelBtnPresensiMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        //        // TODO add your handling code here:
        //        new PresensiForm().setVisible(true);
        //        this.setVisible(false);
        panelBtnPresensi.setBackground(new java.awt.Color(47, 51, 58));
        panelBtnHome.setBackground(new java.awt.Color(41, 43, 47));
        jPanel17.setVisible(true);
        jPanel1.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void panelBtnHomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnHomeMouseReleased
        panelBtnHome.setBackground(new java.awt.Color(47, 51, 58));
        panelBtnPresensi.setBackground(new java.awt.Color(41, 43, 47));
        jPanel1.setVisible(true);
        jPanel17.setVisible(false);
        getDataHome();
    }//GEN-LAST:event_panelBtnHomeMouseReleased


    private void panelBtnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnHomeMouseClicked

    }//GEN-LAST:event_panelBtnHomeMouseClicked

    private void panelBtnPresensiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnPresensiMouseReleased
        panelBtnHome.setBackground(new java.awt.Color(41, 43, 47));
        panelBtnPresensi.setBackground(new java.awt.Color(47, 51, 58));
        jPanel1.setVisible(false);
        jPanel17.setVisible(true);
        showDataPresensi();
    }//GEN-LAST:event_panelBtnPresensiMouseReleased


    /**
     * @param args the command line arguments
     */
    boolean status_data = false;
    private void addRowDTM() {
        String[] kolom = {"No", "Nama", "Status"};
        dtm = new DefaultTableModel(null, kolom);
        for (int i = 0; i < datalist.size(); i++) {
            dtm.addRow(datalist.get(i));
        }
        jTable1.setModel(dtm);
    }

    private void getDataHome() {
        datalist.clear();
        DatabaseReference dbRef2 = null;
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
//        System.out.println(dtf.format(localDate));
        try {
            dbRef2 = FirebaseConnection.getRef("RekapHarianBaru").child(dtf.format(localDate));
        } catch (IOException ex) {
            System.out.println(ex);
        }
        System.out.println("DBnya : " + dbRef2);
        for (int i = 0; i < gurulist.size(); i++) {
            final TeacherModel owoguru = gurulist.get(i);
            final String no = String.valueOf(i + 1);
            dbRef2.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dPresensi) {
                    for (DataSnapshot data : dPresensi.getChildren()) {
                        DailyDataModel ddm = data.getValue(DailyDataModel.class);
                        if (ddm.getId().equals(owoguru.getRfid_key())) {
                            datalist.add(new String[]{no, owoguru.getName(), "Hadir"});
                            continue;
                        } else {
//                            datalist.add(new String[]{no, owoguru.getName(), "Tidak Hadir"});
//                            continue;
                        }
                        
                    }
                    addRowDTM();
                }

                @Override
                public void onCancelled(DatabaseError de) {
                    System.out.println("The read failed: " + de.getCode());
                }

            });
            
        }
        
    }

    private void showDataPresensi() {
        DatabaseReference ref = null;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        System.out.println(dtf.format(localDate));
        try {
            ref = FirebaseConnection.getRef("Guru");
        } catch (IOException ex) {
            System.out.println(ex);
        }
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dGuru) {
                DefaultListModel<PresensiModel> defaultListModel = new DefaultListModel<>();
                for (DataSnapshot guruSnapshot : dGuru.getChildren()) {
                    nama_list = new ArrayList<String>();
                    waktu_list = new ArrayList<String>();
                    uid_list = new ArrayList<String>();

                    String uid = guruSnapshot.child("rfid_key").getValue(String.class
                    );
                    String name = guruSnapshot.child("name").getValue(String.class
                    );
                    System.out.println("NAME : " + name);
                    System.out.println("GURU : " + guruSnapshot);
                    DatabaseReference dbRef2 = FirebaseDatabase.getInstance().getReference("RekapHarianBaru").child(dtf.format(localDate)).child(uid);
                    dbRef2.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dPresensi) {
                            PresensiModel presensiModel = dPresensi.getValue(PresensiModel.class
                            );
                            String w_masuk = dPresensi.child("waktu_masuk").getValue().toString();
                            String uid = dPresensi.child("id").getValue(String.class
                            );
                            defaultListModel.addElement(new PresensiModel(w_masuk, "Hadir", uid, name));
                            jList16.setModel(defaultListModel);
                            jList16.setCellRenderer(new presensiTemplate());
                            System.out.println("PRESENSI : " + dPresensi);
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
    }

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
        } catch (ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException | IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new HomeForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<PresensiModel> jList16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelKehadiran;
    private javax.swing.JPanel panelAbsen;
    private javax.swing.JPanel panelBtnHome;
    private javax.swing.JPanel panelBtnPresensi;
    private javax.swing.JPanel panelBtnRekapan;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelSidebar;
    // End of variables declaration//GEN-END:variables
}
