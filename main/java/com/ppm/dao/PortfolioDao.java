package com.ppm.dao;

import java.util.List;

import com.ppm.model.PortfolioModel;

public interface PortfolioDao {
	
	public List<PortfolioModel> getAllPortfolio();
	public void addPortfolio(PortfolioModel portfolio);
	public void updatePortfolio(PortfolioModel portfolio);
	public void deletePortfolio(int id);
	public PortfolioModel getPortfolio(int id);
}
