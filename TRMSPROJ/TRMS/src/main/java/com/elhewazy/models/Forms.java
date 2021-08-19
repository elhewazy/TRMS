package com.elhewazy.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "forms")
public class Forms {
	@Id
	@Column(name = "form_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int FormId;
	@Column
	private String emplyeeName;
	@Column
	private String email;
	@Column
	private String coursType;
	@Column
	private String satrtingDate;
	@Column
	private String endingDate;
	@Column
	private String satrtingTime;
	@Column
	private String endingTime;
	@Column
	private double courseAmount;
	@Column
	private String emDpartment;
	@Column
	private String currentDate;
	@Column
	private String superapproval;
	@Column
	private String headapproval;
	@Column
	private String managerapproval;
	@Column
	private String nowAt;
	@Column
	private String sComm;
	@Column
	private String aComm;
	@Column
	private String mComm;
	@Column
	private String empC;

	public Forms() {
		super();
	}

	public Forms(int formId, String emplyeeName, String coursType, String satrtingDate, String endingDate,
			String satrtingTime, String endingTime, double courseAmount, String superapproval, String headapproval,
			String managerapproval, String nowAt, String emDpartment, String sComm, String aComm, String mComm) {
		super();
		FormId = formId;
		this.emplyeeName = emplyeeName;
		this.coursType = coursType;
		this.satrtingDate = satrtingDate;
		this.endingDate = endingDate;
		this.satrtingTime = satrtingTime;
		this.endingTime = endingTime;
		this.courseAmount = courseAmount;
		this.superapproval = superapproval;
		this.headapproval = headapproval;
		this.managerapproval = managerapproval;
		this.nowAt = nowAt;
		this.emDpartment = emDpartment;
		this.sComm = sComm;
		this.aComm = aComm;
		this.mComm = mComm;
	}

	public Forms(String emplyeeName) {
		super();
		this.emplyeeName = emplyeeName;
	}

	public int getFormId() {
		return FormId;
	}

	public void setFormId(int formId) {
		FormId = formId;
	}

	public String getEmplyeeName() {
		return emplyeeName;
	}

	public void setEmplyeeName(String emplyeeName) {
		this.emplyeeName = emplyeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCoursType() {
		return coursType;
	}

	public void setCoursType(String coursType) {
		this.coursType = coursType;
	}

	public String getSatrtingDate() {
		return satrtingDate;
	}

	public void setSatrtingDate(String satrtingDate) {
		this.satrtingDate = satrtingDate;
	}

	public String getEndingDate() {
		return endingDate;
	}

	public void setEndingDate(String endingDate) {
		this.endingDate = endingDate;
	}

	public String getSatrtingTime() {
		return satrtingTime;
	}

	public void setSatrtingTime(String satrtingTime) {
		this.satrtingTime = satrtingTime;
	}

	public String getEndingTime() {
		return endingTime;
	}

	public void setEndingTime(String endingTime) {
		this.endingTime = endingTime;
	}

	public double getCourseAmount() {
		return courseAmount;
	}

	public void setCourseAmount(double courseAmount) {
		this.courseAmount = courseAmount;
	}

	public String getSuperapproval() {
		return superapproval;
	}

	public void setSuperapproval(String superapproval) {
		this.superapproval = superapproval;
	}

	public String getHeadapproval() {
		return headapproval;
	}

	public void setHeadapproval(String headapproval) {
		this.headapproval = headapproval;
	}

	public String getManagerapproval() {
		return managerapproval;
	}

	public void setManagerapproval(String managerapproval) {
		this.managerapproval = managerapproval;
	}

	public String getNowAt() {
		return nowAt;
	}

	public void setNowAt(String nowAt) {
		this.nowAt = nowAt;
	}

	public String getEmDpartment() {
		return emDpartment;
	}

	public void setEmDpartment(String emDpartment) {
		this.emDpartment = emDpartment;
	}

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	public String getsComm() {
		return sComm;
	}

	public void setsComm(String sComm) {
		this.sComm = sComm;
	}

	public String getaComm() {
		return aComm;
	}

	public void setaComm(String aComm) {
		this.aComm = aComm;
	}

	public String getmComm() {
		return mComm;
	}

	public void setmComm(String mComm) {
		this.mComm = mComm;
	}

	public String getEmpC() {
		return empC;
	}

	public void setEmpC(String empC) {
		this.empC = empC;
	}

	@Override
	public String toString() {
		return "Forms [FormId=" + FormId + ", emplyeeName=" + emplyeeName + ", email=" + email + ", coursType="
				+ coursType + ", satrtingDate=" + satrtingDate + ", endingDate=" + endingDate + ", satrtingTime="
				+ satrtingTime + ", endingTime=" + endingTime + ", courseAmount=" + courseAmount + ", emDpartment="
				+ emDpartment + ", currentDate=" + currentDate + ", superapproval=" + superapproval + ", headapproval="
				+ headapproval + ", managerapproval=" + managerapproval + ", nowAt=" + nowAt + ", sComm=" + sComm
				+ ", aComm=" + aComm + ", mComm=" + mComm + ", empC=" + empC + "]";
	}

}
