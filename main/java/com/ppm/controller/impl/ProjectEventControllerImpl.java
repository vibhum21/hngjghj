package com.ppm.controller.impl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.ppm.controller.ProjectEventController;
import com.ppm.dto.ProjectEventDto;
import com.ppm.populator.ProjectEventPopulator;
import com.ppm.service.ProjectEventService;



@Path("/projectEventController")
public class ProjectEventControllerImpl implements ProjectEventController {
	@Autowired 
	ProjectEventService projectEventService;
	
	@Autowired 
	ProjectEventPopulator projectEventPopulator;
	
	
	@GET
	@Path("/getAllProjectEvents")
	@Override
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProjectEventDto> getAllProjectEvent() {
		List<ProjectEventDto> pDto = (List<ProjectEventDto>) projectEventService.getAllProjectEvent();
		return pDto;
	}
	
	
	


	
	
	@POST
	@Path("/addProjectEvent")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public ProjectEventDto addProjectEvent(ProjectEventDto projectEventDto)
	{
		System.out.println("asdasdasdasd"+projectEventDto.getProjecteventid());
		//ProjectEventDto projectEventDto  = new  ProjectEventDto();
		//projectEventDto.setTitle("New Project");
		//projectEventDto.setDescription("12000 line of code");
		//projectEventDto.setType("Java EE");
		//projectEventDto.setResponse("Nice Project");
		//projectEventDto.setRespondedby("ruplesh");
		projectEventService.addProjectEvent(projectEventDto);
		System.out.println("Controller end...");
		System.out.println("Controller end...");
		
		return projectEventDto;
		}
	
	
	@GET
	@Path("/getProjectEvent/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public ProjectEventDto getProjectEvent(@PathParam("id") int id) {
		System.out.println("Inside getSingleEmployee Controller");
		ProjectEventDto projectEventDto = projectEventService.getProjectEvent(id);
		return projectEventDto;
	}

}
