package gradingsystem;

import java.sql.*;
import javax.swing.JOptionPane;

public class StudentInfo extends javax.swing.JFrame {

    public StudentInfo() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblStudentInfo = new javax.swing.JLabel();
        lblDepartment = new javax.swing.JLabel();
        lblMarksEntry = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblSemester = new javax.swing.JLabel();
        lblDetails2 = new javax.swing.JLabel();
        lblMaths = new javax.swing.JLabel();
        lblDS = new javax.swing.JLabel();
        lblCG = new javax.swing.JLabel();
        lblJava = new javax.swing.JLabel();
        lblPython = new javax.swing.JLabel();
        txtMaths = new javax.swing.JTextField();
        txtCG = new javax.swing.JTextField();
        txtJava = new javax.swing.JTextField();
        txtPython = new javax.swing.JTextField();
        txtDS = new javax.swing.JTextField();
        lblRollno = new javax.swing.JLabel();
        txtRollno = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtDept = new javax.swing.JTextField();
        txtSem = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Info");
        setLocation(new java.awt.Point(245, 60));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));

        lblStudentInfo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 42)); // NOI18N
        lblStudentInfo.setForeground(new java.awt.Color(102, 255, 0));
        lblStudentInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentInfo.setText("Student Info");

        lblDepartment.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblDepartment.setForeground(new java.awt.Color(102, 255, 0));
        lblDepartment.setText("Department :");

        lblMarksEntry.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        lblMarksEntry.setForeground(new java.awt.Color(102, 255, 0));
        lblMarksEntry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMarksEntry.setText("Marks Entry");

        lblName1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblName1.setForeground(new java.awt.Color(102, 255, 0));
        lblName1.setText("Name  of Student:");

        lblSemester.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblSemester.setForeground(new java.awt.Color(102, 255, 0));
        lblSemester.setText("Semester :");

        lblDetails2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        lblDetails2.setForeground(new java.awt.Color(102, 255, 0));
        lblDetails2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDetails2.setText("Details");

        lblMaths.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblMaths.setForeground(new java.awt.Color(102, 255, 0));
        lblMaths.setText("Mathematics-III :");

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

        txtMaths.setBackground(new java.awt.Color(0, 90, 255));
        txtMaths.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtMaths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMathsActionPerformed(evt);
            }
        });

        txtCG.setBackground(new java.awt.Color(0, 90, 255));
        txtCG.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        txtJava.setBackground(new java.awt.Color(0, 90, 255));
        txtJava.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        txtPython.setBackground(new java.awt.Color(0, 90, 255));
        txtPython.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        txtDS.setBackground(new java.awt.Color(0, 90, 255));
        txtDS.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        lblRollno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblRollno.setForeground(new java.awt.Color(102, 255, 0));
        lblRollno.setText("Roll No :");

        txtRollno.setBackground(new java.awt.Color(0, 90, 255));
        txtRollno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        txtName.setBackground(new java.awt.Color(0, 90, 255));
        txtName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtDept.setBackground(new java.awt.Color(0, 90, 255));
        txtDept.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        txtSem.setBackground(new java.awt.Color(0, 90, 255));
        txtSem.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        btnAdd.setBackground(new java.awt.Color(204, 0, 0));
        btnAdd.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnAdd.setText("Add Details");
        btnAdd.setMaximumSize(new java.awt.Dimension(165, 32));
        btnAdd.setMinimumSize(new java.awt.Dimension(165, 32));
        btnAdd.setOpaque(true);
        btnAdd.setPreferredSize(new java.awt.Dimension(165, 32));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblName1)
                            .addComponent(lblDepartment)
                            .addComponent(lblRollno)
                            .addComponent(lblSemester))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRollno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDept, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lblDetails2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(lblMarksEntry)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPython)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCG)
                                    .addComponent(lblDS, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMaths, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblJava, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaths, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCG, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJava, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPython, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(163, 163, 163))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(lblStudentInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblStudentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMarksEntry)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaths)
                            .addComponent(txtMaths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDS)
                            .addComponent(txtDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCG)
                            .addComponent(txtCG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJava)
                            .addComponent(txtJava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDetails2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName1)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRollno)
                            .addComponent(txtRollno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSemester)
                            .addComponent(txtSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDepartment)
                            .addComponent(txtDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPython)
                    .addComponent(txtPython, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(88, 88, 88))
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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        boolean emptyField = txtName.getText().isBlank()||txtRollno.getText().isBlank()||txtSem.getText().isBlank()||txtDept.getText().isBlank()||txtMaths.getText().isBlank()||txtDS.getText().isBlank()||txtCG.getText().isBlank()||txtJava.getText().isBlank()||txtPython.getText().isBlank();
        if(!(emptyField)){
            String name = txtName.getText();
            String rollnum = txtRollno.getText();
            String sem = txtSem.getText();
            String dept = txtDept.getText();
            int math = Integer.parseInt(txtMaths.getText());
            int ds = Integer.parseInt(txtDS.getText());
            int cg = Integer.parseInt(txtCG.getText());
            int java = Integer.parseInt(txtJava.getText());
            int python = Integer.parseInt(txtPython.getText());
            
            txtName.setText("");
            txtRollno.setText("");
            txtSem.setText("");
            txtDept.setText("");
            txtMaths.setText("");
            txtDS.setText("");
            txtCG.setText("");
            txtJava.setText("");
            txtPython.setText("");
            
            try{
                Connection conn = dbconn.dblink();
            
            
                PreparedStatement stm = conn.prepareStatement("insert into studentinfo values(?,?,?,?,?,?,?,?,?);");
                stm.setString(1, name);
                stm.setString(2, rollnum);
                stm.setString(3, sem);
                stm.setString(4, dept);
                stm.setInt(5, math);
                stm.setInt(6, ds);
                stm.setInt(7, cg);
                stm.setInt(8, java);
                stm.setInt(9, python);
                stm.executeUpdate();
                JOptionPane.showMessageDialog(this, "Student Information Added Successfully");
            
                conn.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please Fill All Fields");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        HomePage homepage = new HomePage();
        homepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtMathsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMathsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMathsActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

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
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCG;
    private javax.swing.JLabel lblDS;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblDetails2;
    private javax.swing.JLabel lblJava;
    private javax.swing.JLabel lblMarksEntry;
    private javax.swing.JLabel lblMaths;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPython;
    private javax.swing.JLabel lblRollno;
    private javax.swing.JLabel lblSemester;
    private javax.swing.JLabel lblStudentInfo;
    private javax.swing.JTextField txtCG;
    private javax.swing.JTextField txtDS;
    private javax.swing.JTextField txtDept;
    private javax.swing.JTextField txtJava;
    private javax.swing.JTextField txtMaths;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPython;
    private javax.swing.JTextField txtRollno;
    private javax.swing.JTextField txtSem;
    // End of variables declaration//GEN-END:variables
}
