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
public class HousesDAO extends DAO {

    Connection myConn;

    public HousesDAO() throws IOException, SQLException {
        this.myConn = new DbConnector().getMyConn();
    }

    public List<String> getHouses() throws SQLException {
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery("select * from houses");
            List<String> housesList = new ArrayList<String>();
            while (myRs.next()) {
                housesList.add(myRs.getString(1));
            }
            return housesList;
        } finally {
            close(myStmt, myRs);
        }
    }

    public void saveHouses(List<String> housesList) throws SQLException {
        PreparedStatement myStmt = null;
        Statement truncate = null;
        try {
            truncate = myConn.createStatement();
            truncate.executeUpdate("TRUNCATE houses");
            myStmt = myConn.prepareStatement("INSERT INTO houses (Houses) values (?)");
            for (int i = 0; i < housesList.size(); i++) {
                myStmt.setString(1, housesList.get(i));
                myStmt.executeUpdate();
            }
        } finally {
            close(myStmt);
            close(truncate);

        }
    }
}
