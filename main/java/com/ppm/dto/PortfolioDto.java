package com.ppm.dto;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@XmlRootElement
@Component
public class PortfolioDto {
	private int projectid;
	private String name;
	private double budget;
	private String Owner;
	
	public PortfolioDto(){
	}
	
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

	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}

	public PortfolioDto(int projectid, String name, double budget, String owner) {
		super();
		this.projectid = projectid;
		this.name = name;
		this.budget = budget;
		Owner = owner;
	}
	
	
	
}
