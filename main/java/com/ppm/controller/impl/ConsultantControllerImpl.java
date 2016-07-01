package com.ppm.controller.impl;

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

import com.ppm.controller.ConsultantController;
import com.ppm.dto.ConsultantDto;

import com.ppm.populator.ConsultantPopulator;
import com.ppm.service.ConsultantService;

@Path("/consultantController")
public class ConsultantControllerImpl implements ConsultantController {
	@Autowired
	ConsultantService consultantService;
	@Autowired
	ConsultantPopulator consultantPopulator;
	
	@GET
	@Path("/getAllConsultant")
	@Override
	@Produces(MediaType.APPLICATION_XML)
	public ConsultantDto getAllConsultant() {
		ConsultantDto cDto = consultantService.getAllConsultant();
		return cDto;
	}
	
	
	@POST
	@Path("/addConsultant")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public ConsultantDto addConsultant(ConsultantDto consultantDto1)
	{
		System.out.println("asdasdasdasd"+consultantDto1.getProjectid());
		ConsultantDto consultantDto  = new  ConsultantDto();
		consultantDto.setConsultantid(1);
		consultantDto.setProjectid(1);
		consultantDto.setConsultant("New Project");
		consultantDto.setDuration(13);
		
		consultantDto.setRole("ruplesh");
		consultantService.addConsultant(consultantDto);
		System.out.println("Controller end...");
		System.out.println("Controller end...");
		
		return consultantDto;
		}
	
	
	@GET
	@Path("/getConsultant/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public ConsultantDto getConsultant(@PathParam("id") int id) {
		System.out.println("Inside getSingleEmployee Controller");
		ConsultantDto consultantDto = consultantService.getConsultant(id);
		return consultantDto;
	}

	

	@PUT
	@Path("/updateConsultant")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public ConsultantDto updateConsultant(ConsultantDto consultant){
		
		consultantService.updateConsultant(consultant);
		return consultant;
	}



	@Override
	@DELETE
	@Path("/deleteConsultant/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
	public void deleteConsultant(@PathParam("id") int id) {
		consultantService.deleteConsultant(id);
	}
	
	
}
