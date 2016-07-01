package com.ppm.service;

import java.util.List;

import com.ppm.dto.ProjectEventDto;



public interface ProjectEventService {
	public void addProjectEvent(ProjectEventDto projectEvent);
	//public void updateProjectEvent(ProjectEventDto projectEvent);
	public List<ProjectEventDto> getAllProjectEvent();
	//public void deleteProjectEvent(int id);
	public ProjectEventDto getProjectEvent(int id);
}
