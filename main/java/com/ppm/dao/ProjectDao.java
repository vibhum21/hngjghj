package com.ppm.dao;

import java.util.List;
import com.ppm.model.ProjectModel;

public interface ProjectDao {
	public void addProject(ProjectModel projectModel);
	public ProjectModel getProject(int projectid);
	public void updateProject(ProjectModel projectModel);
	public void deleteProject(int projectid);
	public List<ProjectModel> getAllProject();
}
