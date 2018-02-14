package com.mercy.model.adcontext;

import java.io.Serializable;
import java.util.Date;

public class AdUserinfoInterface implements Serializable {
    private Long id;

    private String username;

    private Long orgniseId;

    private String displayName;

    private String userPrincipalname;

    private String lastLogon;

    private String lastLogonOff;

    private String samAccountName;

    private String pwdLastSet;

    private Date gmtCreate;

    private Date gmtUpdate;

    private String timeStamp;

    private String modifyType;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Long getOrgniseId() {
        return orgniseId;
    }

    public void setOrgniseId(Long orgniseId) {
        this.orgniseId = orgniseId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    public String getUserPrincipalname() {
        return userPrincipalname;
    }

    public void setUserPrincipalname(String userPrincipalname) {
        this.userPrincipalname = userPrincipalname == null ? null : userPrincipalname.trim();
    }

    public String getLastLogon() {
        return lastLogon;
    }

    public void setLastLogon(String lastLogon) {
        this.lastLogon = lastLogon == null ? null : lastLogon.trim();
    }

    public String getLastLogonOff() {
        return lastLogonOff;
    }

    public void setLastLogonOff(String lastLogonOff) {
        this.lastLogonOff = lastLogonOff == null ? null : lastLogonOff.trim();
    }

    public String getSamAccountName() {
        return samAccountName;
    }

    public void setSamAccountName(String samAccountName) {
        this.samAccountName = samAccountName == null ? null : samAccountName.trim();
    }

    public String getPwdLastSet() {
        return pwdLastSet;
    }

    public void setPwdLastSet(String pwdLastSet) {
        this.pwdLastSet = pwdLastSet == null ? null : pwdLastSet.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp == null ? null : timeStamp.trim();
    }

    public String getModifyType() {
        return modifyType;
    }

    public void setModifyType(String modifyType) {
        this.modifyType = modifyType == null ? null : modifyType.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", orgniseId=").append(orgniseId);
        sb.append(", displayName=").append(displayName);
        sb.append(", userPrincipalname=").append(userPrincipalname);
        sb.append(", lastLogon=").append(lastLogon);
        sb.append(", lastLogonOff=").append(lastLogonOff);
        sb.append(", samAccountName=").append(samAccountName);
        sb.append(", pwdLastSet=").append(pwdLastSet);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtUpdate=").append(gmtUpdate);
        sb.append(", timeStamp=").append(timeStamp);
        sb.append(", modifyType=").append(modifyType);
        sb.append("]");
        return sb.toString();
    }
}