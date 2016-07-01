package com.ppm.controller;

import java.util.List;
import com.ppm.dto.ProjectDto;

public interface ProjectController {
	public ProjectDto getProject(int projectid);
	public void deleteProject(int projectid);
	public ProjectDto addProject(ProjectDto projectDto);
	public ProjectDto updateProject(ProjectDto projectDto);
	public List<ProjectDto> getAllProject();
}
