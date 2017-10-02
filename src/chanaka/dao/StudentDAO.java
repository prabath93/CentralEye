package chanaka.dao;

//This is the controller class for add a student
import chanaka.data.Student;
import common.DAO;

import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import malith.login.core.PasswordUtils;

public class StudentDAO extends DAO {

    Connection myConn;
    boolean success;

    public StudentDAO(Connection myConn) {
        this.myConn = myConn;
        success = false;

    }

    public Connection getMyConn() {
        return myConn;
    }

    /**
     * get all student to a List
     *
     * @return
     * @throws java.lang.Exception
     */
    /**
     * get all student to a List
     *
     * @return
     * @throws java.sql.SQLException
     */
    public int getStudentCount() throws SQLException {//WORKING NOW
        int count;
        Statement myStmt;
        ResultSet myRs;

        myStmt = myConn.createStatement();
        myRs = myStmt.executeQuery("SELECT COUNT(*) FROM student");
        myRs.next();
        count = myRs.getInt(1);

        close(myStmt, myRs);

        return count;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<Student> getAllStudent() throws Exception {//WORKING NOW

        List<Student> list = new ArrayList<Student>();
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery("select * from student");

            // load each student object to the Student List
            while (myRs.next()) {
                /*queryFamily = "select * from family where FamilyKey like ?";
                 myStmtFamily = myConn.prepareStatement(queryFamily);
                 myStmtFamily.setInt(1, myRs.getInt(15));
                 myRsFamily = myStmtFamily.executeQuery();
                 Student tempStudent = convertRowToStudent(myRs, myRsFamily);    
                 */
                Student tempStudent = getStudentObject(myRs.getString(1));
                list.add(tempStudent);
            }
            return list;
        } finally {
            close(myStmt, myRs);
        }
    }

    private Student convertRowToStudent(ResultSet myRs, ResultSet myRsFamily) throws SQLException {//WORKING NOW

        String admissionNumber = myRs.getString(1);
        String fullNameEnglish = myRs.getString(2);
        String fullNameSinhala = myRs.getString(3);
        Date birthDate = myRs.getDate(4);
        String house = myRs.getString(5);
        String religion = myRs.getString(6);
        String address = myRs.getString(7);
        String telephoneNumber = myRs.getString(8);
        Date dateOfAdmission = myRs.getDate(9);
        String classOfAdmission = myRs.getString(10);
        String gender = myRs.getString(11);
        String nameWithInitials = myRs.getString(12);
        String gramaNiladhariVasama = myRs.getString(13);
        String comeToSchoolBy = myRs.getString(14);
        int familyKey = myRs.getInt(15);
        String password = myRs.getString(16);
        int accessPriviledge = myRs.getInt(17);

        myRsFamily.next();

        String fatherName = myRsFamily.getString(2);
        String fatherJob = myRsFamily.getString(3);
        String fatherWorkPlace = myRsFamily.getString(4);
        String fatherWorkAddress = myRsFamily.getString(5);
        String fatherWorkTelephone = myRsFamily.getString(6);
        String fatherHomeTelephone = myRsFamily.getString(7);
        String fatherMobile = myRsFamily.getString(8);
        String motherName = myRsFamily.getString(9);
        String motherJob = myRsFamily.getString(10);
        String motherWorkPlace = myRsFamily.getString(11);
        String motherWorkAddress = myRsFamily.getString(12);
        String motherWorkTelephone = myRsFamily.getString(13);
        String motherHomeTelephone = myRsFamily.getString(14);
        String motherMobile = myRsFamily.getString(15);

        String broSis1AdmissionNumber = myRsFamily.getString(16);
        String broSis2AdmissionNumber = myRsFamily.getString(17);
        String broSis3AdmissionNumber = myRsFamily.getString(18);
        String broSis4AdmissionNumber = myRsFamily.getString(19);
        String broSis5AdmissionNumber = myRsFamily.getString(20);
        String broSis1Name = myRsFamily.getString(21);
        String broSis2Name = myRsFamily.getString(22);
        String broSis3Name = myRsFamily.getString(23);
        String broSis4Name = myRsFamily.getString(24);
        String broSis5Name = myRsFamily.getString(25);

        Student tempStudent = new Student(admissionNumber, fullNameEnglish, fullNameSinhala, birthDate, house, religion, address, telephoneNumber, dateOfAdmission, classOfAdmission, gender, nameWithInitials, gramaNiladhariVasama, comeToSchoolBy, familyKey, fatherName, fatherJob, fatherWorkPlace, fatherWorkAddress, fatherWorkTelephone, fatherHomeTelephone, fatherMobile, motherName, motherJob, motherWorkPlace, motherWorkAddress, motherWorkTelephone, motherHomeTelephone, motherMobile, broSis1AdmissionNumber, broSis2AdmissionNumber, broSis3AdmissionNumber, broSis4AdmissionNumber, broSis5AdmissionNumber, broSis1Name, broSis2Name, broSis3Name, broSis4Name, broSis5Name, password, accessPriviledge);

        return tempStudent;
    }

