package gradingsystem;

public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panHomepage = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDisplay1 = new javax.swing.JButton();
        btnList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setLocation(new java.awt.Point(245, 60));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setName("Editor"); // NOI18N
        setResizable(false);

        panHomepage.setBackground(new java.awt.Color(0, 153, 255));

        lblTitle.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 42)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(102, 255, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Grading Assistant");

        btnAdd.setBackground(new java.awt.Color(204, 0, 0));
        btnAdd.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnAdd.setText("Add Student Marks");
        btnAdd.setOpaque(true);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDisplay1.setBackground(new java.awt.Color(204, 0, 0));
        btnDisplay1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnDisplay1.setText("Search Student's Marks");
        btnDisplay1.setOpaque(true);
        btnDisplay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplay1ActionPerformed(evt);
            }
        });

        btnList.setBackground(new java.awt.Color(204, 0, 0));
        btnList.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnList.setText("See Student List");
        btnList.setOpaque(true);
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panHomepageLayout = new javax.swing.GroupLayout(panHomepage);
        panHomepage.setLayout(panHomepageLayout);
        panHomepageLayout.setHorizontalGroup(
            panHomepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHomepageLayout.createSequentialGroup()
                .addGap(0, 406, Short.MAX_VALUE)
                .addGroup(panHomepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panHomepageLayout.createSequentialGroup()
                        .addGroup(panHomepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnList, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDisplay1))
                        .addGap(439, 439, 439))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panHomepageLayout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(368, 368, 368))))
        );
        panHomepageLayout.setVerticalGroup(
            panHomepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHomepageLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addComponent(btnDisplay1)
                .addGap(65, 65, 65)
                .addComponent(btnAdd)
                .addGap(63, 63, 63)
                .addComponent(btnList)
                .addGap(192, 192, 192))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panHomepage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panHomepage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        StudentInfo studentinfo = new StudentInfo();
        studentinfo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDisplay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplay1ActionPerformed
        // TODO add your handling code here:
        StudentDisplay studentdisplay = new StudentDisplay();
        studentdisplay.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDisplay1ActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        StudentList studentlist = new StudentList();
        studentlist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDisplay1;
    private javax.swing.JButton btnList;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panHomepage;
    // End of variables declaration//GEN-END:variables
}
