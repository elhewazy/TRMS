package com.elhewazy.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Emplyee {
	@Id
	@Column(name = "emplyee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "first_name")
	private String fName;
	@Column(name = "last_name")
	private String lName;
	@Column
	private String department;
	@Column
	private String email;// pendingR awardedR
	@Column
	private String position;
	@Column
	private double pendingR;
	@Column
	private double awardedR;
	@Column(columnDefinition = "int default 1000")
	private double avMoney;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "emplyee_forms", joinColumns = { @JoinColumn(name = "emplyee_id") }, inverseJoinColumns = {
			@JoinColumn(name = "form_id") })
	private List<Forms> emplyeeForms = new ArrayList<Forms>();

	public Emplyee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getPendingR() {
		return pendingR;
	}

	public void setPendingR(double pendingR) {
		this.pendingR = pendingR;
	}

	public double getAwardedR() {
		return awardedR;
	}

	public void setAwardedR(double awardedR) {
		this.awardedR = awardedR;
	}

	public double getAvMoney() {
		return avMoney;
	}

	public void setAvMoney(double avMoney) {
		this.avMoney = avMoney;
	}

	public List<Forms> getEmplyeeForms() {
		return emplyeeForms;
	}

	public void setEmplyeeForms(List<Forms> emplyeeForms) {
		this.emplyeeForms = emplyeeForms;
	}

	@Override
	public String toString() {
		return "Emplyee [id=" + id + ", fName=" + fName + ", lName=" + lName + ", department=" + department
				+ ", position=" + position + ", pendingR=" + pendingR + ", awardedR=" + awardedR + ", avMoney="
				+ avMoney + ", emplyeeForms=" + emplyeeForms + "]";
	}

}