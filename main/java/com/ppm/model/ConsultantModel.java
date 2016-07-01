package com.ppm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="consultant")
public class ConsultantModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	@Override
	public String toString() {
		return "ConsultantModel [consultantid=" + consultantid + ", projectid=" + projectid + ", consultant="
				+ consultant + ", role=" + role + ", duration=" + duration + "]";
	}
	
	
	
}
