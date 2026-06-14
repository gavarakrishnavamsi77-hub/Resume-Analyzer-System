package com.GQT.resumeProject;

public class Resume {

	private String name;
	private String skill;
	private String email;
	private String number;
	public Resume(String name,String skill,String email,String number) {
		this.name=name;
		this.skill=skill;
		this.email=email;
		this.number=number;
	}
	public String getName() {
		return name;
	}
	public String getSkill() {
		return skill;
	}
	public String getEmail() {
		return email;
	}
	public String getNumber() {
		return number;
	}
	@Override
	public String toString() {
		 return "Name   : " + name + "\n" +
		           "Email  : " + email + "\n" +
		           "Skills : " + skill + "\n" +
		           "Number :" + number;
	}
	

}
