/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prabath.ui;

import common.DbConnector;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import prabath.dao.NotificationDAO;

/**
 *
 * @author prabath s
 */
public class CheckingNotifications implements Runnable {

    JMenu jMenu;
    DbConnector dbConnector;
    NotificationDAO notificationDAO;
    public CheckingNotifications(JMenu jMenu) {
        this.jMenu=jMenu;
        try {
            dbConnector=new DbConnector();
        } catch (IOException ex) {
            Logger.getLogger(CheckingNotifications.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CheckingNotifications.class.getName()).log(Level.SEVERE, null, ex);
        }
        notificationDAO=new NotificationDAO(dbConnector.getMyConn());
    }
    
    

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet.");
        while(true){
            try {
                jMenu.setText("Notifications("+String.valueOf(notificationDAO.notificationCount())+")");
            } catch (SQLException ex) {
                Logger.getLogger(CheckingNotifications.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CheckingNotifications.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
