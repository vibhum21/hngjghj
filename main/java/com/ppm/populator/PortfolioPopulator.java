package com.ppm.populator;

import org.springframework.stereotype.Component;

import com.ppm.dto.PortfolioDto;
import com.ppm.model.PortfolioModel;

@Component
public class PortfolioPopulator {
	public void populate(PortfolioModel portfolioModel,PortfolioDto portfolioDto){
		portfolioDto.setProjectid(portfolioModel.getProjectid());
		portfolioDto.setName(portfolioModel.getName());
		portfolioDto.setBudget(portfolioModel.getBudget());
		portfolioDto.setOwner(portfolioModel.getOwner());
	}
	
	public void populate(PortfolioDto portfolioDto,PortfolioModel portfolioModel){
		
		portfolioModel.setProjectid(portfolioDto.getProjectid());
		portfolioModel.setName(portfolioDto.getName());
		portfolioModel.setBudget(portfolioDto.getBudget());
		portfolioModel.setOwner(portfolioDto.getOwner());
	}
}
