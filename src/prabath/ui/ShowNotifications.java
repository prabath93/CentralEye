/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prabath.ui;

import chanaka.dao.StudentDAO;
import chanaka.gui.AddOrEditStudent;
import common.DbConnector;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import prabath.dao.NotificationDAO;
import prabath.dao.TeacherDAO;
import prabath.data.Notification;

/**
 *
 * @author prabath s
 */
public class ShowNotifications extends javax.swing.JDialog {

    /**
     * Creates new form ShowNotifications
     */
    TeacherDAO teacherDao;
    DbConnector dbConnector;
    NotificationDAO notificationDAO;
    StudentDAO studentDAO;
    public ShowNotifications(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        try {
            //this.setSize(400, 310);
            dbConnector=new DbConnector();
        } catch (IOException ex) {
            Logger.getLogger(ShowNotification.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ShowNotification.class.getName()).log(Level.SEVERE, null, ex);
        }
        teacherDao=new TeacherDAO(dbConnector.getMyConn());
        notificationDAO=new NotificationDAO(dbConnector.getMyConn());
        studentDAO=new StudentDAO(dbConnector.getMyConn());
        jScrollPane1.setSize(this.getSize());
        Dimension d=new Dimension(jScrollPane1.getWidth(), 3000);
        jPanel1.setPreferredSize(d);
       //for(int i=0;i<10;i++){
        // JButton j=new JButton();
        // jPanel1.add(j);
        // j.setSize(300,40);
        // j.setLocation(1, 50*i);
        // j.setText("");
        //this.add(j);
        try {
            // }
            createButtons(notificationDAO.notificationCount(),notificationDAO.getAllTeacher());
        } catch (Exception ex) {
            Logger.getLogger(ShowNotification.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<JButton> buttons = new ArrayList<JButton>();
        
        JButton myButton = new JButton();
        myButton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(myButton.getName());
                    }
                });

    }

    public void createButtons(int x,List<Notification> notification) {
        
        for (int i = 0; i < x; i++) {
            Notification n=notification.get(i);
            JButton j = new JButton();
            jPanel1.add(j);
            j.setSize(450, 60);
            if(i==0){
                j.setLocation(1, 50);
            }
            else{
            j.setLocation(1, 70 * i+50);
            }
            //j.setText("<html>prabath sandaruwan is requesting to change the details of prabath sandaruwan");
            j.setText("<html>"+n.getNameWhoChange()+" is requesting to change the details of "+n.getNameWhoGoingtoBeChanged());
            j.setName(String.valueOf(i));
            j.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(n.getTypeOfPersonGoingToBeChanged().equals("Teacher")){
                            AddTeacher addTeacher=new AddTeacher(null,rootPaneCheckingEnabled,teacherDao,true,n.getTeacher(),null);
                            addTeacher.cancelBtnSetName("Declined");
                            addTeacher.addBtnSetName("Accept");
                            
                            addTeacher.setNotificationMode();
                            addTeacher.setNotificationDAO(notificationDAO);
                            addTeacher.setVisible(true);
                        }
                        if(n.getTypeOfPersonGoingToBeChanged().equals("Student")){
                            try {
                                AddOrEditStudent addOrEditStudent=new AddOrEditStudent(null, rootPaneCheckingEnabled, studentDAO, n.getStudent());
                                addOrEditStudent.setNotificationMode();
                                addOrEditStudent.setAddButtonName("Accept");
                                addOrEditStudent.setCancelButtonName("Ignore");
                                addOrEditStudent.setNIC(n.getTypeOfPersonTryToChange());
                                addOrEditStudent.setVisible(true);
                            } catch (IOException | SQLException ex) {
                                Logger.getLogger(ShowNotifications.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                        }
                    }
                });
            

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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jButton1.setText("Clear All Notifications");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(789, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            notificationDAO.deleteAllFromTable();
            this.setVisible(false);
            new ShowNotifications(null, rootPaneCheckingEnabled).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ShowNotifications.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ShowNotifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowNotifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowNotifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowNotifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ShowNotifications dialog = new ShowNotifications(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
