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


import com.ppm.controller.PortfolioController;
import com.ppm.dto.PortfolioDto;
import com.ppm.populator.PortfolioPopulator;
import com.ppm.service.PortfolioService;

@Path("/portfolioController")
public class PortfolioControllerImpl implements PortfolioController{
	
	@Autowired 
	PortfolioService portfolioService;
	
	@Autowired 
	PortfolioPopulator portfolioPopulator;
	
	
	@GET
	@Path("/getAllPortfolio")
	@Override
	@Produces(MediaType.APPLICATION_JSON)
	public List<PortfolioDto> getAllPortfolio() {
		List<PortfolioDto> pDto = (List<PortfolioDto>) portfolioService.getAllPortfolio();
		return pDto;
	}
	
	
	


	
	
	@POST
	@Path("/addPortfolio")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public PortfolioDto addPortfolio(PortfolioDto portfolioDto1)
	{
		System.out.println("asdasdasdasd"+portfolioDto1.getProjectid());
		//PortfolioDto portfolioDto  = new  PortfolioDto();
		//portfolioDto.setName("New Project");
		//portfolioDto.setBudget(12000);
		System.out.println(portfolioDto1);
		//portfolioDto.setOwner("ruplesh");
		portfolioService.addPortfolio(portfolioDto1);
		System.out.println("Controller end...");
		System.out.println("Controller end...");
		
		return portfolioDto1;
		}
	
	
	@GET
	@Path("/getPortfolio/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public PortfolioDto getPortfolio(@PathParam("id") int id) {
		System.out.println("Inside getSingleEmployee Controller");
		PortfolioDto portfolioDto = portfolioService.getPortfolio(id);
		return portfolioDto;
	}

	

	@PUT
	@Path("/updatePortfolio")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public PortfolioDto updatePortfolio(PortfolioDto portfolio){
		
		portfolioService.updatePortfolio(portfolio);
		return portfolio;
	}



	@Override
	@DELETE
	@Path("/deletePortfolio/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
	public void deletePortfolio(@PathParam("id") int id) {
		portfolioService.deletePortfolio(id);
	}
	
	
}
