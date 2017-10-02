/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chamin.dao;

import chamin.data.Club;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




public class ClubDAO {

    private final Connection myConn;

    public ClubDAO(Connection myConn) {
        this.myConn = myConn;
    }

    public Connection getMyConn() {
        return myConn;
    }

    //   get all club to a List
    public List<Club> getAllClub() throws SQLException {

        List<Club> list = new ArrayList<Club>();
        Statement myStmnt = null;
        ResultSet myRslt = null;

        try {
            myStmnt = myConn.createStatement();
            myRslt = myStmnt.executeQuery("select * from club");

            // load each club object to the club List
            while (myRslt.next()) {
                Club tempClub = convertRawToClub(myRslt);
                list.add(tempClub);
            }
            return list;
        } finally {
            close(myStmnt, myRslt);
        }
    }

    // add a new club
    public void addClub(Club club) throws SQLException {
        PreparedStatement myStmnt = null;
        PreparedStatement myStmnt2 = null;

        try {
            //String query = "INSERT INTO club (ClubId, ClubName, TeacherInchargeId, Advisor, PresidentId, VisePresidentId, SecretaryId, AssSecretaryId, TreasurerId, Task, Suggestions, DateOfEstablish, MemberIdList) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            String query = "INSERT INTO club (ClubId, ClubName, Advisor, PresidentId, VisePresidentId, SecretaryId, AssSecretaryId, TreasurerId, Task, Suggestions, DateOfEstablish, MemberIdList) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            
            
            myStmnt = myConn.prepareStatement(query);
            
            System.out.println("create my stmnt");
            //set parameters

            myStmnt.setString(1, club.getClubId());
            myStmnt.setString(2, club.getClubName());
            //myStmnt.setString(3, club.getTeacherInchargeId());
            myStmnt.setString(3, club.getAdvisor());
            myStmnt.setString(4, club.getPresidentId());
            myStmnt.setString(5, club.getVisePresidentId());
            myStmnt.setString(6, club.getSecretaryId());
            myStmnt.setString(7, club.getAssSecretaryId());
            myStmnt.setString(8, club.getTreasurerId());
            myStmnt.setString(9, club.getTask());
            myStmnt.setString(10, club.getSuggestions());
            myStmnt.setDate(11, club.getDateOfEstablish());
            
            myStmnt.setString(12, club.getMemberIdList()[0]);
           
            myStmnt.executeUpdate();
            
            String query2 = "INSERT INTO incharge (Incharge,ClubId) values (?,?)";
            myStmnt2 = myConn.prepareStatement(query2);
            myStmnt2.setString(1, club.getTeacherInchargeId()[0]);
            myStmnt2.setString(2, club.getClubId());
            
            myStmnt2.executeUpdate();
            
            
            
            
            
            System.out.println("Successfully added");

        } finally {
            close(myStmnt);
            close(myStmnt2);

        }

    }

    /**
     * update person
     *
     */
    public void updateClub(Club club, String selectedClub) throws SQLException {
        PreparedStatement myStmnt = null;
        PreparedStatement myStmnt2 = null;
        try {
            List<Club> list =searchSpecificClub(selectedClub, "Club Name");
            //prepare the statement
            //String query = "UPDATE club set ClubId=?, ClubName=?, TeacherInchargeId=?, Advisor=?, PresidentId=?, VisePresidentId=?, SecretaryId=?, AssSecretaryId=?, TreasurerId=?, Task=?, Suggestions=?, DateOfEstablish=?, MemberIdList=? WHERE values ClubName =?";
            String query = "UPDATE club set ClubId=?, ClubName=?, Advisor=?, PresidentId=?, VisePresidentId=?, SecretaryId=?, AssSecretaryId=?, TreasurerId=?, Task=?, Suggestions=?, DateOfEstablish=?, MemberIdList=? WHERE ClubName =?";
            myStmnt = myConn.prepareStatement(query);

            // set params
            myStmnt.setString(1, club.getClubId());
            myStmnt.setString(2, club.getClubName());
            //myStmnt.setString(3, club.getTeacherInchargeId());
            myStmnt.setString(3, club.getAdvisor());
            myStmnt.setString(4, club.getPresidentId());
            myStmnt.setString(5, club.getVisePresidentId());
            myStmnt.setString(6, club.getSecretaryId());
            myStmnt.setString(7, club.getAssSecretaryId());
            myStmnt.setString(8, club.getTreasurerId());
            myStmnt.setString(9, club.getTask());
            myStmnt.setString(10, club.getSuggestions());
            myStmnt.setDate(11, club.getDateOfEstablish());
            myStmnt.setString(12, club.getMemberIdList()[0]);
            myStmnt.setString(13, selectedClub);

            //execute statement
            myStmnt.executeUpdate();
            
            
            String query2 = "Update incharge set Incharge=?,ClubId=? WHERE ClubId =?";
            myStmnt2 = myConn.prepareStatement(query2);
            myStmnt2.setString(1, club.getTeacherInchargeId()[0]);
            myStmnt2.setString(2, club.getClubId());
            myStmnt2.setString(3, list.get(0).getClubId());
            
            
            myStmnt2.executeUpdate();
            System.out.println("Successfully added");
            
        } finally {
            close(myStmnt);
            close(myStmnt2);
        }
    }
  // search clubs by keyword(search nearly equal clubs also)
    public List<Club> searchClub(String keyWord, String searchPara) throws SQLException {
        keyWord = "%" + keyWord + "%"; //for search all
        List<Club> list =searchSpecificClub(keyWord, searchPara);
        return list;
    }
    // search clubs by keyword(give specific club object)
    public List<Club> searchSpecificClub(String keyWord, String searchPara) throws SQLException {

        List<Club> list = new ArrayList<Club>();

        
        PreparedStatement myStmnt = null;
        
        ResultSet myRslt = null;
        
        
        String query = null;
        try {

            switch (searchPara) {
                case "Club Name":
                    System.out.println("Club Namevvvvvv");
                    query = "SELECT * from club where ClubName like ? ";
                    myStmnt = myConn.prepareStatement(query);
                    myStmnt.setString(1, keyWord);
                    break;
                case "Club Id":
                    System.out.println("club ID");
                    query = "SELECT * from club where ClubId like ? ";
                    myStmnt = myConn.prepareStatement(query);
                    myStmnt.setString(1, keyWord);
                    break;
                default:
                    //myStmnt=null;
                    System.out.println("default");

            }
            myRslt = myStmnt.executeQuery();

            while (myRslt.next()) {
                //System.out.println("there is a result************");
                Club tempClub = convertRawToClub(myRslt);
                //System.out.println(Arrays.toString(tempClub));
                
                
                list.add(tempClub);
            }
            return list;
        } finally {
            close(myStmnt, myRslt);
            
        }

    }

