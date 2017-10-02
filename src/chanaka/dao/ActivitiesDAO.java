package chanaka.dao;

import common.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class ActivitiesDAO extends DAO {

    Connection myConn;

    public ActivitiesDAO(Connection myConn) {
        this.myConn = myConn;
    }

    public void CreateARow(String admissionNumber) throws SQLException {
        PreparedStatement myStmt = null;
        try {
            myStmt = myConn.prepareStatement("INSERT INTO activities (AdmissionNumber) values(?)");
            myStmt.setString(1, admissionNumber);
            myStmt.executeUpdate();
        } finally {
            close(myStmt);
        }
    }

    public boolean isExists(String admissionNumber) throws SQLException {
        PreparedStatement myStmt = null;
        ResultSet myRs = null;
        String query;
        try {
            query = "SELECT COUNT(*) FROM activities WHERE AdmissionNumber = ?";
            myStmt = myConn.prepareStatement(query);
            myStmt.setString(1, admissionNumber);
            myRs = myStmt.executeQuery();
            myRs.next();
            int existence = myRs.getInt(1);

            //I'm not sure this code;
            return existence > 0;

        } finally {
            close(myStmt, myRs);
        }
    }

    public void updateAdmissionNumber(String newAdmissionNumber, String previouseAdmissionNumber) throws SQLException {
        PreparedStatement myStmt = null;
        try {
            myStmt = myConn.prepareStatement("update activities set AdmissionNumber=? where AdmissionNumber=?");
            myStmt.setString(1, newAdmissionNumber);
            myStmt.setString(2, previouseAdmissionNumber);
            myStmt.executeUpdate();
        } finally {
            close(myStmt);
        }
    }

    public void updateSportsRecord(String admissionNumber, String record) throws SQLException {

        if (!isExists(admissionNumber)) {
            CreateARow(admissionNumber);
        }
        PreparedStatement myStmt = null;
        try {
            myStmt = myConn.prepareStatement("update activities set Sports=? where AdmissionNumber=?");
            myStmt.setString(1, record);
            myStmt.setString(2, admissionNumber);
            myStmt.executeUpdate();
        } finally {
            close(myStmt);
        }

    }

    public void updateClubRecord(String admissionNumber, String record) throws SQLException {
        if (!isExists(admissionNumber)) {
            CreateARow(admissionNumber);
        }
        PreparedStatement myStmt = null;
        try {
            myStmt = myConn.prepareStatement("update activities set Club=? where AdmissionNumber=?");
            myStmt.setString(1, record);
            myStmt.setString(2, admissionNumber);
            myStmt.executeUpdate();
        } finally {
            close(myStmt);
        }

    }

    public void updateDisciplineRecord(String admissionNumber, String record) throws SQLException {
        if (!isExists(admissionNumber)) {
            CreateARow(admissionNumber);
        }
        PreparedStatement myStmt = null;
        try {
            myStmt = myConn.prepareStatement("update activities set Discipline=? where AdmissionNumber=?");
            myStmt.setString(1, record);
            myStmt.setString(2, admissionNumber);
            myStmt.executeUpdate();
        } finally {
            close(myStmt);
        }

    }

    public ResultSet getRowByAdmissionNumber(String admissionNumber) throws SQLException {

        PreparedStatement myStmt;
        ResultSet myRs;
        String query;

        query = "select * from activities where AdmissionNumber  =  ?";
        myStmt = myConn.prepareStatement(query);
        myStmt.setString(1, admissionNumber);
        // execute statement
        myRs = myStmt.executeQuery();
        return myRs;

    }

    public String getSportsRecord(String admissionNumber) throws SQLException {
        if (isExists(admissionNumber)) {
            ResultSet myRs = null;
            try {
                myRs = getRowByAdmissionNumber(admissionNumber);
                myRs.next();
                return myRs.getString(2);
            } finally {
                close(myRs);
            }
        } else {
            //JOptionPane.showMessageDialog(null, "incorrect admission number", null, WARNING_MESSAGE);
            return null;

        }
    }

    public String getClubRecord(String admissionNumber) throws SQLException {
        if (isExists(admissionNumber)) {
            ResultSet myRs = null;
            try {
                myRs = getRowByAdmissionNumber(admissionNumber);
                myRs.next();
                return myRs.getString(3);
            } finally {
                close(myRs);
            }
        } else {
            //JOptionPane.showMessageDialog(null, "incorrect admission number", null, WARNING_MESSAGE);
            return null;
        }

    }

    public String getDisciplineRecord(String admissionNumber) throws SQLException {
        if (isExists(admissionNumber)) {
            ResultSet myRs = null;
            try {
                myRs = getRowByAdmissionNumber(admissionNumber);
                myRs.next();
                return myRs.getString(4);
            } finally {
                close(myRs);
            }
        } else {
            //JOptionPane.showMessageDialog(null, "incorrect admission number", null, WARNING_MESSAGE);
            return null;
        }

    }
}
