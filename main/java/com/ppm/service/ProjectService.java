package com.ppm.service;

import java.util.List;
import com.ppm.dto.ProjectDto;

public interface ProjectService {
	public ProjectDto getProject(int projectid);
	public void addProject(ProjectDto projectDto);
	public void updateProject(ProjectDto projectDto);
	public void deleteProject(int projectid);
	public List<ProjectDto> getAllProject();
}