    // delete person
    public void deleteClub(String ClubName) throws SQLException {
        PreparedStatement myStmnt = null;
        PreparedStatement myStmnt2 = null;
        
        try {
            // prepare statement
            myStmnt = myConn.prepareStatement("delete from club where ClubName=?");
            myStmnt2 = myConn.prepareStatement("delete from incharge where ClubId=?");
            //set param
            myStmnt.setString(1, ClubName);
            
            Club tempClub =searchClub(ClubName, "Club Name").get(0);
 
            myStmnt2.setString(1, tempClub.getClubId());
            //execute statement
            myStmnt.executeUpdate();
            myStmnt2.executeUpdate();
           
            
            
        } finally {
            close(myStmnt);
            close(myStmnt2);
        }
    }

    private static void close(Connection myConn, Statement myStmt, ResultSet myRs) throws SQLException {

        if (myRs != null) {
            myRs.close();
        }
        if (myStmt != null) {
            myStmt.close();
        }
        if (myConn != null) {
            myConn.close();
        }
    }

    private void close(Statement myStmt, ResultSet myRs) throws SQLException {
        close(null, myStmt, myRs);
    }

    private void close(Statement myStmt) throws SQLException {
        close(null, myStmt, null);
    }

    private Club convertRawToClub(ResultSet myRslt) throws SQLException {

        String ClubId = myRslt.getString(1);
        //System.out.println(ClubId + "   club id");
        String ClubName = myRslt.getString(2);
        //System.out.println(ClubName + "    club name");
        
        //String TeacherInchargeId = myRslt2.getString(3);
        
        String Advisor = myRslt.getString(3);
        String PresidentId = myRslt.getString(4);
        String VisePresidentId = myRslt.getString(5);
        String SecretaryId = myRslt.getString(6);
        String AssSecretaryId = myRslt.getString(7);
        String TreasurerId = myRslt.getString(8);
        String Task = myRslt.getString(9);
        String Suggestions = myRslt.getString(10);
        Date DateOfEstablish = myRslt.getDate(11);
        String MemberIdList[] = {myRslt.getString(12)};
        
        //String[] TeacherInchargeId={""};//************
        String query = "SELECT * from incharge where ClubId like ?";
        PreparedStatement myStmnt2 = myConn.prepareStatement(query);
        myStmnt2.setString(1,ClubId);
                
        ResultSet myRslt2 = myStmnt2.executeQuery();
        myRslt2.next();
                
        String[] TeacherInchargeId ={myRslt2.getString(1)};
        System.out.println(Arrays.toString(TeacherInchargeId));
                
        

        Club tempClub = new Club(ClubId, ClubName,TeacherInchargeId , Advisor, PresidentId, VisePresidentId, SecretaryId, AssSecretaryId, TreasurerId, Task, Suggestions, DateOfEstablish, MemberIdList);
        close(myStmnt2, myRslt2);
        return tempClub;

    }

}
