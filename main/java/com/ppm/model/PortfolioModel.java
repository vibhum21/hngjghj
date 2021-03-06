package com.ppm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="portfolio")
public class PortfolioModel {
	@Id
	/*@GeneratedValue(strategy=GenerationType.IDENTITY)*/
	private int projectid;
	private String name;
	private double budget;
	private String owner;
	
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
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "PortfolioModel [projectid=" + projectid + ", name=" + name + ", budget=" + budget + ", owner=" + owner
				+ "]";
	}
	
	
	
	
}
