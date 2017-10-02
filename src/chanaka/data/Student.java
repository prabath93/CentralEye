package chanaka.data;

import common.User;
import java.sql.Date;

public class Student extends User {

    String admissionNumber;
    String fullNameEnglish;
    String fullNameSinhala;
    Date birthDate;
    String house;
    String religion;
    String address;
    String telephoneNumber;
    Date dateOfAdmission;
    String classOfAdmission;
    String gender;
    String nameWithInitials;
    String gramaNiladhariVasama;
    String comeToSchoolBy;
    int familyKey;

    String fatherName;
    String fatherJob;
    String fatherWorkPlace;
    String fatherWorkAddress;
    String fatherWorkTelephone;
    String fatherHomeTelephone;
    String fatherMobile;
    String motherName;
    String motherJob;
    String motherWorkPlace;
    String motherWorkAddress;
    String motherWorkTelephone;
    String motherHomeTelephone;
    String motherMobile;

    String broSis1AdmissionNumber;
    String broSis2AdmissionNumber;
    String broSis3AdmissionNumber;
    String broSis4AdmissionNumber;
    String broSis5AdmissionNumber;
    String broSis1Name;
    String broSis2Name;
    String broSis3Name;
    String broSis4Name;
    String broSis5Name;

    public Student(String admissionNumber, String fullNameEnglish, String fullNameSinhala, Date birthDate, String house, String religion, String address, String telephoneNumber, Date dateOfAdmission, String classOfAdmission, String gender, String nameWithInitials, String gramaNiladhariVasama, String comeToSchoolBy, int familyKey, String fatherName, String fatherJob, String fatherWorkPlace, String fatherWorkAddress, String fatherWorkTelephone, String fatherHomeTelephone, String fatherMobile, String motherName, String motherJob, String motherWorkPlace, String motherWorkAddress, String motherWorkTelephone, String motherHomeTelephone, String motherMobile, String broSis1AdmissionNumber, String broSis2AdmissionNumber, String broSis3AdmissionNumber, String broSis4AdmissionNumber, String broSis5AdmissionNumber, String broSis1Name, String broSis2Name, String broSis3Name, String broSis4Name, String broSis5Name, String password, int accessPriviledge) {
        this.admissionNumber = admissionNumber;
        this.fullNameEnglish = fullNameEnglish;
        this.fullNameSinhala = fullNameSinhala;
        this.birthDate = birthDate;
        this.house = house;
        this.religion = religion;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.dateOfAdmission = dateOfAdmission;
        this.classOfAdmission = classOfAdmission;
        this.gender = gender;
        this.nameWithInitials = nameWithInitials;
        this.gramaNiladhariVasama = gramaNiladhariVasama;
        this.comeToSchoolBy = comeToSchoolBy;
        this.familyKey = familyKey;

        this.fatherName = fatherName;
        this.fatherJob = fatherJob;
        this.fatherWorkPlace = fatherWorkPlace;
        this.fatherWorkAddress = fatherWorkAddress;
        this.fatherWorkTelephone = fatherWorkTelephone;
        this.fatherHomeTelephone = fatherHomeTelephone;
        this.fatherMobile = fatherMobile;
        this.motherName = motherName;
        this.motherJob = motherJob;
        this.motherWorkPlace = motherWorkPlace;
        this.motherWorkAddress = motherWorkAddress;
        this.motherWorkTelephone = motherWorkTelephone;
        this.motherHomeTelephone = motherHomeTelephone;
        this.motherMobile = motherMobile;

        this.broSis1AdmissionNumber = broSis1AdmissionNumber;
        this.broSis2AdmissionNumber = broSis2AdmissionNumber;
        this.broSis3AdmissionNumber = broSis3AdmissionNumber;
        this.broSis4AdmissionNumber = broSis4AdmissionNumber;
        this.broSis5AdmissionNumber = broSis5AdmissionNumber;
        this.broSis1Name = broSis1Name;
        this.broSis2Name = broSis2Name;
        this.broSis3Name = broSis3Name;
        this.broSis4Name = broSis4Name;
        this.broSis5Name = broSis5Name;

        super.setPassword(password);
        super.setId(admissionNumber);
        super.setAccessPriviledge(accessPriviledge);
    }

    public String getAdmissionYear(String admissionNember){
        return Integer.toString(dateOfAdmission.getYear()+1900);
    }
    
    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public void setFullNameEnglish(String fullNameEnglish) {
        this.fullNameEnglish = fullNameEnglish;
    }

