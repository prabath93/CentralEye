/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chamin.gui;

/**
 *
 * @author Chamin
 */


import chanaka.dao.StudentDAO;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import common.DbConnector;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import malith.login.ui.Login;
import malith.ui.ClubViewer;
import malith.ui.StudentViewer;
import prabath.dao.TeacherDAO;
import prabath.data.Teacher;
import prabath.ui.ChangePassword;
import prabath.ui.CheckingTeacherNotification;
import prabath.ui.ShowNotificationsToTeacher;
import prabath.ui.TeacherProfile;
import prabath.ui.TeacherUi;


public class LibrarianGui extends javax.swing.JFrame {

    StudentDAO studentDao;
    TeacherDAO teacherDao;
    DbConnector dbConnector;
    String NIC;
    Teacher teacher;
    
    
    
    public LibrarianGui() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        try {
            dbConnector=new DbConnector();
            studentDao=new StudentDAO(dbConnector.getMyConn());
            teacherDao=new TeacherDAO(dbConnector.getMyConn());
    
           // Thread checkNotification=new Thread(new CheckingTeacherNotification(jMenu4,teacher));
           // checkNotification.start();
            
        } catch (IOException ex) {
            Logger.getLogger(TeacherUi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TeacherUi.class.getName()).log(Level.SEVERE, null, ex);
        }
       // this.NIC=teacher.getNIC();
      //  this.teacher=teacher;
        //lbluseNamedis.setText("<html>"+teacher.getNameWithin()+"<br>"+NIC+"</html>");
    }
     public LibrarianGui(Teacher teacher) {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        try {
            dbConnector=new DbConnector();
            studentDao=new StudentDAO(dbConnector.getMyConn());
            teacherDao=new TeacherDAO(dbConnector.getMyConn());
    
           // Thread checkNotification=new Thread(new CheckingTeacherNotification(jMenu4,teacher));
           // checkNotification.start();
            
        } catch (IOException ex) {
            Logger.getLogger(TeacherUi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TeacherUi.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.NIC=teacher.getNIC();
        this.teacher=teacher;
        lbluseNamedis.setText("<html>"+teacher.getNameWithin()+"&#160;"+NIC+"</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        studentViewBtn1 = new javax.swing.JButton();
        studentUpdateBtn1 = new javax.swing.JButton();
        clubView = new javax.swing.JButton();
        studentViewBtn = new javax.swing.JButton();
        lbluseNamedis = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 700));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("View profile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Change password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/newcover.png"))); // NOI18N

        studentViewBtn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentViewBtn1.setText("<html>Book<br> Transaction</html>");
        studentViewBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentViewBtn1ActionPerformed(evt);
            }
        });

        studentUpdateBtn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentUpdateBtn1.setText("Add or Update Book");
        studentUpdateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentUpdateBtn1ActionPerformed(evt);
            }
        });

        clubView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clubView.setText("View Clubs");
        clubView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubViewActionPerformed(evt);
            }
        });

        studentViewBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentViewBtn.setText("View Students");
        studentViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentViewBtnActionPerformed(evt);
            }
        });

        lbluseNamedis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbluseNamedis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/ceyelogo(500x500).png"))); // NOI18N

        jButton3.setText("Log out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenuBar1.setMaximumSize(new java.awt.Dimension(210, 500));

        jMenu2.setText("Student");

        jMenuItem6.setText("View");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Update");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Club");

        jMenuItem9.setText("View");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Settings");

        jMenuItem1.setText("View Profile");
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Change Password");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbluseNamedis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentUpdateBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studentViewBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(studentViewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clubView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)))))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbluseNamedis, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(studentViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clubView, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(studentViewBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(studentUpdateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, studentUpdateBtn1, studentViewBtn1});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        StudentViewer studentViewer= new StudentViewer(4);
        studentViewer.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        StudentViewer studentViewer= new StudentViewer(4);
        studentViewer.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        ClubViewer clubViewer= new ClubViewer(PROPERTIES);
        clubViewer.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:

        ChangePassword changePassword=new ChangePassword(null, rootPaneCheckingEnabled, 1,teacher.getPassword(),teacher.getNIC());
        changePassword.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void clubViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubViewActionPerformed
        // TODO add your handling code here:
        ClubViewer clubViewer= new ClubViewer(4);
        clubViewer.setVisible(true);
    }//GEN-LAST:event_clubViewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TeacherProfile teacherProfile=new TeacherProfile(null, rootPaneCheckingEnabled, teacherDao, teacher);
        //teacherProfile.populateGUI(teacher);
        teacherProfile.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ChangePassword changePassword=new ChangePassword(null, rootPaneCheckingEnabled, 1,teacher.getPassword(),teacher.getNIC());
        changePassword.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void studentViewBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentViewBtn1ActionPerformed
        new bookTransaction().setVisible(true);

    }//GEN-LAST:event_studentViewBtn1ActionPerformed

    private void studentUpdateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentUpdateBtn1ActionPerformed
        new BookViewer().setVisible(true);
        
    }//GEN-LAST:event_studentUpdateBtn1ActionPerformed

    private void studentViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentViewBtnActionPerformed
        // TODO add your handling code here:
        StudentViewer studentViewer= new StudentViewer(4);
        studentViewer.setAddButtonDisable();
        studentViewer.setCertificateButtonDisable();
        studentViewer.setUpdateButtonDisable();
        studentViewer.setDeleteButtonDisable();
        studentViewer.setVisible(true);
    }//GEN-LAST:event_studentViewBtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            UIManager.setLookAndFeel(new AluminiumLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clubView;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel lbluseNamedis;
    private javax.swing.JButton studentUpdateBtn1;
    private javax.swing.JButton studentViewBtn;
    private javax.swing.JButton studentViewBtn1;
    // End of variables declaration//GEN-END:variables
}
