package com.ppm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppm.dao.ProjectDao;

import com.ppm.dto.ProjectDto;

import com.ppm.model.ProjectModel;
import com.ppm.populator.ProjectPopulator;
import com.ppm.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{
	@Autowired
	ProjectDao projectDao;
	
	@Autowired
	ProjectPopulator projectPopulator;
	
	@Override
	public void addProject(ProjectDto projectDto) {
		ProjectModel projectModel = new ProjectModel();
		projectPopulator.populate(projectDto, projectModel);
		projectDao.addProject(projectModel);
	}
	@Override
	public void updateProject(ProjectDto projectDto) {
		ProjectModel projectModel = new ProjectModel();
		projectPopulator.populate(projectDto, projectModel);
		projectDao.updateProject(projectModel);
		
	}
	@Override
	public void deleteProject(int projectid) {
		// TODO Auto-generated method stub
		projectDao.deleteProject(projectid);
	}
	@Override
	public ProjectDto getProject(int projectid) {
		ProjectDto projectDto = new ProjectDto();
		projectPopulator.populate(projectDao.getProject(projectid),projectDto);
		return projectDto;
	}
	@Override
	public List<ProjectDto> getAllProject() {
		
		
		List<ProjectDto> projectDtoList = new ArrayList<>();
		List<ProjectModel> projectModelList  = (List<ProjectModel>) projectDao.getAllProject();
		
		
		for (ProjectModel projectModel : projectModelList) {
			ProjectDto projectDto = new ProjectDto();
			projectPopulator.populate(projectModel,projectDto);
			projectDtoList.add(projectDto);
		}
		
		return projectDtoList;
		
	}
}
