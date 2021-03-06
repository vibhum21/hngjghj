package com.ppm.dto;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@XmlRootElement
@Component
public class ProjectEventDto {
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
	
	public ProjectEventDto(int projecteventid, String title, String description, String type, String response,
			String respondedby, int projectid) {
		super();
		this.projecteventid = projecteventid;
		this.title = title;
		this.description = description;
		this.type = type;
		this.response = response;
		this.respondedby = respondedby;
		this.projectid = projectid;
	}
	public ProjectEventDto() {
		
	}
	
	
}
