package com.example.demo.entities;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name = "uid")
	int uid;
	
	@Column(name = "uname")
	String uname;
	
	@Column(name = "password")
	String password;
	
	@Column(name = "phone_no")
	String phone_no;
	
	@Column(name = "email")
	String email;
	
	@Column(name = "date_of_joining")
	Date date_of_joining;
	
	@Column(name = "experience")
	float experience;
	
	@Column(name = "expertise")
	String expertise;
	
	@Column(name = "designation")
	String designation;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="rid")
	@JsonIgnoreProperties("user")
	Role role;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int uid, String uname, String password, String phone_no, String email, Date date_of_joining,
			float experience, String expertise, String designation, Role role) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
		this.phone_no = phone_no;
		this.email = email;
		this.date_of_joining = date_of_joining;
		this.experience = experience;
		this.expertise = expertise;
		this.designation = designation;
		this.role = role;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", password=" + password + ", phone_no=" + phone_no
				+ ", email=" + email + ", date_of_joining=" + date_of_joining + ", experience=" + experience
				+ ", expertise=" + expertise + ", designation=" + designation + ", role=" + role + "]";
	}
	
	
}
