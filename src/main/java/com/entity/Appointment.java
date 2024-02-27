package com.entity;

public class Appointment {
	private int id;
	private int userId;
	private String firstName;
	private String lastName;
	private String gender;
	private String age;
	private String appoinDate;
	private String appoinTime;
	private String email;
	private String phNo;
	private String diseases;
	private int doctorId;
	private String address;
	private String status;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(int userId, String firstName,String lastName, String gender, String age, String appoinDate,String appoinTime, String email,
			String phNo, String diseases, int doctorId, String address, String status) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.appoinDate = appoinDate;
		this.appoinTime = appoinTime;
		this.email = email;
		this.phNo = phNo;
		this.diseases = diseases;
		this.doctorId = doctorId;
		this.address = address;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAppoinDate() {
		return appoinDate;
	}

	public void setAppoinDate(String appoinDate) {
		this.appoinDate = appoinDate;
	}

	public String getAppoinTime() {
		return appoinTime;
	}

	public void setAppoinTime(String appoinTime) {
		this.appoinTime = appoinTime;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public String getDiseases() {
		return diseases;
	}

	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}