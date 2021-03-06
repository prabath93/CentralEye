package prabath.ui;

import common.DbConnector;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import malith.ui.PrincipalHome;
import prabath.dao.NotificationDAO;
import prabath.dao.TeacherDAO;
import prabath.data.Notification;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author prabath s
 */
public class ShowNotification extends javax.swing.JDialog {

    /**
     * Creates new form test
     */
    TeacherDAO teacherDao;
    DbConnector dbConnector;
    NotificationDAO notificationDAO;
    public ShowNotification(java.awt.Frame parent, boolean modal) {
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
        jScrollPane1.setSize(this.getSize());
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
            j.setLocation(1, 70 * i);
            //j.setText("<html>prabath sandaruwan is requesting to change the details of prabath sandaruwan");
            j.setText("<html>"+n.getNameWhoChange()+" requesting to change the details of "+n.getNameWhoGoingtoBeChanged());
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setPreferredSize(new java.awt.Dimension(446, 900));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 452, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 900, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ShowNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ShowNotification dialog = new ShowNotification(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
