package com.ppm.service;

import java.util.List;

import com.ppm.dto.PortfolioDto;

public interface PortfolioService {

	public void addPortfolio(PortfolioDto portfolio);
	public void updatePortfolio(PortfolioDto portfolio);
	public List<PortfolioDto> getAllPortfolio();
	public void deletePortfolio(int id);
	public PortfolioDto getPortfolio(int id);
}
