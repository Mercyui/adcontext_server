package com.mercy.model.adcontext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdUserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public AdUserinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andOrgniseIdIsNull() {
            addCriterion("orgnise_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgniseIdIsNotNull() {
            addCriterion("orgnise_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgniseIdEqualTo(Long value) {
            addCriterion("orgnise_id =", value, "orgniseId");
            return (Criteria) this;
        }

        public Criteria andOrgniseIdNotEqualTo(Long value) {
            addCriterion("orgnise_id <>", value, "orgniseId");
            return (Criteria) this;
        }

        public Criteria andOrgniseIdGreaterThan(Long value) {
            addCriterion("orgnise_id >", value, "orgniseId");
            return (Criteria) this;
        }

        public Criteria andOrgniseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("orgnise_id >=", value, "orgniseId");
            return (Criteria) this;
        }

        public Criteria andOrgniseIdLessThan(Long value) {
            addCriterion("orgnise_id <", value, "orgniseId");
            return (Criteria) this;
        }

        public Criteria andOrgniseIdLessThanOrEqualTo(Long value) {
            addCriterion("orgnise_id <=", value, "orgniseId");
            return (Criteria) this;
        }

        public Criteria andOrgniseIdIn(List<Long> values) {
            addCriterion("orgnise_id in", values, "orgniseId");
            return (Criteria) this;
        }

        public Criteria andOrgniseIdNotIn(List<Long> values) {
            addCriterion("orgnise_id not in", values, "orgniseId");
            return (Criteria) this;
        }

        public Criteria andOrgniseIdBetween(Long value1, Long value2) {
            addCriterion("orgnise_id between", value1, value2, "orgniseId");
            return (Criteria) this;
        }

        public Criteria andOrgniseIdNotBetween(Long value1, Long value2) {
            addCriterion("orgnise_id not between", value1, value2, "orgniseId");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNull() {
            addCriterion("display_name is null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNotNull() {
            addCriterion("display_name is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameEqualTo(String value) {
            addCriterion("display_name =", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotEqualTo(String value) {
            addCriterion("display_name <>", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThan(String value) {
            addCriterion("display_name >", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThanOrEqualTo(String value) {
            addCriterion("display_name >=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThan(String value) {
            addCriterion("display_name <", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThanOrEqualTo(String value) {
            addCriterion("display_name <=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLike(String value) {
            addCriterion("display_name like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotLike(String value) {
            addCriterion("display_name not like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIn(List<String> values) {
            addCriterion("display_name in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotIn(List<String> values) {
            addCriterion("display_name not in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameBetween(String value1, String value2) {
            addCriterion("display_name between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotBetween(String value1, String value2) {
            addCriterion("display_name not between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andUserPrincipalnameIsNull() {
            addCriterion("user_principalname is null");
            return (Criteria) this;
        }

        public Criteria andUserPrincipalnameIsNotNull() {
            addCriterion("user_principalname is not null");
            return (Criteria) this;
        }

        public Criteria andUserPrincipalnameEqualTo(String value) {
            addCriterion("user_principalname =", value, "userPrincipalname");
            return (Criteria) this;
        }

        public Criteria andUserPrincipalnameNotEqualTo(String value) {
            addCriterion("user_principalname <>", value, "userPrincipalname");
            return (Criteria) this;
        }

        public Criteria andUserPrincipalnameGreaterThan(String value) {
            addCriterion("user_principalname >", value, "userPrincipalname");
            return (Criteria) this;
        }

        public Criteria andUserPrincipalnameGreaterThanOrEqualTo(String value) {
            addCriterion("user_principalname >=", value, "userPrincipalname");
            return (Criteria) this;
        }

        public Criteria andUserPrincipalnameLessThan(String value) {
            addCriterion("user_principalname <", value, "userPrincipalname");
            return (Criteria) this;
        }

        public Criteria andUserPrincipalnameLessThanOrEqualTo(String value) {
            addCriterion("user_principalname <=", value, "userPrincipalname");
            return (Criteria) this;
        }

        public Criteria andUserPrincipalnameLike(String value) {
            addCriterion("user_principalname like", value, "userPrincipalname");
            return (Criteria) this;
        }

        public Criteria andUserPrincipalnameNotLike(String value) {
            addCriterion("user_principalname not like", value, "userPrincipalname");
            return (Criteria) this;
        }

        public Criteria andUserPrincipalnameIn(List<String> values) {
            addCriterion("user_principalname in", values, "userPrincipalname");
            return (Criteria) this;
        }

        public Criteria andUserPrincipalnameNotIn(List<String> values) {
            addCriterion("user_principalname not in", values, "userPrincipalname");
            return (Criteria) this;
        }

        public Criteria andUserPrincipalnameBetween(String value1, String value2) {
            addCriterion("user_principalname between", value1, value2, "userPrincipalname");
            return (Criteria) this;
        }

        public Criteria andUserPrincipalnameNotBetween(String value1, String value2) {
            addCriterion("user_principalname not between", value1, value2, "userPrincipalname");
            return (Criteria) this;
        }

        public Criteria andLastLogonIsNull() {
            addCriterion("last_logon is null");
            return (Criteria) this;
        }

        public Criteria andLastLogonIsNotNull() {
            addCriterion("last_logon is not null");
            return (Criteria) this;
        }

        public Criteria andLastLogonEqualTo(String value) {
            addCriterion("last_logon =", value, "lastLogon");
            return (Criteria) this;
        }

        public Criteria andLastLogonNotEqualTo(String value) {
            addCriterion("last_logon <>", value, "lastLogon");
            return (Criteria) this;
        }

        public Criteria andLastLogonGreaterThan(String value) {
            addCriterion("last_logon >", value, "lastLogon");
            return (Criteria) this;
        }

        public Criteria andLastLogonGreaterThanOrEqualTo(String value) {
            addCriterion("last_logon >=", value, "lastLogon");
            return (Criteria) this;
        }

        public Criteria andLastLogonLessThan(String value) {
            addCriterion("last_logon <", value, "lastLogon");
            return (Criteria) this;
        }

        public Criteria andLastLogonLessThanOrEqualTo(String value) {
            addCriterion("last_logon <=", value, "lastLogon");
            return (Criteria) this;
        }

        public Criteria andLastLogonLike(String value) {
            addCriterion("last_logon like", value, "lastLogon");
            return (Criteria) this;
        }

        public Criteria andLastLogonNotLike(String value) {
            addCriterion("last_logon not like", value, "lastLogon");
            return (Criteria) this;
        }

        public Criteria andLastLogonIn(List<String> values) {
            addCriterion("last_logon in", values, "lastLogon");
            return (Criteria) this;
        }

        public Criteria andLastLogonNotIn(List<String> values) {
            addCriterion("last_logon not in", values, "lastLogon");
            return (Criteria) this;
        }

        public Criteria andLastLogonBetween(String value1, String value2) {
            addCriterion("last_logon between", value1, value2, "lastLogon");
            return (Criteria) this;
        }

        public Criteria andLastLogonNotBetween(String value1, String value2) {
            addCriterion("last_logon not between", value1, value2, "lastLogon");
            return (Criteria) this;
        }

        public Criteria andLastLogonOffIsNull() {
            addCriterion("last_logon_off is null");
            return (Criteria) this;
        }

        public Criteria andLastLogonOffIsNotNull() {
            addCriterion("last_logon_off is not null");
            return (Criteria) this;
        }

        public Criteria andLastLogonOffEqualTo(String value) {
            addCriterion("last_logon_off =", value, "lastLogonOff");
            return (Criteria) this;
        }

        public Criteria andLastLogonOffNotEqualTo(String value) {
            addCriterion("last_logon_off <>", value, "lastLogonOff");
            return (Criteria) this;
        }

        public Criteria andLastLogonOffGreaterThan(String value) {
            addCriterion("last_logon_off >", value, "lastLogonOff");
            return (Criteria) this;
        }

        public Criteria andLastLogonOffGreaterThanOrEqualTo(String value) {
            addCriterion("last_logon_off >=", value, "lastLogonOff");
            return (Criteria) this;
        }

        public Criteria andLastLogonOffLessThan(String value) {
            addCriterion("last_logon_off <", value, "lastLogonOff");
            return (Criteria) this;
        }

        public Criteria andLastLogonOffLessThanOrEqualTo(String value) {
            addCriterion("last_logon_off <=", value, "lastLogonOff");
            return (Criteria) this;
        }

        public Criteria andLastLogonOffLike(String value) {
            addCriterion("last_logon_off like", value, "lastLogonOff");
            return (Criteria) this;
        }

        public Criteria andLastLogonOffNotLike(String value) {
            addCriterion("last_logon_off not like", value, "lastLogonOff");
            return (Criteria) this;
        }

        public Criteria andLastLogonOffIn(List<String> values) {
            addCriterion("last_logon_off in", values, "lastLogonOff");
            return (Criteria) this;
        }

        public Criteria andLastLogonOffNotIn(List<String> values) {
            addCriterion("last_logon_off not in", values, "lastLogonOff");
            return (Criteria) this;
        }

        public Criteria andLastLogonOffBetween(String value1, String value2) {
            addCriterion("last_logon_off between", value1, value2, "lastLogonOff");
            return (Criteria) this;
        }

        public Criteria andLastLogonOffNotBetween(String value1, String value2) {
            addCriterion("last_logon_off not between", value1, value2, "lastLogonOff");
            return (Criteria) this;
        }

        public Criteria andSamAccountNameIsNull() {
            addCriterion("sam_account_name is null");
            return (Criteria) this;
        }

        public Criteria andSamAccountNameIsNotNull() {
            addCriterion("sam_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andSamAccountNameEqualTo(String value) {
            addCriterion("sam_account_name =", value, "samAccountName");
            return (Criteria) this;
        }

        public Criteria andSamAccountNameNotEqualTo(String value) {
            addCriterion("sam_account_name <>", value, "samAccountName");
            return (Criteria) this;
        }

        public Criteria andSamAccountNameGreaterThan(String value) {
            addCriterion("sam_account_name >", value, "samAccountName");
            return (Criteria) this;
        }

        public Criteria andSamAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("sam_account_name >=", value, "samAccountName");
            return (Criteria) this;
        }

        public Criteria andSamAccountNameLessThan(String value) {
            addCriterion("sam_account_name <", value, "samAccountName");
            return (Criteria) this;
        }

        public Criteria andSamAccountNameLessThanOrEqualTo(String value) {
            addCriterion("sam_account_name <=", value, "samAccountName");
            return (Criteria) this;
        }

        public Criteria andSamAccountNameLike(String value) {
            addCriterion("sam_account_name like", value, "samAccountName");
            return (Criteria) this;
        }

        public Criteria andSamAccountNameNotLike(String value) {
            addCriterion("sam_account_name not like", value, "samAccountName");
            return (Criteria) this;
        }

        public Criteria andSamAccountNameIn(List<String> values) {
            addCriterion("sam_account_name in", values, "samAccountName");
            return (Criteria) this;
        }

        public Criteria andSamAccountNameNotIn(List<String> values) {
            addCriterion("sam_account_name not in", values, "samAccountName");
            return (Criteria) this;
        }

        public Criteria andSamAccountNameBetween(String value1, String value2) {
            addCriterion("sam_account_name between", value1, value2, "samAccountName");
            return (Criteria) this;
        }

        public Criteria andSamAccountNameNotBetween(String value1, String value2) {
            addCriterion("sam_account_name not between", value1, value2, "samAccountName");
            return (Criteria) this;
        }

        public Criteria andPwdLastSetIsNull() {
            addCriterion("pwd_last_set is null");
            return (Criteria) this;
        }

        public Criteria andPwdLastSetIsNotNull() {
            addCriterion("pwd_last_set is not null");
            return (Criteria) this;
        }

        public Criteria andPwdLastSetEqualTo(String value) {
            addCriterion("pwd_last_set =", value, "pwdLastSet");
            return (Criteria) this;
        }

        public Criteria andPwdLastSetNotEqualTo(String value) {
            addCriterion("pwd_last_set <>", value, "pwdLastSet");
            return (Criteria) this;
        }

        public Criteria andPwdLastSetGreaterThan(String value) {
            addCriterion("pwd_last_set >", value, "pwdLastSet");
            return (Criteria) this;
        }

        public Criteria andPwdLastSetGreaterThanOrEqualTo(String value) {
            addCriterion("pwd_last_set >=", value, "pwdLastSet");
            return (Criteria) this;
        }

        public Criteria andPwdLastSetLessThan(String value) {
            addCriterion("pwd_last_set <", value, "pwdLastSet");
            return (Criteria) this;
        }

        public Criteria andPwdLastSetLessThanOrEqualTo(String value) {
            addCriterion("pwd_last_set <=", value, "pwdLastSet");
            return (Criteria) this;
        }

        public Criteria andPwdLastSetLike(String value) {
            addCriterion("pwd_last_set like", value, "pwdLastSet");
            return (Criteria) this;
        }

        public Criteria andPwdLastSetNotLike(String value) {
            addCriterion("pwd_last_set not like", value, "pwdLastSet");
            return (Criteria) this;
        }

        public Criteria andPwdLastSetIn(List<String> values) {
            addCriterion("pwd_last_set in", values, "pwdLastSet");
            return (Criteria) this;
        }

        public Criteria andPwdLastSetNotIn(List<String> values) {
            addCriterion("pwd_last_set not in", values, "pwdLastSet");
            return (Criteria) this;
        }

        public Criteria andPwdLastSetBetween(String value1, String value2) {
            addCriterion("pwd_last_set between", value1, value2, "pwdLastSet");
            return (Criteria) this;
        }

        public Criteria andPwdLastSetNotBetween(String value1, String value2) {
            addCriterion("pwd_last_set not between", value1, value2, "pwdLastSet");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateIsNull() {
            addCriterion("gmt_update is null");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateIsNotNull() {
            addCriterion("gmt_update is not null");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateEqualTo(Date value) {
            addCriterion("gmt_update =", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateNotEqualTo(Date value) {
            addCriterion("gmt_update <>", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateGreaterThan(Date value) {
            addCriterion("gmt_update >", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_update >=", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateLessThan(Date value) {
            addCriterion("gmt_update <", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_update <=", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateIn(List<Date> values) {
            addCriterion("gmt_update in", values, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateNotIn(List<Date> values) {
            addCriterion("gmt_update not in", values, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateBetween(Date value1, Date value2) {
            addCriterion("gmt_update between", value1, value2, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_update not between", value1, value2, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(String value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(String value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(String value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(String value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(String value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(String value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLike(String value) {
            addCriterion("user_status like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotLike(String value) {
            addCriterion("user_status not like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<String> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<String> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(String value1, String value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(String value1, String value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(username) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLikeInsensitive(String value) {
            addCriterion("upper(display_name) like", value.toUpperCase(), "displayName");
            return (Criteria) this;
        }

        public Criteria andUserPrincipalnameLikeInsensitive(String value) {
            addCriterion("upper(user_principalname) like", value.toUpperCase(), "userPrincipalname");
            return (Criteria) this;
        }

        public Criteria andLastLogonLikeInsensitive(String value) {
            addCriterion("upper(last_logon) like", value.toUpperCase(), "lastLogon");
            return (Criteria) this;
        }

        public Criteria andLastLogonOffLikeInsensitive(String value) {
            addCriterion("upper(last_logon_off) like", value.toUpperCase(), "lastLogonOff");
            return (Criteria) this;
        }

        public Criteria andSamAccountNameLikeInsensitive(String value) {
            addCriterion("upper(sam_account_name) like", value.toUpperCase(), "samAccountName");
            return (Criteria) this;
        }

        public Criteria andPwdLastSetLikeInsensitive(String value) {
            addCriterion("upper(pwd_last_set) like", value.toUpperCase(), "pwdLastSet");
            return (Criteria) this;
        }

        public Criteria andUserStatusLikeInsensitive(String value) {
            addCriterion("upper(user_status) like", value.toUpperCase(), "userStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}