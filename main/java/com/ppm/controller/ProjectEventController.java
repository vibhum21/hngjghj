package com.ppm.controller;

import java.util.List;

import com.ppm.dto.ProjectEventDto;



public interface ProjectEventController {
	public List<ProjectEventDto> getAllProjectEvent();
	public ProjectEventDto getProjectEvent(int id);
	public ProjectEventDto addProjectEvent(ProjectEventDto projectEventDto);
	//public ProjectEventDto updateProjectEvent(ProjectEventDto projectEventDto);
	//public void deleteProjectEvent(int projecteventid);
}
