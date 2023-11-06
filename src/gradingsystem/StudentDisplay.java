package gradingsystem;

import java.sql.*;
import javax.swing.*;

public class StudentDisplay extends javax.swing.JFrame {

    public StudentDisplay() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblEnternumber = new javax.swing.JLabel();
        txtRollno = new javax.swing.JTextField();
        lblDetails = new javax.swing.JLabel();
        lblSubject = new javax.swing.JLabel();
        lblMarks = new javax.swing.JLabel();
        lblPercent = new javax.swing.JLabel();
        lblmaxmarks = new javax.swing.JLabel();
        lblMaths = new javax.swing.JLabel();
        lblDS = new javax.swing.JLabel();
        lblCG = new javax.swing.JLabel();
        lblJava = new javax.swing.JLabel();
        lblPython = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblmax1 = new javax.swing.JLabel();
        lblmax2 = new javax.swing.JLabel();
        lblmax3 = new javax.swing.JLabel();
        lblmax4 = new javax.swing.JLabel();
        lblmax5 = new javax.swing.JLabel();
        lblcgmarks = new javax.swing.JLabel();
        lbljavamarks = new javax.swing.JLabel();
        lbldsmarks = new javax.swing.JLabel();
        lblpythonmarks = new javax.swing.JLabel();
        lblmathmarks = new javax.swing.JLabel();
        lblmathperc = new javax.swing.JLabel();
        lbldsperc = new javax.swing.JLabel();
        lblcgperc = new javax.swing.JLabel();
        lbljavaperc = new javax.swing.JLabel();
        lblpythonperc = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblTotalMarks = new javax.swing.JLabel();
        lblMaxMarks = new javax.swing.JLabel();
        lblmarksperc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Display Details");
        setLocation(new java.awt.Point(245, 60));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 152, 255));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 42)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Info");

        lblEnternumber.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        lblEnternumber.setForeground(new java.awt.Color(102, 255, 0));
        lblEnternumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnternumber.setText("Enter Roll No. of Student :");

        txtRollno.setBackground(new java.awt.Color(0, 90, 255));
        txtRollno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N

        lblDetails.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        lblDetails.setForeground(new java.awt.Color(102, 255, 0));
        lblDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDetails.setText("Name :");
        lblDetails.setToolTipText("");

        lblSubject.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        lblSubject.setForeground(new java.awt.Color(102, 255, 0));
        lblSubject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubject.setText("Subject");

        lblMarks.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        lblMarks.setForeground(new java.awt.Color(102, 255, 0));
        lblMarks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMarks.setText("Marks");

        lblPercent.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        lblPercent.setForeground(new java.awt.Color(102, 255, 0));
        lblPercent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPercent.setText("Marks%");

        lblmaxmarks.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        lblmaxmarks.setForeground(new java.awt.Color(102, 255, 0));
        lblmaxmarks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmaxmarks.setText("Max Marks");

        lblMaths.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblMaths.setForeground(new java.awt.Color(102, 255, 0));
        lblMaths.setText("Mathematics-II :");

        lblDS.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblDS.setForeground(new java.awt.Color(102, 255, 0));
        lblDS.setText("Data Structure :");

        lblCG.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblCG.setForeground(new java.awt.Color(102, 255, 0));
        lblCG.setText("Computer Graphics :");

        lblJava.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblJava.setForeground(new java.awt.Color(102, 255, 0));
        lblJava.setText("Java Programming :");

        lblPython.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblPython.setForeground(new java.awt.Color(102, 255, 0));
        lblPython.setText("Python Programming :");

        btnSearch.setBackground(new java.awt.Color(204, 0, 0));
        btnSearch.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setOpaque(true);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 0, 0));
        btnBack.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.setOpaque(true);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblmax1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblmax1.setForeground(new java.awt.Color(102, 255, 0));
        lblmax1.setText("40");

        lblmax2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblmax2.setForeground(new java.awt.Color(102, 255, 0));
        lblmax2.setText("40");

        lblmax3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblmax3.setForeground(new java.awt.Color(102, 255, 0));
        lblmax3.setText("40");

        lblmax4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblmax4.setForeground(new java.awt.Color(102, 255, 0));
        lblmax4.setText("40");

        lblmax5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblmax5.setForeground(new java.awt.Color(102, 255, 0));
        lblmax5.setText("40");

        lblcgmarks.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblcgmarks.setForeground(new java.awt.Color(102, 255, 0));
        lblcgmarks.setMinimumSize(new java.awt.Dimension(22, 21));
        lblcgmarks.setPreferredSize(new java.awt.Dimension(22, 21));

        lbljavamarks.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lbljavamarks.setForeground(new java.awt.Color(102, 255, 0));
        lbljavamarks.setMinimumSize(new java.awt.Dimension(22, 21));
        lbljavamarks.setPreferredSize(new java.awt.Dimension(22, 21));

        lbldsmarks.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lbldsmarks.setForeground(new java.awt.Color(102, 255, 0));
        lbldsmarks.setMinimumSize(new java.awt.Dimension(22, 21));
        lbldsmarks.setPreferredSize(new java.awt.Dimension(22, 21));

        lblpythonmarks.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblpythonmarks.setForeground(new java.awt.Color(102, 255, 0));
        lblpythonmarks.setMinimumSize(new java.awt.Dimension(22, 21));
        lblpythonmarks.setPreferredSize(new java.awt.Dimension(22, 21));

        lblmathmarks.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblmathmarks.setForeground(new java.awt.Color(102, 255, 0));
        lblmathmarks.setMinimumSize(new java.awt.Dimension(22, 21));
        lblmathmarks.setPreferredSize(new java.awt.Dimension(22, 21));

        lblmathperc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblmathperc.setForeground(new java.awt.Color(102, 255, 0));
        lblmathperc.setMinimumSize(new java.awt.Dimension(22, 21));
        lblmathperc.setPreferredSize(new java.awt.Dimension(22, 21));

        lbldsperc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lbldsperc.setForeground(new java.awt.Color(102, 255, 0));
        lbldsperc.setMinimumSize(new java.awt.Dimension(22, 21));
        lbldsperc.setPreferredSize(new java.awt.Dimension(22, 21));

        lblcgperc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblcgperc.setForeground(new java.awt.Color(102, 255, 0));
        lblcgperc.setMinimumSize(new java.awt.Dimension(22, 21));
        lblcgperc.setPreferredSize(new java.awt.Dimension(22, 21));

        lbljavaperc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lbljavaperc.setForeground(new java.awt.Color(102, 255, 0));
        lbljavaperc.setMinimumSize(new java.awt.Dimension(22, 21));
        lbljavaperc.setPreferredSize(new java.awt.Dimension(22, 21));

        lblpythonperc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblpythonperc.setForeground(new java.awt.Color(102, 255, 0));
        lblpythonperc.setMinimumSize(new java.awt.Dimension(22, 21));
        lblpythonperc.setPreferredSize(new java.awt.Dimension(22, 21));

        lblTotal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(102, 255, 0));
        lblTotal.setText("Total :");

        lblTotalMarks.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblTotalMarks.setForeground(new java.awt.Color(102, 255, 0));
        lblTotalMarks.setMinimumSize(new java.awt.Dimension(22, 21));
        lblTotalMarks.setPreferredSize(new java.awt.Dimension(22, 21));

        lblMaxMarks.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblMaxMarks.setForeground(new java.awt.Color(102, 255, 0));
        lblMaxMarks.setText("200");

        lblmarksperc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblmarksperc.setForeground(new java.awt.Color(102, 255, 0));
        lblmarksperc.setMinimumSize(new java.awt.Dimension(22, 21));
        lblmarksperc.setPreferredSize(new java.awt.Dimension(22, 21));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(lblEnternumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRollno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(lblSubject)
                                .addGap(18, 18, 18)
                                .addComponent(lblMarks))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPython)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCG)
                                            .addComponent(lblDS, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblMaths, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblJava, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(lblTotal))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblcgmarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbljavamarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbldsmarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblpythonmarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblmathmarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(lblTotalMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblmaxmarks)
                                .addGap(18, 18, 18)
                                .addComponent(lblPercent))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblmax1)
                                    .addComponent(lblmax2)
                                    .addComponent(lblmax3)
                                    .addComponent(lblmax4)
                                    .addComponent(lblmax5)
                                    .addComponent(lblMaxMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(118, 118, 118)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblmarksperc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(183, 183, 183))
                                    .addComponent(lbldsperc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblmathperc, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                            .addComponent(lblcgperc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbljavaperc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblpythonperc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(197, 197, 197))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lblDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnternumber)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRollno)
                            .addComponent(btnSearch))
                        .addGap(1, 1, 1)))
                .addGap(35, 35, 35)
                .addComponent(lblDetails)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(lblSubject)
                                                    .addComponent(lblMarks)
                                                    .addComponent(lblmaxmarks)
                                                    .addComponent(lblPercent))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblMaths)
                                                        .addComponent(lblmax1))
                                                    .addComponent(lblmathmarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(lblmathperc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblDS)
                                                .addComponent(lblmax2))
                                            .addComponent(lbldsmarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lbldsperc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblCG)
                                                .addComponent(lblmax3))
                                            .addComponent(lblcgmarks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblcgperc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblJava)
                                                .addComponent(lblmax4))
                                            .addComponent(lbljavaperc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lbljavamarks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPython)
                                        .addComponent(lblmax5))
                                    .addComponent(lblpythonperc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblpythonmarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotal)
                            .addComponent(lblMaxMarks)
                            .addComponent(lblmarksperc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblTotalMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147)
                .addComponent(btnBack)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        String sql, searchnum;
        searchnum = txtRollno.getText();
        int mathp,dsp,cgp,javap,pythonp;
       
        try {
            Connection conn = dbconn.dblink();
            Statement stm = conn.createStatement();
            sql = "select * from studentinfo where rollnum = '"+searchnum+"'";
            ResultSet rst = stm.executeQuery(sql);
            rst.next();
            
            lblDetails.setText("Name: "+ rst.getString("Name") +"  Roll No: "+ rst.getString("Rollnum") 
                               +"  Semester: "+ rst.getString("Semester") +"  Department: "+ rst.getString("Department"));
            
            lblmathmarks.setText(rst.getString("maths"));
            lblcgmarks.setText(rst.getString("cg"));
            lbldsmarks.setText(rst.getString("ds"));
            lbljavamarks.setText(rst.getString("java"));
            lblpythonmarks.setText(rst.getString("python"));
            
            mathp = rst.getInt("maths")*100/40;
            dsp = rst.getInt("ds")*100/40;
            cgp = rst.getInt("cg")*100/40;
            javap = rst.getInt("java")*100/40;
            pythonp = rst.getInt("python")*100/40;
            
            lblmathperc.setText(String.valueOf(mathp));
            lbldsperc.setText(String.valueOf(dsp));
            lblcgperc.setText(String.valueOf(cgp));
            lbljavaperc.setText(String.valueOf(javap));
            lblpythonperc.setText(String.valueOf(pythonp));
            
            lblTotalMarks.setText(String.valueOf(rst.getInt("maths")+rst.getInt("ds")+rst.getInt("cg")+rst.getInt("java")+rst.getInt("python")));
            lblmarksperc.setText(String.valueOf((rst.getInt("maths")+rst.getInt("ds")+rst.getInt("cg")+rst.getInt("java")+rst.getInt("python"))*100/200));
            
            
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "INVALID ROLL NUMBER");
        }
        

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        HomePage homepage = new HomePage();
        homepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(StudentDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCG;
    private javax.swing.JLabel lblDS;
    private javax.swing.JLabel lblDetails;
    private javax.swing.JLabel lblEnternumber;
    private javax.swing.JLabel lblJava;
    private javax.swing.JLabel lblMarks;
    private javax.swing.JLabel lblMaths;
    private javax.swing.JLabel lblMaxMarks;
    private javax.swing.JLabel lblPercent;
    private javax.swing.JLabel lblPython;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalMarks;
    private javax.swing.JLabel lblcgmarks;
    private javax.swing.JLabel lblcgperc;
    private javax.swing.JLabel lbldsmarks;
    private javax.swing.JLabel lbldsperc;
    private javax.swing.JLabel lbljavamarks;
    private javax.swing.JLabel lbljavaperc;
    private javax.swing.JLabel lblmarksperc;
    private javax.swing.JLabel lblmathmarks;
    private javax.swing.JLabel lblmathperc;
    private javax.swing.JLabel lblmax1;
    private javax.swing.JLabel lblmax2;
    private javax.swing.JLabel lblmax3;
    private javax.swing.JLabel lblmax4;
    private javax.swing.JLabel lblmax5;
    private javax.swing.JLabel lblmaxmarks;
    private javax.swing.JLabel lblpythonmarks;
    private javax.swing.JLabel lblpythonperc;
    private javax.swing.JTextField txtRollno;
    // End of variables declaration//GEN-END:variables
}
