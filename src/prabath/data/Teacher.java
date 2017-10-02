/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prabath.data;

import common.User;
import java.sql.Date;
import java.util.ArrayList;
//import java.util.Date;

/**
 *
 * @author prabath s
 */
public class Teacher extends User{

    private String NIC;
    private String RNo;
    private String nameWithin;
    private String fullName;
    private String gender;
    private Date dob;
    private String civilStatus;
    private String Address;
    private String telNoMobile;
    private String telNoRecident;
    private Date dateOfAssignAsTeacher;
    private Date dateOfAssignToSchool;
    private String educationQual;
    private String professionalQual;
    private String subjectsAndClasses;
    private String subjectsWishToTeach;
    private String gradesWishToTeach;
    private String natureOfPresentPost;
    private String gradeOfService;
    private Date dateOfPromotion;
    
    private String ClubIncharge;

   

    public String getClubIncharge() {
        return ClubIncharge;
    }

    public void setClubIncharge(String ClubIncharge) {
        this.ClubIncharge = ClubIncharge;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    private String sectionTaught;
    private String serviceRecord;
    private String positionInSchool;
    private ArrayList<String> subjects;

    public Teacher(String NIC, String RNo, String nameWithin, String fullName, String gender, Date dob, String civilStatus, String Address, String telNoMobile, String telNoRecident, Date dateOfAssignAsTeacher, Date dateOfAssignToSchool, String educationQual, String professionalQual, String subjectsAndClasses, String subjectsWishToTeach, String gradesWishToTeach, String natureOfPresentPost, String gradeOfService, Date dateOfPromotion, String sectionTaught, String serviceRecord, String positionInSchool,int accessPriviledge) {
        super.setId(NIC);
        this.NIC = NIC;
        this.RNo = RNo;
        this.nameWithin = nameWithin;
        this.fullName = fullName;
        this.gender = gender;
        this.dob = dob;
        this.civilStatus = civilStatus;
        this.Address = Address;
        this.telNoMobile = telNoMobile;
        this.telNoRecident = telNoRecident;
        this.dateOfAssignAsTeacher = dateOfAssignAsTeacher;
        this.dateOfAssignToSchool = dateOfAssignToSchool;
        this.educationQual = educationQual;
        this.professionalQual = professionalQual;
        this.subjectsAndClasses = subjectsAndClasses;
        this.subjectsWishToTeach = subjectsWishToTeach;
        this.gradesWishToTeach = gradesWishToTeach;
        this.natureOfPresentPost = natureOfPresentPost;
        this.gradeOfService = gradeOfService;
        this.dateOfPromotion = dateOfPromotion;
        this.sectionTaught = sectionTaught;
        this.serviceRecord = serviceRecord;
        this.positionInSchool = positionInSchool;
        super.setAccessPriviledge(accessPriviledge);

    }
    public Teacher(String NIC, String RNo, String nameWithin, String fullName, String gender, Date dob, String civilStatus, String Address, String telNoMobile, String telNoRecident, Date dateOfAssignAsTeacher, Date dateOfAssignToSchool, String educationQual, String professionalQual, String subjectsAndClasses, String subjectsWishToTeach, String gradesWishToTeach, String natureOfPresentPost, String gradeOfService, Date dateOfPromotion, String sectionTaught, String serviceRecord, String positionInSchool,int accessPriviledge,String password) {
        super.setId(NIC);
        this.NIC = NIC;
        this.RNo = RNo;
        this.nameWithin = nameWithin;
        this.fullName = fullName;
        this.gender = gender;
        this.dob = dob;
        this.civilStatus = civilStatus;
        this.Address = Address;
        this.telNoMobile = telNoMobile;
        this.telNoRecident = telNoRecident;
        this.dateOfAssignAsTeacher = dateOfAssignAsTeacher;
        this.dateOfAssignToSchool = dateOfAssignToSchool;
        this.educationQual = educationQual;
        this.professionalQual = professionalQual;
        this.subjectsAndClasses = subjectsAndClasses;
        this.subjectsWishToTeach = subjectsWishToTeach;
        this.gradesWishToTeach = gradesWishToTeach;
        this.natureOfPresentPost = natureOfPresentPost;
        this.gradeOfService = gradeOfService;
        this.dateOfPromotion = dateOfPromotion;
        this.sectionTaught = sectionTaught;
        this.serviceRecord = serviceRecord;
        this.positionInSchool = positionInSchool;
        super.setAccessPriviledge(accessPriviledge);
        super.setPassword(password);

    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getRNo() {
        return RNo;
    }

    public void setRNo(String RNo) {
        this.RNo = RNo;
    }

    public String getNameWithin() {
        return nameWithin;
    }

    public void setNameWithin(String nameWithin) {
        this.nameWithin = nameWithin;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public String getTelNoMobile() {
        return telNoMobile;
    }

    public void setTelNoMobile(String telNoMobile) {
        this.telNoMobile = telNoMobile;
    }

    public String getTelNoRecident() {
        return telNoRecident;
    }

    public void setTelNoRecident(String telNoRecident) {
        this.telNoRecident = telNoRecident;
    }

    public Date getDateOfAssignAsTeacher() {
        return dateOfAssignAsTeacher;
    }

    public void setDateOfAssignAsTeacher(Date dateOfAssignAsTeacher) {
        this.dateOfAssignAsTeacher = dateOfAssignAsTeacher;
    }

    public Date getDateOfAssignToSchool() {
        if(dateOfAssignAsTeacher==null){System.out.println("null");}
        return dateOfAssignToSchool;
    }

    public void setDateOfAssignToSchool(Date dateOfAssignToSchool) {
        this.dateOfAssignToSchool = dateOfAssignToSchool;
    }

    public String getEducationQual() {
        return educationQual;
    }

    public void setEducationQual(String educationQual) {
        this.educationQual = educationQual;
    }

    public String getProfessionalQual() {
        return professionalQual;
    }

    public void setProfessionalQual(String professionalQual) {
        this.professionalQual = professionalQual;
    }

    public String getSubjectsAndClasses() {
        return subjectsAndClasses;
    }

    public void setSubjectsAndClasses(String subjectsAndClasses) {
        this.subjectsAndClasses = subjectsAndClasses;
    }

    public String getSubjectsWishToTeach() {
        return subjectsWishToTeach;
    }

    public void setSubjectsWishToTeach(String subjectsWishToTeach) {
        this.subjectsWishToTeach = subjectsWishToTeach;
    }

    public String getGradesWishToTeach() {
        return gradesWishToTeach;
    }

    public void setGradesWishToTeach(String gradesWishToTeach) {
        this.gradesWishToTeach = gradesWishToTeach;
    }

    public String getNatureOfPresentPost() {
        return natureOfPresentPost;
    }

    public void setNatureOfPresentPost(String natureOfPresentPost) {
        this.natureOfPresentPost = natureOfPresentPost;
    }

    public String getGradeOfService() {
        return gradeOfService;
    }

    public void setGradeOfService(String gradeOfService) {
        this.gradeOfService = gradeOfService;
    }

    public Date getDateOfPromotion() {
        return dateOfPromotion;
    }

    public void setDateOfPromotion(Date dateOfPromotion) {
        this.dateOfPromotion = dateOfPromotion;
    }

    public String getSectionTaught() {
        return sectionTaught;
    }

    public void setSectionTaught(String sectionTaught) {
        this.sectionTaught = sectionTaught;
    }

    public String getServiceRecord() {
        return serviceRecord;
    }

    public void setServiceRecord(String serviceRecord) {
        this.serviceRecord = serviceRecord;
    }

    public String getPositionInSchool() {
        return positionInSchool;
    }

    public void setPositionInSchool(String positionInSchool) {
        this.positionInSchool = positionInSchool;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }
     
    public String getSummary(){
        String temp = "<html><body>";
        
        String name = "";
        if(nameWithin != null & !"".equals(nameWithin)){name+= "<h1><font color=\"#228B22\">"+nameWithin+"</font>&#160</h1>";}    
        
        
        temp="<TABLE ALIGN=CENTER WIDTH=\"100%\" BORDER=1 CELLSPACING=1 CELLPADDING=1><caption>"+name+"</caption>";   
        
         if(fullName != null & !"".equals(fullName)){temp+= "<tr><td><b>Full name</b></td><td>"+fullName+"</td></tr>";} 
        if(NIC != null & !"".equals(NIC)){temp+=          "<tr><td><b>NIC</b></td><td>"+NIC+"</td></tr>";} 
        if(RNo != null & !"".equals(RNo)){temp+=          "<tr><td><b>Registration no</b></td><td>"+RNo+"</td></tr>";} 
        
        if(gender != null & !"".equals(gender)){temp+=          "<tr><td><b>Gender</b></td><td>"+gender+"</td></tr>";} 
       // if(NIC != null & !"".equals(NIC)){temp+=          "<tr><td><b>NIC</b></td><td>"+NIC+"</td></tr>";} 
        if(civilStatus != null & !"".equals(civilStatus)){temp+=          "<tr><td><b>Sivil status</b></td><td>"+civilStatus+"</td></tr>";} 
        if(Address != null & !"".equals(Address)){temp+=          "<tr><td><b>Address</b></td><td>"+Address+"</td></tr>";} 
        if(telNoMobile != null & !"".equals(telNoMobile)){temp+=          "<tr><td><b>Mobile no</b></td><td>"+telNoMobile+"</td></tr>";} 
        if(telNoRecident != null & !"".equals(telNoRecident)){temp+=          "<tr><td><b>Telephone no</b></td><td>"+telNoRecident+"</td></tr>";} 
        //if(NIC != null & !"".equals(NIC)){temp+=          "<tr><td><b>NIC</b></td><td>"+NIC+"</td></tr>";} 
        //if(NIC != null & !"".equals(NIC)){temp+=          "<tr><td><b>NIC</b></td><td>"+NIC+"</td></tr>";} 
        if(educationQual != null & !"".equals(educationQual)){temp+=          "<tr><td><b>Education qualifications</b></td><td>"+educationQual+"</td></tr>";} 
        if(professionalQual != null & !"".equals(professionalQual)){temp+=          "<tr><td><b>Proffessional qualifications</b></td><td>"+professionalQual+"</td></tr>";} 
       
        if(subjectsWishToTeach != null & !"".equals(subjectsWishToTeach)){temp+=          "<tr><td><b>Subjects wish to teach</b></td><td>"+subjectsWishToTeach+"</td></tr>";} 
        if(gradesWishToTeach != null & !"".equals(gradesWishToTeach)){temp+=          "<tr><td><b>Grades wish to teach</b></td><td>"+gradesWishToTeach+"</td></tr>";} 
        if(natureOfPresentPost != null & !"".equals(natureOfPresentPost)){temp+=          "<tr><td><b>Present post</b></td><td>"+natureOfPresentPost+"</td></tr>";} 
        if(gradeOfService != null & !"".equals(gradeOfService)){temp+=          "<tr><td><b>Grade of service</b></td><td>"+gradeOfService+"</td></tr>";}
       // if(NIC != null & !"".equals(NIC)){temp+=          "<tr><td><b>NIC</b></td><td>"+NIC+"</td></tr>";}
        
       
        temp+= "</table></body></html>";
        return temp;
    }

}
