package com.ppm.dao;

import java.util.List;

import com.ppm.model.ProjectEventModel;



public interface ProjectEventDao {
	public List<ProjectEventModel> getAllProjectEvent();
	public void addProjectEvent(ProjectEventModel projectEvent);
	//public void updateProjectEvent(ProjectEventModel projectEvent);
	//public void deleteProjectEvent(int id);
	public ProjectEventModel getProjectEvent(int id);
}
