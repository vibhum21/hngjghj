package com.ppm.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class ProjectModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int projectid;
	private String name;
	private String type;
	private Date startdate;
	private Date enddate;
	private int visibleduration;
	private String status;
	private String methodology;
	private String description;
	private String pm;
	private String dm;
	private String am;
	private String client;
	private double budget;
	private String estimatedeffort;
	private String tools;
	private String consultant;
	private String clientpoc;
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public int getVisibleduration() {
		return visibleduration;
	}
	public void setVisibleduration(int visibleduration) {
		this.visibleduration = visibleduration;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMethodology() {
		return methodology;
	}
	public void setMethodology(String methodology) {
		this.methodology = methodology;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPm() {
		return pm;
	}
	public void setPm(String pm) {
		this.pm = pm;
	}
	public String getDm() {
		return dm;
	}
	public void setDm(String dm) {
		this.dm = dm;
	}
	public String getAm() {
		return am;
	}
	public void setAm(String am) {
		this.am = am;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public String getEstimatedeffort() {
		return estimatedeffort;
	}
	public void setEstimatedeffort(String estimatedeffort) {
		this.estimatedeffort = estimatedeffort;
	}
	public String getTools() {
		return tools;
	}
	public void setTools(String tools) {
		this.tools = tools;
	}
	public String getConsultant() {
		return consultant;
	}
	public void setConsultant(String consultant) {
		this.consultant = consultant;
	}
	public String getClientpoc() {
		return clientpoc;
	}
	public void setClientpoc(String clientpoc) {
		this.clientpoc = clientpoc;
	}
	@Override
	public String toString() {
		return "ProjectModel [projectid=" + projectid + ", name=" + name + ", type=" + type + ", startdate=" + startdate
				+ ", enddate=" + enddate + ", visibleduration=" + visibleduration + ", status=" + status
				+ ", methodology=" + methodology + ", description=" + description + ", pm=" + pm + ", dm=" + dm
				+ ", am=" + am + ", client=" + client + ", budget=" + budget + ", estimatedeffort=" + estimatedeffort
				+ ", tools=" + tools + ", consultant=" + consultant + ", clientpoc=" + clientpoc + "]";
	}
	
	
	
	
}
