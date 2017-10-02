/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malith.audit.core;

import java.sql.Date;

/**
 *
 * @author Malith
 */
public class AuditHistory {
    private int auditId;
    private String userId;
    private String secondPartyId;
    private String Action;
    private Date actionDateTime;

    public AuditHistory(int auditId, String userId, String secondPartyId, String Action, Date actionDateTime) {
        this.auditId = auditId;
        this.userId = userId;
        this.secondPartyId = secondPartyId;
        this.Action = Action;
        this.actionDateTime = actionDateTime;
    }

    public int getAuditId() {
        return auditId;
    }

    public void setAuditId(int auditId) {
        this.auditId = auditId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSecondPartyId() {
        return secondPartyId;
    }

    public void setSecondPartyId(String secondPartyId) {
        this.secondPartyId = secondPartyId;
    }

    public String getAction() {
        return Action;
    }

    public void setAction(String Action) {
        this.Action = Action;
    }

    public Date getActionDateTime() {
        return actionDateTime;
    }

    public void setActionDateTime(Date actionDateTime) {
        this.actionDateTime = actionDateTime;
    }
    
}
