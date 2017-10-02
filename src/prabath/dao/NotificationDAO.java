/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prabath.dao;

import chanaka.data.Student;
import common.DAO;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import malith.login.core.PasswordUtils;
import prabath.dao.TeacherDAO;
import prabath.data.Notification;
import prabath.data.Teacher;

/**
 *
 * @author prabath s
 */
public class NotificationDAO extends DAO {

    Connection myCon;
    Student student;

    public NotificationDAO(Connection mycon) {
        this.myCon = mycon;
    }

    public int notificationCount() throws SQLException {
        int count = 0;
        Statement myStatment = null;
        try {
            myStatment = myCon.createStatement();
            ResultSet rs = myStatment.executeQuery("SELECT COUNT(*) FROM notification");
            rs.next();
            count = rs.getInt(1);
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(TeacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close(myStatment);
        }
        return count;
    }

    public int teacherNotificationCount(Teacher teacher) throws SQLException {
        int count = 0;
        Statement myStatment = null;
        try {
            String a = "'" + teacher.getNIC() + "'";
            myStatment = myCon.createStatement();
            ResultSet rs = myStatment.executeQuery("SELECT COUNT(" + a + ") FROM teachernotification");
            rs.next();
            count = rs.getInt(1);

            return count;
        } catch (SQLException ex) {
            Logger.getLogger(TeacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close(myStatment);
        }
        return count;
    }

    public List<Notification> getAllTeacher() throws Exception {

        List<Notification> list = new ArrayList<>();
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            myStmt = myCon.createStatement();
            myRs = myStmt.executeQuery("select * from notification");

            // load each teacher object to the Teacher List
            while (myRs.next()) {
                Notification tempNotification = convertRowToNotification(myRs);
                list.add(tempNotification);

            }
            return list;
        } finally {
            close(myStmt, myRs);
        }
    }

    public List<String> getTeacherNotifications(String NIC) throws SQLException {

        List<String> list = new ArrayList<>();
        Statement myStmt = null;
        ResultSet myRs = null;
        String a = "'" + NIC + "'";

        try {
            myStmt = myCon.createStatement();
            myRs = myStmt.executeQuery("select * from teachernotification where NIC=" + a);

            // load each teacher object to the Teacher List
            while (myRs.next()) {

                list.add(myRs.getString(2));
                System.out.println(myRs.getString(1));

            }
            return list;
        } finally {
            close(myStmt, myRs);
        }

    }

    private Notification convertRowToNotification(ResultSet myRs) throws SQLException {

        String typeOfPersonTryToChange = myRs.getString(1);
        String nameWhoChange = myRs.getString(2);
        String typeOfPersonGoingToBeChanged = myRs.getString(3);
        String nameWhoGoingToBeChanged = myRs.getString(4);
        Notification tempNotification = null;
        if (typeOfPersonGoingToBeChanged.equals("Teacher")) {
            String NIC = myRs.getString(5);
            String RNo = myRs.getString(6);
            String NameWithIn = myRs.getString(7);
            String FullName = myRs.getString(8);
            String Gender = myRs.getString(9);
            Date Dob = myRs.getDate(10);
            String CivilStatus = myRs.getString(11);
            String Address = myRs.getString(12);
            String TelNoMobile = myRs.getString(13);
            String TelNoRecident = myRs.getString(14);
            Date DateOfAssignmentAsTeacher = myRs.getDate(15);
            Date DateOfAssignmentToSchool = myRs.getDate(16);
            String EducationQual = myRs.getString(17);
            String ProffessionalQual = myRs.getString(18);
            String SubjectsAndClasses = myRs.getString(19);
            String SubjectsWishToTeach = myRs.getString(20);

            String GradesWishToTeach = myRs.getString(21);
            String NatureOfPresentPost = myRs.getString(22);
            String GradeOfPromotion = myRs.getString(23);
            Date DateOfPromotion = myRs.getDate(24);

            String SectionTaught = myRs.getString(25);
            String ServiceRecord = myRs.getString(26);
            String PositionInSchool = myRs.getString(27);

            Teacher tempTeacher = new Teacher(NIC, RNo, NameWithIn, FullName, Gender, Dob, CivilStatus, Address, TelNoMobile, TelNoRecident, DateOfAssignmentAsTeacher, DateOfAssignmentToSchool, EducationQual, ProffessionalQual, SubjectsAndClasses, SubjectsWishToTeach, GradesWishToTeach, NatureOfPresentPost, GradeOfPromotion, DateOfPromotion, SectionTaught, ServiceRecord, PositionInSchool, 0, null);
            tempNotification = new Notification(typeOfPersonTryToChange, nameWhoChange, typeOfPersonGoingToBeChanged, nameWhoGoingToBeChanged, tempTeacher);
        }
        if (typeOfPersonGoingToBeChanged.equals("Student")) {

            String admissionNumber = myRs.getString(28);
            String fullNameEnglish = myRs.getString(29);
            String fullNameSinhala = myRs.getString(30);
            Date birthDate = myRs.getDate(31);
            String house = myRs.getString(32);
            String religion = myRs.getString(33);
            String address = myRs.getString(12);
            String telephoneNumber = myRs.getString(35);
            Date dateOfAdmission = myRs.getDate(36);
            String classOfAdmission = myRs.getString(37);
            String gender = myRs.getString(9);
            String nameWithInitials = myRs.getString(38);
            String gramaNiladhariVasama = myRs.getString(39);
            String comeToSchoolBy = myRs.getString(40);

            String fatherName = myRs.getString(41);
            String fatherJob = myRs.getString(42);
            String fatherWorkPlace = myRs.getString(43);
            String fatherWorkAddress = myRs.getString(44);
            String fatherWorkTelephone = myRs.getString(45);
            String fatherHomeTelephone = myRs.getString(46);
            String fatherMobile = myRs.getString(47);
            String motherName = myRs.getString(48);
            String motherJob = myRs.getString(49);
            String motherWorkPlace = myRs.getString(50);
            String motherWorkAddress = myRs.getString(51);
            String motherWorkTelephone = myRs.getString(52);
            String motherHomeTelephone = myRs.getString(53);
            String motherMobile = myRs.getString(54);

            String broSis1AdmissionNumber = myRs.getString(55);
            String broSis2AdmissionNumber = myRs.getString(56);
            String broSis3AdmissionNumber = myRs.getString(57);
            String broSis4AdmissionNumber = myRs.getString(58);
            String broSis5AdmissionNumber = myRs.getString(59);
            String broSis1Name = myRs.getString(60);
            String broSis2Name = myRs.getString(61);
            String broSis3Name = myRs.getString(62);
            String broSis4Name = myRs.getString(63);
            String broSis5Name = myRs.getString(64);
            int FamilyKey = myRs.getInt(34);
            Student tempStudent = new Student(admissionNumber, fullNameEnglish, fullNameSinhala, birthDate, house, religion, address, telephoneNumber, dateOfAdmission, classOfAdmission, gender, nameWithInitials, gramaNiladhariVasama, comeToSchoolBy, FamilyKey, fatherName, fatherJob, fatherWorkPlace, fatherWorkAddress, fatherWorkTelephone, fatherHomeTelephone, fatherMobile, motherName, motherJob, motherWorkPlace, motherWorkAddress, motherWorkTelephone, motherHomeTelephone, motherMobile, broSis1AdmissionNumber, broSis2AdmissionNumber, broSis3AdmissionNumber, broSis4AdmissionNumber, broSis5AdmissionNumber, broSis1Name, broSis2Name, broSis3Name, broSis4Name, broSis5Name, null, 5);
            tempNotification = new Notification(typeOfPersonTryToChange, nameWhoChange, typeOfPersonGoingToBeChanged, nameWhoGoingToBeChanged, tempStudent);
        }

        return tempNotification;
    }

    public void addNotification(Notification notification) throws SQLException {
        System.out.println("inside add Noti:" + notification.getNameWhoChange());
        if (notification.getTypeOfPersonGoingToBeChanged().equals("Teacher")) {
            PreparedStatement myStmnt1 = null;

            try {
                myStmnt1 = myCon.prepareStatement("INSERT INTO notification (NIC,RNo,NameWithIn,FullName,Gender,Dob,CivilStatus,Address,TelNoMobile,TelNoRecident,DateOfAssignmentAsTeacher,DateOfAssignmentToSchool,EducationalQual,ProffesionalQual,SubjectsAndClasses,SubjectsWishToTeach,GradesWishToTeach,"
                        + "NatureOfPresentPost,GradeOfService,DateOfPromotion,SectionTaught,ServiceRecord,PositionInSchool,idOfPersonTryToChange, nameWhoChange, typeOfPersonGoingToBeChanged, nameWhoGoingToBeChanged)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                myStmnt1.setString(1, notification.getTeacher().getNIC());
                myStmnt1.setString(2, notification.getTeacher().getRNo());
                myStmnt1.setString(3, notification.getTeacher().getNameWithin());
                myStmnt1.setString(4, notification.getTeacher().getFullName());
                myStmnt1.setString(5, notification.getTeacher().getGender());
                myStmnt1.setDate(6, notification.getTeacher().getDob());
                myStmnt1.setString(7, notification.getTeacher().getCivilStatus());
                myStmnt1.setString(8, notification.getTeacher().getAddress());
                myStmnt1.setString(9, notification.getTeacher().getTelNoMobile());
                myStmnt1.setString(10, notification.getTeacher().getTelNoRecident());
                myStmnt1.setDate(11, notification.getTeacher().getDateOfAssignAsTeacher());
                myStmnt1.setDate(12, notification.getTeacher().getDateOfAssignToSchool());
                myStmnt1.setString(13, notification.getTeacher().getEducationQual());
                myStmnt1.setString(14, notification.getTeacher().getProfessionalQual());
                myStmnt1.setString(15, notification.getTeacher().getSubjectsAndClasses());
                myStmnt1.setString(16, notification.getTeacher().getSubjectsWishToTeach());
                myStmnt1.setString(17, notification.getTeacher().getGradesWishToTeach());
                myStmnt1.setString(18, notification.getTeacher().getNatureOfPresentPost());
                myStmnt1.setString(19, notification.getTeacher().getGradeOfService());
                myStmnt1.setDate(20, notification.getTeacher().getDateOfPromotion());
                myStmnt1.setString(21, notification.getTeacher().getSectionTaught());
                myStmnt1.setString(22, notification.getTeacher().getServiceRecord());
                myStmnt1.setString(23, notification.getTeacher().getPositionInSchool());
                myStmnt1.setString(24, notification.getTypeOfPersonTryToChange());
                myStmnt1.setString(25, notification.getNameWhoChange());
                myStmnt1.setString(26, notification.getTypeOfPersonGoingToBeChanged());
                myStmnt1.setString(27, notification.getNameWhoGoingtoBeChanged());

                myStmnt1.executeUpdate();

            } finally {
                close(myStmnt1);
            }
        }

        if (notification.getTypeOfPersonGoingToBeChanged().equals("Student")) {
            PreparedStatement myStmt = null;

            try {
                System.out.println("inside query");

                myStmt = myCon.prepareStatement("INSERT INTO notification (AdmissionNumber,FullNameEnglish, FullNameSinhala, BirthDate, House, Religion, Address, TelephoneNumber, DateOfAdmission, ClassOfAdmission, Gender, NameWithInitials, GramaNiladhariVasama, ComeToSchoolBy,FatherName, FatherJob, FatherWorkPlace, FatherWorkAddress, FatherWorkTelephone, FatherHomeTelephone, FatherMobile, MotherName, MotherJob, MotherWorkPlace, MotherWorkAddress, MotherWorkTelephone, MotherHomeTelephone, MotherMobile,BroSis1AdmissionNumber ,BroSis2AdmissionNumber ,BroSis3AdmissionNumber ,BroSis4AdmissionNumber ,BroSis5AdmissionNumber ,BroSis1Name ,BroSis2Name ,BroSis3Name ,BroSis4Name ,BroSis5Name,idOfPersonTryToChange, nameWhoChange, typeOfPersonGoingToBeChanged, nameWhoGoingToBeChanged,FamilyKey) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

                myStmt.setString(1, notification.getStudent().getAdmissionNumber());
                myStmt.setString(2, notification.getStudent().getFullNameEnglish());
                myStmt.setString(3, notification.getStudent().getFullNameSinhala());
                myStmt.setDate(4, notification.getStudent().getBirthDate());
                myStmt.setString(5, notification.getStudent().getHouse());
                myStmt.setString(6, notification.getStudent().getReligion());
                myStmt.setString(7, notification.getStudent().getAddress());
                myStmt.setString(8, notification.getStudent().getTelephoneNumber());
                myStmt.setDate(9, notification.getStudent().getDateOfAdmission());
                myStmt.setString(10, notification.getStudent().getClassOfAdmission());
                myStmt.setString(11, notification.getStudent().getGender());
                myStmt.setString(12, notification.getStudent().getNameWithInitials());
                myStmt.setString(13, notification.getStudent().getGramaNiladhariVasama());
                myStmt.setString(14, notification.getStudent().getComeToSchoolBy());
                myStmt.setString(15, notification.getStudent().getFatherName());
                myStmt.setString(16, notification.getStudent().getFatherJob());
                myStmt.setString(17, notification.getStudent().getFatherWorkPlace());
                myStmt.setString(18, notification.getStudent().getFatherWorkAddress());
                myStmt.setString(19, notification.getStudent().getFatherWorkTelephone());
                myStmt.setString(20, notification.getStudent().getFatherHomeTelephone());
                myStmt.setString(21, notification.getStudent().getFatherMobile());
                myStmt.setString(22, notification.getStudent().getMotherName());
                myStmt.setString(23, notification.getStudent().getMotherJob());
                myStmt.setString(24, notification.getStudent().getMotherWorkPlace());
                myStmt.setString(25, notification.getStudent().getMotherWorkAddress());
                myStmt.setString(26, notification.getStudent().getMotherWorkTelephone());
                myStmt.setString(27, notification.getStudent().getMotherHomeTelephone());
                myStmt.setString(28, notification.getStudent().getMotherMobile());

                myStmt.setString(29, notification.getStudent().getBroSis1AdmissionNumber());
                myStmt.setString(30, notification.getStudent().getBroSis2AdmissionNumber());
                myStmt.setString(31, notification.getStudent().getBroSis3AdmissionNumber());
                myStmt.setString(32, notification.getStudent().getBroSis4AdmissionNumber());
                myStmt.setString(33, notification.getStudent().getBroSis5AdmissionNumber());
                myStmt.setString(34, notification.getStudent().getBroSis1Name());
                myStmt.setString(35, notification.getStudent().getBroSis2Name());
                myStmt.setString(36, notification.getStudent().getBroSis3Name());
                myStmt.setString(37, notification.getStudent().getBroSis4Name());
                myStmt.setString(38, notification.getStudent().getBroSis5Name());
                myStmt.setString(39, notification.getTypeOfPersonTryToChange());
                myStmt.setString(40, notification.getNameWhoChange());
                myStmt.setString(41, notification.getTypeOfPersonGoingToBeChanged());
                myStmt.setString(42, notification.getNameWhoGoingtoBeChanged());
                myStmt.setInt(43, notification.getStudent().getFamilyKey());

                myStmt.executeUpdate();

            } finally {
                close(myStmt);

            }
        }
        //   myStmnt.setBinaryStream(5, (Object)notification.getObject());
        //myStmnt.setObject(parameterIndex, this);

    }

    public void notifyTeacher(String NIC, boolean done) throws SQLException {
        if (done) {

            PreparedStatement myStmnt1 = null;

            try {
                myStmnt1 = myCon.prepareStatement("INSERT INTO teachernotification (NIC,Message)values (?,?)");
                myStmnt1.setString(1, NIC);
                myStmnt1.setString(2, "Principal confirmed your request");

                myStmnt1.executeUpdate();

            } finally {
                close(myStmnt1);
            }

        } else {
            PreparedStatement myStmnt1 = null;

            try {
                myStmnt1 = myCon.prepareStatement("INSERT INTO teachernotification (NIC,Message)values (?,?)");
                myStmnt1.setString(1, NIC);
                myStmnt1.setString(2, "Principal ignored your request");

                myStmnt1.executeUpdate();

            } finally {
                close(myStmnt1);
            }
        }
    }

    public void deleteAllFromTable() throws SQLException {
        PreparedStatement myStmnt1 = null;

        try {
            myStmnt1 = myCon.prepareStatement("TRUNCATE notification");

            //myStmnt2.executeUpdate();
            myStmnt1.executeUpdate();

        } finally {
            close(myStmnt1);

        }
    }

    public void deleteTeacherNotificationFromTable(String NIC) throws SQLException {
        PreparedStatement myStmnt1 = null;
        String a="'"+NIC+"'";

        try {
            myStmnt1 = myCon.prepareStatement("Delete From teachernotification where NIC="+a);

            //myStmnt2.executeUpdate();
            myStmnt1.executeUpdate();

        } finally {
            close(myStmnt1);

        }

    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
