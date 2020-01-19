package com.apatech.domain;

/**
 * 物料类型表
 * @author 刘成
 *
 */
public class Material_type {
    private String mtId;//物料类型id（主键 唯一）
    private String mtName;//类型名称
    private String mtEnglishName;//英文名称
    private String mtSaveSubject;//存货科目
    private String mtSubjectA;//科目a
    private String mtSubjectB;//科目b
    private String mtSubjectC;//varchar(50)	科目c
    private String mtSaleinSubject;//销售收入科目
    private String mtSalecostSubject;//销售成本科目
    private String mtOtherinSubject;//其他收入科目
    private String mtOthercostSubject;//其他成本科目
    private String mtOthersellSubject;//其他费用科目
    private String mtOthersendSubject;//赠品费用科目
    private String mtRemark;//备注
    private String mtAuditing;//是否审核
    private String mtYn;//是否删除（0 否 1 是 ，默认0）
    private String mtCustom1;//自定栏1
    private String mtCustom2;//自定栏2
    private String mtCustom3;//自定栏3
    private String mtCustom4;//自定栏4
    private String mtCustom5;//自定栏5
    private String mtCustom6;//自定栏6
    
    

    public Material_type() {
		super();
	}

	@Override
	public String toString() {
		return "Material_type [mtId=" + mtId + ", mtName=" + mtName + ", mtEnglishName=" + mtEnglishName
				+ ", mtSaveSubject=" + mtSaveSubject + ", mtSubjectA=" + mtSubjectA + ", mtSubjectB=" + mtSubjectB
				+ ", mtSubjectC=" + mtSubjectC + ", mtSaleinSubject=" + mtSaleinSubject + ", mtSalecostSubject="
				+ mtSalecostSubject + ", mtOtherinSubject=" + mtOtherinSubject + ", mtOthercostSubject="
				+ mtOthercostSubject + ", mtOthersellSubject=" + mtOthersellSubject + ", mtOthersendSubject="
				+ mtOthersendSubject + ", mtRemark=" + mtRemark + ", mtAuditing=" + mtAuditing + ", mtYn=" + mtYn
				+ ", mtCustom1=" + mtCustom1 + ", mtCustom2=" + mtCustom2 + ", mtCustom3=" + mtCustom3 + ", mtCustom4="
				+ mtCustom4 + ", mtCustom5=" + mtCustom5 + ", mtCustom6=" + mtCustom6 + "]";
	}

	public String getMtId() {
        return mtId;
    }

    public void setMtId(String mtId) {
        this.mtId = mtId == null ? null : mtId.trim();
    }

    public String getMtName() {
        return mtName;
    }

    public void setMtName(String mtName) {
        this.mtName = mtName == null ? null : mtName.trim();
    }

    public String getMtEnglishName() {
        return mtEnglishName;
    }

    public void setMtEnglishName(String mtEnglishName) {
        this.mtEnglishName = mtEnglishName == null ? null : mtEnglishName.trim();
    }

    public String getMtSaveSubject() {
        return mtSaveSubject;
    }

    public void setMtSaveSubject(String mtSaveSubject) {
        this.mtSaveSubject = mtSaveSubject == null ? null : mtSaveSubject.trim();
    }

    public String getMtSubjectA() {
        return mtSubjectA;
    }

    public void setMtSubjectA(String mtSubjectA) {
        this.mtSubjectA = mtSubjectA == null ? null : mtSubjectA.trim();
    }

    public String getMtSubjectB() {
        return mtSubjectB;
    }

    public void setMtSubjectB(String mtSubjectB) {
        this.mtSubjectB = mtSubjectB == null ? null : mtSubjectB.trim();
    }

    public String getMtSubjectC() {
        return mtSubjectC;
    }

    public void setMtSubjectC(String mtSubjectC) {
        this.mtSubjectC = mtSubjectC == null ? null : mtSubjectC.trim();
    }

    public String getMtSaleinSubject() {
        return mtSaleinSubject;
    }

    public void setMtSaleinSubject(String mtSaleinSubject) {
        this.mtSaleinSubject = mtSaleinSubject == null ? null : mtSaleinSubject.trim();
    }

    public String getMtSalecostSubject() {
        return mtSalecostSubject;
    }

    public void setMtSalecostSubject(String mtSalecostSubject) {
        this.mtSalecostSubject = mtSalecostSubject == null ? null : mtSalecostSubject.trim();
    }

    public String getMtOtherinSubject() {
        return mtOtherinSubject;
    }

    public void setMtOtherinSubject(String mtOtherinSubject) {
        this.mtOtherinSubject = mtOtherinSubject == null ? null : mtOtherinSubject.trim();
    }

    public String getMtOthercostSubject() {
        return mtOthercostSubject;
    }

    public void setMtOthercostSubject(String mtOthercostSubject) {
        this.mtOthercostSubject = mtOthercostSubject == null ? null : mtOthercostSubject.trim();
    }

    public String getMtOthersellSubject() {
        return mtOthersellSubject;
    }

    public void setMtOthersellSubject(String mtOthersellSubject) {
        this.mtOthersellSubject = mtOthersellSubject == null ? null : mtOthersellSubject.trim();
    }

    public String getMtOthersendSubject() {
        return mtOthersendSubject;
    }

    public void setMtOthersendSubject(String mtOthersendSubject) {
        this.mtOthersendSubject = mtOthersendSubject == null ? null : mtOthersendSubject.trim();
    }

    public String getMtRemark() {
        return mtRemark;
    }

    public void setMtRemark(String mtRemark) {
        this.mtRemark = mtRemark == null ? null : mtRemark.trim();
    }

    public String getMtAuditing() {
        return mtAuditing;
    }

    public void setMtAuditing(String mtAuditing) {
        this.mtAuditing = mtAuditing == null ? null : mtAuditing.trim();
    }

    public String getMtYn() {
        return mtYn;
    }

    public void setMtYn(String mtYn) {
        this.mtYn = mtYn == null ? null : mtYn.trim();
    }

    public String getMtCustom1() {
        return mtCustom1;
    }

    public void setMtCustom1(String mtCustom1) {
        this.mtCustom1 = mtCustom1 == null ? null : mtCustom1.trim();
    }

    public String getMtCustom2() {
        return mtCustom2;
    }

    public void setMtCustom2(String mtCustom2) {
        this.mtCustom2 = mtCustom2 == null ? null : mtCustom2.trim();
    }

    public String getMtCustom3() {
        return mtCustom3;
    }

    public void setMtCustom3(String mtCustom3) {
        this.mtCustom3 = mtCustom3 == null ? null : mtCustom3.trim();
    }

    public String getMtCustom4() {
        return mtCustom4;
    }

    public void setMtCustom4(String mtCustom4) {
        this.mtCustom4 = mtCustom4 == null ? null : mtCustom4.trim();
    }

    public String getMtCustom5() {
        return mtCustom5;
    }

    public void setMtCustom5(String mtCustom5) {
        this.mtCustom5 = mtCustom5 == null ? null : mtCustom5.trim();
    }

    public String getMtCustom6() {
        return mtCustom6;
    }

    public void setMtCustom6(String mtCustom6) {
        this.mtCustom6 = mtCustom6 == null ? null : mtCustom6.trim();
    }
}