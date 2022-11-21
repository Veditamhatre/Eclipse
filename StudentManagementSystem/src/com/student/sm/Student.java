package com.student.sm;

public class Student {
	
	private int s_id;
	private String s_name;
	private String s_contact;
	private String s_city;
	private String s_course;
	
	
	
	
	public int getS_id() {
		return s_id;
	}


	public void setS_id(int s_id) {
		this.s_id = s_id;
	}



	public String getS_name() {
		return s_name;
	}




	public void setS_name(String s_name) {
		this.s_name = s_name;
	}



	public String getS_contact() {
		return s_contact;
	}




	public void setS_contact(String s_contact) {
		this.s_contact = s_contact;
	}



	public String getS_city() {
		return s_city;
	}






	public void setS_city(String s_city) {
		this.s_city = s_city;
	}






	public String getS_course() {
		return s_course;
	}






	public void setS_course(String s_course) {
		this.s_course = s_course;
	}



	public Student(int s_id, String s_name, String s_contact, String s_city, String s_course) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_contact = s_contact;
		this.s_city = s_city;
		this.s_course=s_course;
	}

	
	public Student(String s_id, String s_name, String s_contact, String s_city, String s_course) {
		super();
		// TODO Auto-generated constructor stub
	}




	public Student(int s_contact2, int s_contact3, int s_contact4, int s_contact5, int s_contact6) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", s_contact=" + s_contact
				+ ", s_city=" + s_city + ",s_cousrourse" + s_course + "]";
	}



}

;

