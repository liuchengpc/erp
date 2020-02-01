package com.apatech.domain;

/**
 * 会计科目表
 * @author 刘成
 *
 */
public class Account {
    private String accountId;//科目id（主键 唯一）
    private String accountInvoicetypename;//发票类型名称
    private String accountEngname;//英文名称
    private String accountRemark;//备注
    private String accountAuditing;//是否审核
    private String accountYn;//是否删除（0 否 1 是 ，默认0）
    private String accountCustom1;//自定栏一
    private String accountCustom2;//自定栏二
    private String accountCustom3;//自定栏三
    private String accountCustom4;//自定栏四
    private String accountCustom5;//自定栏五
    private String accountCustom6;//自定栏六

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getAccountInvoicetypename() {
        return accountInvoicetypename;
    }

    public void setAccountInvoicetypename(String accountInvoicetypename) {
        this.accountInvoicetypename = accountInvoicetypename == null ? null : accountInvoicetypename.trim();
    }

    public String getAccountEngname() {
        return accountEngname;
    }

    public void setAccountEngname(String accountEngname) {
        this.accountEngname = accountEngname == null ? null : accountEngname.trim();
    }

    public String getAccountRemark() {
        return accountRemark;
    }

    public void setAccountRemark(String accountRemark) {
        this.accountRemark = accountRemark == null ? null : accountRemark.trim();
    }

    public String getAccountAuditing() {
        return accountAuditing;
    }

    public void setAccountAuditing(String accountAuditing) {
        this.accountAuditing = accountAuditing == null ? null : accountAuditing.trim();
    }

    public String getAccountYn() {
        return accountYn;
    }

    public void setAccountYn(String accountYn) {
        this.accountYn = accountYn == null ? null : accountYn.trim();
    }

    public String getAccountCustom1() {
        return accountCustom1;
    }

    public void setAccountCustom1(String accountCustom1) {
        this.accountCustom1 = accountCustom1 == null ? null : accountCustom1.trim();
    }

    public String getAccountCustom2() {
        return accountCustom2;
    }

    public void setAccountCustom2(String accountCustom2) {
        this.accountCustom2 = accountCustom2 == null ? null : accountCustom2.trim();
    }

    public String getAccountCustom3() {
        return accountCustom3;
    }

    public void setAccountCustom3(String accountCustom3) {
        this.accountCustom3 = accountCustom3 == null ? null : accountCustom3.trim();
    }

    public String getAccountCustom4() {
        return accountCustom4;
    }

    public void setAccountCustom4(String accountCustom4) {
        this.accountCustom4 = accountCustom4 == null ? null : accountCustom4.trim();
    }

    public String getAccountCustom5() {
        return accountCustom5;
    }

    public void setAccountCustom5(String accountCustom5) {
        this.accountCustom5 = accountCustom5 == null ? null : accountCustom5.trim();
    }

    public String getAccountCustom6() {
        return accountCustom6;
    }

    public void setAccountCustom6(String accountCustom6) {
        this.accountCustom6 = accountCustom6 == null ? null : accountCustom6.trim();
    }
}