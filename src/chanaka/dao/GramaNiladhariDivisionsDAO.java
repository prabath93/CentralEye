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
public class GramaNiladhariDivisionsDAO extends DAO {

    Connection myConn;

    public GramaNiladhariDivisionsDAO() throws IOException, SQLException {
        this.myConn = new DbConnector().getMyConn();
    }

    public List<String> getGramaNiladhariDivisions() throws SQLException {
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery("select * from gramaniladharidivisions");
            List<String> divitionList = new ArrayList<String>();
            while (myRs.next()) {
                divitionList.add(myRs.getString(1));
            }
            return divitionList;
        } finally {
            close(myStmt, myRs);
        }
    }

    public void saveGramaNiladhariDivisions(List<String> divitionList) throws SQLException {
        PreparedStatement myStmt = null;
        Statement truncate = null;
        try {
            truncate = myConn.createStatement();
            truncate.executeUpdate("TRUNCATE gramaniladharidivisions");
            myStmt = myConn.prepareStatement("INSERT INTO gramaniladharidivisions (GramaNiladhariDivisions) values (?)");
            for (int i = 0; i < divitionList.size(); i++) {
                myStmt.setString(1, divitionList.get(i));
                myStmt.executeUpdate();
            }
        } finally {
            close(myStmt);
            close(truncate);

        }
    }
}
