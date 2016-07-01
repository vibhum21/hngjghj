package com.ppm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppm.dao.PortfolioDao;
import com.ppm.dto.PortfolioDto;
import com.ppm.model.PortfolioModel;
import com.ppm.populator.PortfolioPopulator;
import com.ppm.service.PortfolioService;

@Service
public class PortfolioServiceImpl implements PortfolioService {
	
	@Autowired
	PortfolioDao portfolioDao;
	
	@Autowired
	PortfolioPopulator portfolioPopulator;
	
	@Override
	public List<PortfolioDto> getAllPortfolio() {
		
		
		List<PortfolioDto> portfolioDtoList = new ArrayList<>();
		List<PortfolioModel> portfolioModelList  = (List<PortfolioModel>) portfolioDao.getAllPortfolio();
		
		
		for (PortfolioModel portfolioModel : portfolioModelList) {
			PortfolioDto portfolioDto = new PortfolioDto();
			portfolioPopulator.populate(portfolioModel,portfolioDto);
			portfolioDtoList.add(portfolioDto);
		}
		
		return portfolioDtoList;
		
	}
	
	@Override
	public void addPortfolio(PortfolioDto portfolioDto) {
		PortfolioModel portfolioModel = new PortfolioModel();
		portfolioPopulator.populate(portfolioDto, portfolioModel);
		portfolioDao.addPortfolio(portfolioModel);
		
	}
	
	
	@Override
	public PortfolioDto getPortfolio(int id) {
		PortfolioDto portfolioDto = new PortfolioDto();
		portfolioPopulator.populate(portfolioDao.getPortfolio(id),portfolioDto);
		return portfolioDto;
	}
	
	
	@Override
	public void updatePortfolio(PortfolioDto portfolioDto){
		PortfolioModel portfolioModel = new PortfolioModel();
		portfolioPopulator.populate(portfolioDto, portfolioModel);
		System.out.println("inside service " +portfolioModel);
		portfolioDao.updatePortfolio(portfolioModel);
	}

	@Override
	public void deletePortfolio(int id) {
		// TODO Auto-generated method stub
		portfolioDao.deletePortfolio(id);
	}
}
