package com.ppm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="projectevents")
public class ProjectEventModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int projecteventid;
	private String title;
	private String description;
	private String type;
	private String response;
	private String respondedby;
	private int projectid;
	
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public int getProjecteventid() {
		return projecteventid;
	}
	public void setProjecteventid(int projecteventid) {
		this.projecteventid = projecteventid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public String getRespondedby() {
		return respondedby;
	}
	public void setRespondedby(String respondedby) {
		this.respondedby = respondedby;
	}
	@Override
	public String toString() {
		return "ProjectEventModel [projecteventid=" + projecteventid + ", title=" + title + ", description="
				+ description + ", type=" + type + ", response=" + response + ", respondedby=" + respondedby
				+ ", projectid=" + projectid + "]";
	}
	
	
	
	
}
