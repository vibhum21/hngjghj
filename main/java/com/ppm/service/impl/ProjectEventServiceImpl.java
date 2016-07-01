package com.ppm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppm.dao.PortfolioDao;
import com.ppm.dao.ProjectEventDao;
import com.ppm.dto.PortfolioDto;
import com.ppm.dto.ProjectEventDto;
import com.ppm.model.PortfolioModel;
import com.ppm.model.ProjectEventModel;
import com.ppm.populator.PortfolioPopulator;
import com.ppm.populator.ProjectEventPopulator;
import com.ppm.service.ProjectEventService;

@Service
public class ProjectEventServiceImpl implements ProjectEventService{
	@Autowired
	ProjectEventDao projectEventDao;
	
	@Autowired
	ProjectEventPopulator projectEventPopulator;
	
	@Override
	public List<ProjectEventDto> getAllProjectEvent() {
		
		
		List<ProjectEventDto> projectEventDtoList = new ArrayList<>();
		List<ProjectEventModel> projectEventModelList  = (List<ProjectEventModel>) projectEventDao.getAllProjectEvent();
		
		
		for (ProjectEventModel projectEventModel : projectEventModelList) {
			ProjectEventDto projectEventDto = new ProjectEventDto();
			projectEventPopulator.populate(projectEventModel,projectEventDto);
			projectEventDtoList.add(projectEventDto);
		}
		
		return projectEventDtoList;
		
	}
	
	@Override
	public void addProjectEvent(ProjectEventDto projectEventDto) {
		ProjectEventModel projectEventModel = new ProjectEventModel();
		projectEventPopulator.populate(projectEventDto, projectEventModel);
		projectEventDao.addProjectEvent(projectEventModel);
		
	}
	
	
	@Override
	public ProjectEventDto getProjectEvent(int id) {
		ProjectEventDto projectEventDto = new ProjectEventDto();
		projectEventPopulator.populate(projectEventDao.getProjectEvent(id),projectEventDto);
		return projectEventDto;
	}
	
}
