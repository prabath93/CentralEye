/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
 
package chamin.data;

import common.User;
import java.sql.Date;

/**
 *
 * @author chamin
 */


public class Club extends User{
    private String ClubId;
    private String ClubName;
    //private String TeacherInchargeId;
    private String[] TeacherInchargeId;
    private String Advisor;
    private String PresidentId;
    private String VisePresidentId;
    private String SecretaryId;
    private String AssSecretaryId;
    private String TreasurerId;
    private String Task;
    private String Suggestions;
    private Date DateOfEstablish;
    private String[] MemberIdList;

    public Club(String ClubId, String ClubName, String TeacherInchargeId[], String Advisor, String PresidentId, String VisePresidentId, String SecretaryId, String AssSecretaryId, String TreasurerId, String Task, String Suggestions, Date DateOfEstablish, String[] MemberIdList) {
        this.ClubId = ClubId;
        this.ClubName = ClubName;
        this.TeacherInchargeId = TeacherInchargeId;
        this.Advisor = Advisor;
        this.PresidentId = PresidentId;
        this.VisePresidentId = VisePresidentId;
        this.SecretaryId = SecretaryId;
        this.AssSecretaryId = AssSecretaryId;
        this.TreasurerId = TreasurerId;
        this.Task = Task;
        this.Suggestions = Suggestions;
        this.DateOfEstablish = DateOfEstablish;
        this.MemberIdList = MemberIdList;
    }

    public String getClubId() {
        return ClubId;
    }

    public void setClubId(String ClubId) {
        this.ClubId = ClubId;
    }

    public String getClubName() {
        return ClubName;
    }

    public void setClubName(String ClubName) {
        this.ClubName = ClubName;
    }

    public String[] getTeacherInchargeId() {
        return TeacherInchargeId;
    }

    public void setTeacherInchargeId(String[] TeacherInchargeId) {
        this.TeacherInchargeId = TeacherInchargeId;
    }

    public String getAdvisor() {
        return Advisor;
    }

    public void setAdvisor(String Advisor) {
        this.Advisor = Advisor;
    }

    public String getPresidentId() {
        return PresidentId;
    }

    public void setPresidentId(String PresidentId) {
        this.PresidentId = PresidentId;
    }

    public String getVisePresidentId() {
        return VisePresidentId;
    }

    public void setWisePresidentId(String VisePresidentId) {
        this.VisePresidentId = VisePresidentId;
    }

    public String getSecretaryId() {
        return SecretaryId;
    }

    public void setSecretaryId(String SecretaryId) {
        this.SecretaryId = SecretaryId;
    }

    public String getAssSecretaryId() {
        return AssSecretaryId;
    }

    public void setAssSecretaryId(String AssSecretaryId) {
        this.AssSecretaryId = AssSecretaryId;
    }

    public String getTreasurerId() {
        return TreasurerId;
    }

    public void setTreasureId(String TreasureId) {
        this.TreasurerId = TreasureId;
    }

    public String getTask() {
        return Task;
    }

    public void setTask(String Task) {
        this.Task = Task;
    }

    public String getSuggestions() {
        return Suggestions;
    }

    public void setSuggestions(String Suggestions) {
        this.Suggestions = Suggestions;
    }

    public Date getDateOfEstablish() {
        return DateOfEstablish;
    }

    public void setDateOfEstablish(Date DateOfEstablish) {
        this.DateOfEstablish = DateOfEstablish;
    }

    public String[] getMemberIdList() {
        return MemberIdList;
    }

    public void setMemberIdList(String[] MemberIdList) {
        this.MemberIdList = MemberIdList;
    }

    
    public String getSummary() {
        String temp = "<html><body>";

        String name = "";
        if (ClubName != null & !"".equals(ClubName)) {
            name += "<h1><font color=\"#228B22\">" + ClubName + "</font></h1>";
        }

        temp = "<TABLE ALIGN=CENTER WIDTH=\"100%\" BORDER=1 CELLSPACING=1 CELLPADDING=1><caption>" + name + "</caption>";

        if (ClubId != null & !"".equals(ClubId)) {
            temp += "<tr><td><b>Club ID </b></td><td>" + ClubId + "</td></tr>";
        }
        if (TeacherInchargeId[0] != null & !"".equals(TeacherInchargeId[0])) {
            temp += "<tr><td><b>TeacherInchargeId</b></td><td>" + TeacherInchargeId[0] + "</td></tr>";
        }
        if (Advisor != null & !"".equals(Advisor)) {
            temp += "<tr><td><b>Advisor</b></td><td>" + Advisor + "</td></tr>";
        }
        if (PresidentId != null & !"".equals(PresidentId)) {
            temp += "<tr><td><b>PresidentId 1</b></td><td>" + PresidentId + "</td></tr>";
        }
        if (VisePresidentId != null & !"".equals(VisePresidentId)) {
            temp += "<tr><td><b>VisePresidentId 2</b></td><td>" + VisePresidentId + "</td></tr>";
        }
        if (SecretaryId != null & !"".equals(SecretaryId)) {
            temp += "<tr><td><b>SecretaryId</b></td><td>" + SecretaryId + "</td></tr>";
        }
        if (AssSecretaryId != null & !"".equals(AssSecretaryId)) {
            temp += "<tr><td><b>AssSecretaryId</b></td><td>" + AssSecretaryId + "</td></tr>";
        }
        if (TreasurerId != null & !"".equals(TreasurerId)) {
            temp += "<tr><td><b>TreasurerId</b></td><td>" + TreasurerId + "</td></tr>";
        }
        if (Task != null & !"".equals(Task)) {
            temp += "<tr><td><b> Task</b></td><td>" + Task + "</td></tr>";
        }
        if (Suggestions != null & !"".equals(Suggestions)) {
            temp += "<tr><td><b>Suggestions</b></td><td>" + Suggestions + "</td></tr></td></tr>";
        }
        if (MemberIdList[0] != null & !"".equals(MemberIdList[0])) {
            temp += "<tr><td><b>MemberIdList</b></td><td>" + MemberIdList[0] + "</td></tr>";
        }

        temp += "</table></body></html>";
        return temp;
    }
    
  
    
 

    
    
    
}
