/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chanaka.dao;

import common.DAO;
import common.DbConnector;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author චානක මධුරංග
 */
public class ReligionsDAO extends DAO {

    Connection myConn;

    public ReligionsDAO() throws IOException, SQLException {
        this.myConn = new DbConnector().getMyConn();
    }

    public List<String> getReligions() throws SQLException {
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery("select * from religions");
            List<String> religionsList = new ArrayList<String>();
            while (myRs.next()) {
                religionsList.add(myRs.getString(1));
            }
            return religionsList;
        } finally {
            close(myStmt, myRs);
        }
    }

    public void saveReligions(List<String> religionsList) throws SQLException {
        PreparedStatement myStmt = null;
        Statement truncate = null;
        try {
            truncate = myConn.createStatement();
            truncate.executeUpdate("TRUNCATE religions");
            myStmt = myConn.prepareStatement("INSERT INTO religions (Religions) values (?)");
            for (int i = 0; i < religionsList.size(); i++) {
                myStmt.setString(1, religionsList.get(i));
                myStmt.executeUpdate();
            }
        } finally {
            close(myStmt);
            close(truncate);

        }
    }
}