    public void addStudent(Student student) throws SQLException {
        PreparedStatement myStmt = null;
        PreparedStatement myStmtFamily = null;
        try {
            myStmtFamily = myConn.prepareStatement("INSERT INTO family (FatherName, FatherJob, FatherWorkPlace, FatherWorkAddress, FatherWorkTelephone, FatherHomeTelephone, FatherMobile, MotherName, MotherJob, MotherWorkPlace, MotherWorkAddress, MotherWorkTelephone, MotherHomeTelephone, MotherMobile,BroSis1AdmissionNumber ,BroSis2AdmissionNumber ,BroSis3AdmissionNumber ,BroSis4AdmissionNumber ,BroSis5AdmissionNumber ,BroSis1Name ,BroSis2Name ,BroSis3Name ,BroSis4Name ,BroSis5Name) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,? ,? ,? ,? ,? ,? ,? ,? ,? ,?)", Statement.RETURN_GENERATED_KEYS);

            myStmtFamily.setString(1, student.getFatherName());
            myStmtFamily.setString(2, student.getFatherJob());
            myStmtFamily.setString(3, student.getFatherWorkPlace());
            myStmtFamily.setString(4, student.getFatherWorkAddress());
            myStmtFamily.setString(5, student.getFatherWorkTelephone());
            myStmtFamily.setString(6, student.getFatherHomeTelephone());
            myStmtFamily.setString(7, student.getFatherMobile());
            myStmtFamily.setString(8, student.getMotherName());
            myStmtFamily.setString(9, student.getMotherJob());
            myStmtFamily.setString(10, student.getMotherWorkPlace());
            myStmtFamily.setString(11, student.getMotherWorkAddress());
            myStmtFamily.setString(12, student.getMotherWorkTelephone());
            myStmtFamily.setString(13, student.getMotherHomeTelephone());
            myStmtFamily.setString(14, student.getMotherMobile());

            myStmtFamily.setString(15, student.getBroSis1AdmissionNumber());
            myStmtFamily.setString(16, student.getBroSis2AdmissionNumber());
            myStmtFamily.setString(17, student.getBroSis3AdmissionNumber());
            myStmtFamily.setString(18, student.getBroSis4AdmissionNumber());
            myStmtFamily.setString(19, student.getBroSis5AdmissionNumber());
            myStmtFamily.setString(20, student.getBroSis1Name());
            myStmtFamily.setString(21, student.getBroSis2Name());
            myStmtFamily.setString(22, student.getBroSis3Name());
            myStmtFamily.setString(23, student.getBroSis4Name());
            myStmtFamily.setString(24, student.getBroSis5Name());

            myStmtFamily.executeUpdate();
            ResultSet rs = myStmtFamily.getGeneratedKeys();
            rs.next();
            int familyKey = rs.getInt(1);
            close(rs);

            myStmt = myConn.prepareStatement("INSERT INTO student (AdmissionNumber,FullNameEnglish, FullNameSinhala, BirthDate, House, Religion, Address, TelephoneNumber, DateOfAdmission, ClassOfAdmission, Gender, NameWithInitials, GramaNiladhariVasama, ComeToSchoolBy, FamilyKey, Password, Accespriviledge) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            myStmt.setString(1, student.getAdmissionNumber());
            myStmt.setString(2, student.getFullNameEnglish());
            myStmt.setString(3, student.getFullNameSinhala());
            myStmt.setDate(4, student.getBirthDate());
            myStmt.setString(5, student.getHouse());
            myStmt.setString(6, student.getReligion());
            myStmt.setString(7, student.getAddress());
            myStmt.setString(8, student.getTelephoneNumber());
            myStmt.setDate(9, student.getDateOfAdmission());
            myStmt.setString(10, student.getClassOfAdmission());
            myStmt.setString(11, student.getGender());
            myStmt.setString(12, student.getNameWithInitials());
            myStmt.setString(13, student.getGramaNiladhariVasama());
            myStmt.setString(14, student.getComeToSchoolBy());
            myStmt.setInt(15, familyKey);
            myStmt.setString(16, student.getPassword());
            myStmt.setInt(17, 5);
            myStmt.executeUpdate();

        } finally {
            close(myStmt);
            close(myStmtFamily);

        }

    }

    public void changePassword(String NIC, String oldPassword1, String oldPassword, String newPassword, String confirmPassword) throws SQLException {

        PreparedStatement myStmt = null;
        System.out.println("password:" + PasswordUtils.encryptPassword(oldPassword1));
        if (PasswordUtils.checkPassword(oldPassword, PasswordUtils.encryptPassword(oldPassword1))) {
            if (newPassword.equals(confirmPassword)) {
                PreparedStatement myStmt1 = null;
                try {
                    //prepare the statement
                    myStmt = myConn.prepareStatement("update student set Password=?  where AdmissionNumber=? ");

            // set params
                    //myStmt.setString(1, teacher.getNIC());
                    myStmt.setString(1, PasswordUtils.encryptPassword(newPassword));
                    myStmt.setString(2, NIC);

                    //execute statement
                    myStmt.executeUpdate();
                    this.success = true;
                } finally {
                    close(myStmt);
                }
            } else {
                JOptionPane.showMessageDialog(null, "New password and Confirm password does not match");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Old password is wrong");
        }

    }

    public void updateStudent(Student selectedStudent, String previousAdmissionNumber) throws SQLException {

        PreparedStatement myStmt = null;
        PreparedStatement myStmtFamily = null;
        try {
            myStmt = myConn.prepareStatement("update student set AdmissionNumber=?, FullNameEnglish=?, FullNameSinhala=?, BirthDate=?, House=?, Religion=?, Address=?, TelephoneNumber=?, DateOfAdmission=?, ClassOfAdmission=?, Gender=?, NameWithInitials=?, GramaNiladhariVasama=?, ComeToSchoolBy=? where AdmissionNumber=?");

            myStmt.setString(1, selectedStudent.getAdmissionNumber());
            myStmt.setString(2, selectedStudent.getFullNameEnglish());
            myStmt.setString(3, selectedStudent.getFullNameSinhala());
            myStmt.setDate(4, selectedStudent.getBirthDate());
            myStmt.setString(5, selectedStudent.getHouse());
            myStmt.setString(6, selectedStudent.getReligion());
            myStmt.setString(7, selectedStudent.getAddress());
            myStmt.setString(8, selectedStudent.getTelephoneNumber());
            myStmt.setDate(9, selectedStudent.getDateOfAdmission());
            myStmt.setString(10, selectedStudent.getClassOfAdmission());
            myStmt.setString(11, selectedStudent.getGender());
            myStmt.setString(12, selectedStudent.getNameWithInitials());
            myStmt.setString(13, selectedStudent.getGramaNiladhariVasama());
            myStmt.setString(14, selectedStudent.getComeToSchoolBy());
            myStmt.setString(15, previousAdmissionNumber);
            myStmt.executeUpdate();

            myStmtFamily = myConn.prepareStatement("update family set FatherName=?, FatherJob=?, FatherWorkPlace=?, FatherWorkAddress=?, FatherWorkTelephone=?, FatherHomeTelephone=?, FatherMobile=?, MotherName=?, MotherJob=?, MotherWorkPlace=?, MotherWorkAddress=?, MotherWorkTelephone=?, MotherHomeTelephone=?, MotherMobile=? , BroSis1AdmissionNumber=? , BroSis2AdmissionNumber=? , BroSis3AdmissionNumber=? , BroSis4AdmissionNumber=? , BroSis5AdmissionNumber=? , BroSis1Name=? , BroSis2Name=? , BroSis3Name=? , BroSis4Name=? , BroSis5Name=? where FamilyKey=?");

            myStmtFamily.setString(1, selectedStudent.getFatherName());
            myStmtFamily.setString(2, selectedStudent.getFatherJob());
            myStmtFamily.setString(3, selectedStudent.getFatherWorkPlace());
            myStmtFamily.setString(4, selectedStudent.getFatherWorkAddress());
            myStmtFamily.setString(5, selectedStudent.getFatherWorkTelephone());
            myStmtFamily.setString(6, selectedStudent.getFatherHomeTelephone());
            myStmtFamily.setString(7, selectedStudent.getFatherMobile());
            myStmtFamily.setString(8, selectedStudent.getMotherName());
            myStmtFamily.setString(9, selectedStudent.getMotherJob());
            myStmtFamily.setString(10, selectedStudent.getMotherWorkPlace());
            myStmtFamily.setString(11, selectedStudent.getMotherWorkAddress());
            myStmtFamily.setString(12, selectedStudent.getMotherWorkTelephone());
            myStmtFamily.setString(13, selectedStudent.getMotherHomeTelephone());
            myStmtFamily.setString(14, selectedStudent.getMotherMobile());

            myStmtFamily.setString(15, selectedStudent.getBroSis1AdmissionNumber());
            myStmtFamily.setString(16, selectedStudent.getBroSis2AdmissionNumber());
            myStmtFamily.setString(17, selectedStudent.getBroSis3AdmissionNumber());
            myStmtFamily.setString(18, selectedStudent.getBroSis4AdmissionNumber());
            myStmtFamily.setString(19, selectedStudent.getBroSis5AdmissionNumber());
            myStmtFamily.setString(20, selectedStudent.getBroSis1Name());
            myStmtFamily.setString(21, selectedStudent.getBroSis2Name());
            myStmtFamily.setString(22, selectedStudent.getBroSis3Name());
            myStmtFamily.setString(23, selectedStudent.getBroSis4Name());
            myStmtFamily.setString(24, selectedStudent.getBroSis5Name());

            myStmtFamily.setInt(25, selectedStudent.getFamilyKey());

            myStmtFamily.executeUpdate();
        } catch (Exception e) {
            System.out.println("Some error occured in UpdateStudent() method---");
        } finally {
            close(myStmt);
            close(myStmtFamily);
        }
    }

    //method added my Malith
    public Student getStudentObject(String admissionNumber) throws SQLException {

        PreparedStatement myStmt = null;
        ResultSet myRs1 = null;
        String query;

        PreparedStatement myStmtFamily = null;
        ResultSet myRsFamily = null;
        String queryFamily;

        try {

            query = "select * from student where AdmissionNumber  = ?";
            myStmt = myConn.prepareStatement(query);
            myStmt.setString(1, admissionNumber);

            // execute statement
            myRs1 = myStmt.executeQuery();

            if (myRs1.next()) {
                queryFamily = "select * from family where FamilyKey = ?";
                myStmtFamily = myConn.prepareStatement(queryFamily);
                myStmtFamily.setInt(1, myRs1.getInt(15));
                myRsFamily = myStmtFamily.executeQuery();
                Student studentIn = convertRowToStudent(myRs1, myRsFamily);
                return studentIn;
            } else {
                return null;
            }
        } finally {
            close(myStmt, myRs1);
            close(myStmtFamily, myRsFamily);
        }
    }

    public List<Student> searchStudent(String keyWord, String searchPara) throws SQLException {

        PreparedStatement myStmt = null;
        ResultSet myRs = null;
        List<Student> list = new ArrayList<Student>();
        String query;

        try {
            if (!("Birth date".equals(searchPara) | "FamilyKey".equals(searchPara))) {
                keyWord = "%" + keyWord + "%";
            }

            if ("Birth date".equals(searchPara)) {
                query = "select * from student where BirthDate like ?";

                myStmt = myConn.prepareStatement(query);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date date;
                try {
                    date = new java.sql.Date(sdf.parse(keyWord).getTime());
                    myStmt.setDate(1, date);
                } catch (ParseException ex) {
                    System.out.println("see date formatting Chanaka");
                    Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if ("Name".equals(searchPara)) {
                query = "select * from student where FullNameEnglish like ? or FullNameSinhala like ? or NameWithInitials like ?";

                myStmt = myConn.prepareStatement(query);
                for (int i = 1; i < 4; i++) {
                    myStmt.setString(i, keyWord);
                }

            } else if ("Admission number".equals(searchPara)) {
                query = "select * from student where AdmissionNumber like ?";

                myStmt = myConn.prepareStatement(query);
                myStmt.setString(1, keyWord);

            } else if ("Telephone".equals(searchPara)) {
                query = "select * from student where TelephoneNumber like ?";

                myStmt = myConn.prepareStatement(query);

                myStmt.setString(1, keyWord);
            } else if ("Address".equals(searchPara)) {
                query = "select * from student where Address like ?";

                myStmt = myConn.prepareStatement(query);

                myStmt.setString(1, keyWord);
            } //this is used only for deleteStudent() function
            else if ("FamilyKey".equals(searchPara)) {
                query = "select * from student where FamilyKey = ?";
                myStmt = myConn.prepareStatement(query);
                int familyKey = Integer.parseInt(keyWord);
                myStmt.setInt(1, familyKey);
            } //
            else if ("All".equals(searchPara)) {
                query = "select * from student where AdmissionNumber like ? or FullNameEnglish like ? or FullNameSinhala like ? or BirthDate like ? or House like ? or Religion like ? or Address like ? or TelephoneNumber like ? or DateOfAdmission like ? or ClassOfAdmission like ? or Gender like ? or NameWithInitials like ?";
                myStmt = myConn.prepareStatement(query);
                for (int i = 1; i < 13; i++) {
                    myStmt.setString(i, keyWord);
                }
            }

            myRs = myStmt.executeQuery();

            while (myRs.next()) {
                /*queryFamily = "select * from family where FamilyKey = ?";
                 myStmtFamily = myConn.prepareStatement(queryFamily);
                 myStmtFamily.setInt(1, myRs.getInt(15));
                 myRsFamily = myStmtFamily.executeQuery();
                 Student tempStudent = convertRowToStudent(myRs, myRsFamily);
                 System.out.println(myRs.getString(1));
                 */
                Student tempStudent = getStudentObject(myRs.getString(1));
                list.add(tempStudent);
            }

            return list;

        } finally {
            close(myStmt, myRs);
        }
    }

    /**
     * delete student
     *
     * @param admissionNumber
     * @throws SQLException
     */
    public void deleteStudent(String admissionNumber) throws SQLException {
        PreparedStatement myStmt = null;
        PreparedStatement myStmtFamily = null;
        try {

            //delete the family
            int familyKeyint = getStudentObject(admissionNumber).getFamilyKey();

            String familyKeyString = Integer.toString(familyKeyint);
            System.out.println(familyKeyString);
            List<Student> list = searchStudent(familyKeyString, "FamilyKey");

            if (list.size() <= 1) {
                myStmtFamily = myConn.prepareStatement("delete from family where FamilyKey = ?");
                myStmtFamily.setInt(1, familyKeyint);
                myStmtFamily.executeUpdate();
            }
            // prepare statement
            myStmt = myConn.prepareStatement("delete from student where AdmissionNumber =?");

            //set param
            myStmt.setString(1, admissionNumber);

            //execute statement
            myStmt.executeUpdate();
        } finally {
            close(myStmt);
            myStmtFamily.close();
        }
    }

}
