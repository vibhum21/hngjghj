package com.ppm.controller.impl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.ppm.controller.ProjectController;

import com.ppm.dto.ProjectDto;

import com.ppm.populator.ProjectPopulator;

import com.ppm.service.ProjectService;

@Path("/projectController")
public class ProjectControllerImpl implements ProjectController {
	@Autowired 
	ProjectService projectService;
	
	@Autowired 
	ProjectPopulator projectPopulator;
	
	
	@GET
	@Path("/getAllProject")
	@Override
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProjectDto> getAllProject() {
		List<ProjectDto> pDto = (List<ProjectDto>) projectService.getAllProject();
		return pDto;
	}
	
	
	


	
	
	@POST
	@Path("/addProject")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public ProjectDto addProject(ProjectDto projectDto1)
	{
		System.out.println("asdasdasdasd"+projectDto1.getProjectid());
		//PortfolioDto portfolioDto  = new  PortfolioDto();
		//portfolioDto.setName("New Project");
		//portfolioDto.setBudget(12000);
		System.out.println(projectDto1);
		//portfolioDto.setOwner("ruplesh");
		projectService.addProject(projectDto1);
		System.out.println("Controller end...");
		System.out.println("Controller end...");
		
		return projectDto1;
		}
	
	
	@GET
	@Path("/getProject/{projectid}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public ProjectDto getProject(@PathParam("projectid") int projectid) {
		System.out.println("Inside getSingleProject Controller");
		ProjectDto projectDto = projectService.getProject(projectid);
		return projectDto;
	}

	

	@PUT
	@Path("/updateProject")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public ProjectDto updateProject(ProjectDto project){
		
		projectService.updateProject(project);
		return project;
	}



	@Override
	@DELETE
	@Path("/deleteProject/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
	public void deleteProject(@PathParam("id") int id) {
		projectService.deleteProject(id);
	}
	
}
