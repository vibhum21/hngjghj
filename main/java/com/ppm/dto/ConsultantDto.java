package com.ppm.dto;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@XmlRootElement
@Component
public class ConsultantDto {
	private int consultantid;
	private int projectid;
	private String consultant;
	private String role;
	private double duration;
	public int getConsultantid() {
		return consultantid;
	}
	public void setConsultantid(int consultantid) {
		this.consultantid = consultantid;
	}
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getConsultant() {
		return consultant;
	}
	public void setConsultant(String consultant) {
		this.consultant = consultant;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public ConsultantDto(int consultantid, int projectid, String consultant, String role, double duration) {
		super();
		this.consultantid = consultantid;
		this.projectid = projectid;
		this.consultant = consultant;
		this.role = role;
		this.duration = duration;
	}
	public ConsultantDto() {
		
	}
	
	
	
	
}
