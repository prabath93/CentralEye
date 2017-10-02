/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import malith.password.passwordHandler;

/**
 *
 * @author Malith
 */
public class DbConnector {
    private Connection myConn = null;

    public DbConnector() throws IOException, SQLException {
        try {
            // get db properties from properties file (inside the project)
            Properties prop = new Properties();
            prop.load(new FileInputStream("user.properties"));
            
            passwordHandler ph = new passwordHandler();
            
            String user = prop.getProperty("user");
            String password = ph.decrypt(prop.getProperty("password"));
            String dburl = prop.getProperty("dburl");
            
            //connect to database
            myConn = DriverManager.getConnection(dburl, user, password);
            System.out.println("DB connection successful to : " + dburl);
        } catch (GeneralSecurityException ex) {
            Logger.getLogger(DbConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getMyConn() {
        return myConn;
    }
    
    
}