    public void setFullNameSinhala(String fullNameSinhala) {
        this.fullNameSinhala = fullNameSinhala;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public void setClassOfAdmission(String classOfAdmission) {
        this.classOfAdmission = classOfAdmission;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNameWithInitials(String nameWithInitials) {
        this.nameWithInitials = nameWithInitials;
    }

    public void setGramaNiladhariVasama(String gramaNiladhariVasama) {
        this.gramaNiladhariVasama = gramaNiladhariVasama;
    }

    public void setComeToSchoolBy(String comeToSchoolBy) {
        this.comeToSchoolBy = comeToSchoolBy;
    }

    public void setFamilyKey(int familyKey) {
        this.familyKey = familyKey;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setFatherJob(String fatherJob) {
        this.fatherJob = fatherJob;
    }

    public void setFatherWorkPlace(String fatherWorkPlace) {
        this.fatherWorkPlace = fatherWorkPlace;
    }

    public void setFatherWorkAddress(String fatherWorkAddress) {
        this.fatherWorkAddress = fatherWorkAddress;
    }

    public void setFatherWorkTelephone(String fatherWorkTelephone) {
        this.fatherWorkTelephone = fatherWorkTelephone;
    }

    public void setFatherHomeTelephone(String fatherHomeTelephone) {
        this.fatherHomeTelephone = fatherHomeTelephone;
    }

    public void setFatherMobile(String fatherMobile) {
        this.fatherMobile = fatherMobile;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public void setMotherJob(String motherJob) {
        this.motherJob = motherJob;
    }

    public void setMotherWorkPlace(String motherWorkPlace) {
        this.motherWorkPlace = motherWorkPlace;
    }

    public void setMotherWorkAddress(String motherWorkAddress) {
        this.motherWorkAddress = motherWorkAddress;
    }

    public void setMotherWorkTelephone(String motherWorkTelephone) {
        this.motherWorkTelephone = motherWorkTelephone;
    }

    public void setMotherHomeTelephone(String motherHomeTelephone) {
        this.motherHomeTelephone = motherHomeTelephone;
    }

    public void setMotherMobile(String motherMobile) {
        this.motherMobile = motherMobile;
    }

    public void setBroSis1AdmissionNumber(String broSis1AdmissionNumber) {
        this.broSis1AdmissionNumber = broSis1AdmissionNumber;
    }

    public void setBroSis2AdmissionNumber(String broSis2AdmissionNumber) {
        this.broSis2AdmissionNumber = broSis2AdmissionNumber;
    }

    public void setBroSis3AdmissionNumber(String broSis3AdmissionNumber) {
        this.broSis3AdmissionNumber = broSis3AdmissionNumber;
    }

    public void setBroSis4AdmissionNumber(String broSis4AdmissionNumber) {
        this.broSis4AdmissionNumber = broSis4AdmissionNumber;
    }

    public void setBroSis5AdmissionNumber(String broSis5AdmissionNumber) {
        this.broSis5AdmissionNumber = broSis5AdmissionNumber;
    }

    public void setBroSis1Name(String broSis1Name) {
        this.broSis1Name = broSis1Name;
    }

    public void setBroSis2Name(String broSis2Name) {
        this.broSis2Name = broSis2Name;
    }

    public void setBroSis3Name(String broSis3Name) {
        this.broSis3Name = broSis3Name;
    }

    public void setBroSis4Name(String broSis4Name) {
        this.broSis4Name = broSis4Name;
    }

    public void setBroSis5Name(String broSis5Name) {
        this.broSis5Name = broSis5Name;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public String getFullNameEnglish() {
        return fullNameEnglish;
    }

    public String getFullNameSinhala() {
        return fullNameSinhala;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getHouse() {
        return house;
    }

    public String getReligion() {
        return religion;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public String getClassOfAdmission() {
        return classOfAdmission;
    }

    public String getGender() {
        return gender;
    }

    public String getNameWithInitials() {
        return nameWithInitials;
    }

    public String getGramaNiladhariVasama() {
        return gramaNiladhariVasama;
    }

    public String getComeToSchoolBy() {
        return comeToSchoolBy;
    }

    public int getFamilyKey() {
        return familyKey;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getFatherJob() {
        return fatherJob;
    }

    public String getFatherWorkPlace() {
        return fatherWorkPlace;
    }

    public String getFatherWorkAddress() {
        return fatherWorkAddress;
    }

    public String getFatherWorkTelephone() {
        return fatherWorkTelephone;
    }

    public String getFatherHomeTelephone() {
        return fatherHomeTelephone;
    }

    public String getFatherMobile() {
        return fatherMobile;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getMotherJob() {
        return motherJob;
    }

    public String getMotherWorkPlace() {
        return motherWorkPlace;
    }

    public String getMotherWorkAddress() {
        return motherWorkAddress;
    }

    public String getMotherWorkTelephone() {
        return motherWorkTelephone;
    }

    public String getMotherHomeTelephone() {
        return motherHomeTelephone;
    }

    public String getMotherMobile() {
        return motherMobile;
    }

    public String getBroSis1AdmissionNumber() {
        return broSis1AdmissionNumber;
    }

    public String getBroSis2AdmissionNumber() {
        return broSis2AdmissionNumber;
    }

    public String getBroSis3AdmissionNumber() {
        return broSis3AdmissionNumber;
    }

    public String getBroSis4AdmissionNumber() {
        return broSis4AdmissionNumber;
    }

    public String getBroSis5AdmissionNumber() {
        return broSis5AdmissionNumber;
    }

    public String getBroSis1Name() {
        return broSis1Name;
    }

    public String getBroSis2Name() {
        return broSis2Name;
    }

    public String getBroSis3Name() {
        return broSis3Name;
    }

    public String getBroSis4Name() {
        return broSis4Name;
    }

    public String getBroSis5Name() {
        return broSis5Name;
    }

    public String getSummary() {
        String temp = "<html><body>";

        String name = "";
        if (nameWithInitials != null & !"".equals(nameWithInitials)) {
            name += "<h1><font color=\"#228B22\">" + nameWithInitials + "</font></h1>";
        }

        temp = "<TABLE ALIGN=CENTER WIDTH=\"100%\" BORDER=1 CELLSPACING=1 CELLPADDING=10><caption>" + name + "</caption>";

        if (admissionNumber != null & !"".equals(admissionNumber)) {
            temp += "<tr><td><b>Admission No  </b></td><td>" + admissionNumber + "</td></tr>";
        }
        if (fullNameEnglish != null & !"".equals(fullNameEnglish)) {
            temp += "<tr><td><b>Full Name</b></td><td>" + fullNameEnglish + "</td></tr>";
        }
        if (fullNameSinhala != null & !"".equals(fullNameSinhala)) {
            temp += "<tr><td><b>සම්පූර්ණ නම (සිංහලෙන්)</b></td><td>" + fullNameSinhala + "</td></tr>";
        }
        if (gender != null & !"".equals(gender)) {
            temp += "<tr><td><b>Gender</b></td><td>" + gender + "</td></tr>";
        }
        if (house != null & !"".equals(house)) {
            temp += "<tr><td><b>House</b></td><td>" + house + "</td></tr>";
        }
        if (religion != null & !"".equals(religion)) {
            temp += "<tr><td><b>Religion</b></td><td>" + religion + "</td></tr>";
        }
        if (address != null & !"".equals(address)) {
            temp += "<tr><td><b>Address</b></td><td>" + address + "</td></tr>";
        }
        if (telephoneNumber != null & !"".equals(telephoneNumber)) {
            temp += "<tr><td><b>Telephone</b></td><td>" + telephoneNumber + "</td></tr>";
        }
        if (classOfAdmission != null & !"".equals(classOfAdmission)) {
            temp += "<tr><td><b>Class of Admission</b></td><td>" + classOfAdmission + "</td></tr>";
        }

        if (gramaNiladhariVasama != null & !"".equals(gramaNiladhariVasama)) {
            temp += "<tr><td><b>Grama Niladhari Divition</b></td><td>" + gramaNiladhariVasama + "</td></tr></td></tr>";
        }
        if (comeToSchoolBy != null & !"".equals(comeToSchoolBy)) {
            temp += "<tr><td><b>Come to by</b></td><td>" + comeToSchoolBy + "</td></tr>";
        }
        if (fatherName != null & !"".equals(fatherName)) {
            temp += "<tr><td><b>Father's Name</b></td><td>" + fatherName + "</td></tr>";
        }
        if (motherName != null & !"".equals(motherName)) {
            temp += "<tr><td><b>Mother's Name</b></td><td>" + motherName + "</td></tr>";
        }
        if (fatherJob != null & !"".equals(fatherJob)) {
            temp += "<tr><td><b>Father's Job</b></td><td>" + fatherJob + "</td></tr>";
        }
        if (fatherWorkPlace != null & !"".equals(fatherWorkPlace)) {
            temp += "<tr><td><b>Father's Work Place</b></td><td>" + fatherWorkPlace + "</td></tr>";
        }
        if (fatherWorkAddress != null & !"".equals(fatherWorkAddress)) {
            temp += "<tr><td><b>Father's Work Address</b></td><td>" + fatherWorkAddress + "</td></tr>";
        }
        if (fatherWorkTelephone != null & !"".equals(fatherWorkTelephone)) {
            temp += "<tr><td><b>Father's Work Telephone</b></td><td>" + fatherWorkTelephone + "</td></tr>";
        }
        if (fatherHomeTelephone != null & !"".equals(fatherHomeTelephone)) {
            temp += "<tr><td><b>Father's Home Telephone</b></td><td>" + fatherHomeTelephone + "</td></tr>";
        }
        if (fatherMobile != null & !"".equals(fatherMobile)) {
            temp += "<tr><td><b>Father's Mobile Number</b></td><td>" + fatherMobile + "</td></tr>";
        }
        
        if (motherJob != null & !"".equals(motherJob)) {
            temp += "<tr><td><b>Mother's Job</b></td><td>" + motherJob + "</td></tr>";
        }
        if (motherWorkPlace != null & !"".equals(motherWorkPlace)) {
            temp += "<tr><td><b>Mother's Work Place</b></td><td>" + motherWorkPlace + "</td></tr>";
        }
        if (motherWorkAddress != null & !"".equals(motherWorkAddress)) {
            temp += "<tr><td><b>Mother's Work Address</b></td><td>" + motherWorkAddress + "</td></tr>";
        }
        if (motherWorkTelephone != null & !"".equals(motherWorkTelephone)) {
            temp += "<tr><td><b>Mother's Work Telephone</b></td><td>" + motherWorkTelephone + "</td></tr>";
        }
        if (motherHomeTelephone != null & !"".equals(motherHomeTelephone)) {
            temp += "<tr><td><b>Mother's Home Telephone</b></td><td>" + motherHomeTelephone + "</td></tr>";
        }
        if (motherMobile != null & !"".equals(motherMobile)) {
            temp += "<tr><td><b>Mother's Mobile</b></td><td>" + motherMobile + "</td></tr>";
        }
        /*
        if (broSis1AdmissionNumber != null & !"".equals(broSis1AdmissionNumber)) {
            temp += "<tr><td><b>Personal Address</b></td><td>" + broSis1AdmissionNumber + "</td></tr>";
        }
        if (broSis2AdmissionNumber != null & !"".equals(broSis2AdmissionNumber)) {
            temp += "<tr><td><b>Personal Address</b></td><td>" + broSis2AdmissionNumber + "</td></tr>";
        }
        if (broSis3AdmissionNumber != null & !"".equals(broSis3AdmissionNumber)) {
            temp += "<tr><td><b>Personal Address</b></td><td>" + broSis3AdmissionNumber + "</td></tr>";
        }
        if (broSis4AdmissionNumber != null & !"".equals(broSis4AdmissionNumber)) {
            temp += "<tr><td><b>Personal Address</b></td><td>" + broSis4AdmissionNumber + "</td></tr>";
        }
        if (broSis5AdmissionNumber != null & !"".equals(broSis5AdmissionNumber)) {
            temp += "<tr><td><b>Personal Address</b></td><td>" + broSis5AdmissionNumber + "</td></tr>";
        }
        if (broSis1Name != null & !"".equals(broSis1Name)) {
            temp += "<tr><td><b>Personal Address</b></td><td>" + broSis1Name + "</td></tr>";
        }
        if (broSis2Name != null & !"".equals(broSis2Name)) {
            temp += "<tr><td><b>Personal Address</b></td><td>" + broSis2Name + "</td></tr>";
        }
        if (broSis3Name != null & !"".equals(broSis3Name)) {
            temp += "<tr><td><b>Mobile 1</b></td><td>" + broSis3Name + "</td></tr>";
        }
        if (broSis4Name != null & !"".equals(broSis4Name)) {
            temp += "<tr><td><b>Mobile 1</b></td><td>" + broSis4Name + "</td></tr>";
        }
        if (broSis5Name != null & !"".equals(broSis5Name)) {
            temp += "<tr><td><b>Mobile 1</b></td><td>" + broSis5Name + "</td></tr>";
        }
                
        */

        temp += "</table></body></html>";
        return temp;
    }

}
