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
public class ComeToSchoolByDAO extends DAO {

    Connection myConn;

    public ComeToSchoolByDAO() throws IOException, SQLException {
        this.myConn = new DbConnector().getMyConn();
    }

    public List<String> getComeToSchoolBy() throws SQLException {
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery("select * from cometoschoolby");
            List<String> comeToSchoolByList = new ArrayList<String>();
            while (myRs.next()) {
                comeToSchoolByList.add(myRs.getString(1));
            }
            return comeToSchoolByList;
        } finally {
            close(myStmt, myRs);
        }
    }

    public void saveComeToSchoolBy(List<String> comeToSchoolByList) throws SQLException {
        PreparedStatement myStmt = null;
        Statement truncate = null;
        try {
            truncate = myConn.createStatement();
            truncate.executeUpdate("TRUNCATE cometoschoolby");
            myStmt = myConn.prepareStatement("INSERT INTO cometoschoolby (ComeToSchoolBy) values (?)");
            for (int i = 0; i < comeToSchoolByList.size(); i++) {
                myStmt.setString(1, comeToSchoolByList.get(i));
                myStmt.executeUpdate();
            }
        } finally {
            close(myStmt);
            close(truncate);

        }
    }
}
