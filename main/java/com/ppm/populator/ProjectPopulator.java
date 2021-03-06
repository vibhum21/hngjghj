package com.ppm.populator;

import org.springframework.stereotype.Component;

import com.ppm.dto.ProjectDto;
import com.ppm.model.ProjectModel;


@Component
public class ProjectPopulator {
	public void populate(ProjectModel projectModel,ProjectDto projectDto){
		projectDto.setProjectid(projectModel.getProjectid());
		projectDto.setType(projectModel.getType());
		projectDto.setStartdate(projectModel.getStartdate());
		projectDto.setEnddate(projectModel.getEnddate());
		projectDto.setVisibleduration(projectModel.getVisibleduration());
		projectDto.setStatus(projectModel.getStatus());
		projectDto.setMethodology(projectModel.getMethodology());
		projectDto.setDescription(projectModel.getDescription());
		projectDto.setPm(projectModel.getPm());
		projectDto.setAm(projectModel.getAm());
		projectDto.setDm(projectModel.getDm());
		projectDto.setClient(projectModel.getClient());
		projectDto.setBudget(projectModel.getBudget());
		projectDto.setEstimatedeffort(projectModel.getEstimatedeffort());
		projectDto.setClientpoc(projectModel.getClientpoc());
		projectDto.setConsultant(projectModel.getConsultant());
		projectDto.setTools(projectModel.getTools());
		projectDto.setName(projectModel.getName());
	}
	
	public void populate(ProjectDto projectDto,ProjectModel projectModel){
		projectModel.setProjectid(projectDto.getProjectid());
		projectModel.setType(projectDto.getType());
		projectModel.setStartdate(projectDto.getStartdate());
		projectModel.setEnddate(projectDto.getEnddate());
		projectModel.setVisibleduration(projectDto.getVisibleduration());
		projectModel.setStatus(projectDto.getStatus());
		projectModel.setMethodology(projectDto.getMethodology());
		projectModel.setDescription(projectDto.getDescription());
		projectModel.setPm(projectDto.getPm());
		projectModel.setAm(projectDto.getAm());
		projectModel.setDm(projectDto.getDm());
		projectModel.setClient(projectDto.getClient());
		projectModel.setBudget(projectDto.getBudget());
		projectModel.setEstimatedeffort(projectDto.getEstimatedeffort());
		projectModel.setTools(projectDto.getTools());
		projectModel.setClientpoc(projectDto.getClientpoc());
		projectModel.setConsultant(projectDto.getConsultant());
		projectModel.setName(projectDto.getName());
	}
}
