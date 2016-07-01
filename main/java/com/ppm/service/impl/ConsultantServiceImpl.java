package com.ppm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppm.dao.ConsultantDao;
import com.ppm.dto.ConsultantDto;
import com.ppm.dto.PortfolioDto;
import com.ppm.model.ConsultantModel;

import com.ppm.populator.ConsultantPopulator;
import com.ppm.service.ConsultantService;

@Service
public class ConsultantServiceImpl implements ConsultantService {
	@Autowired
	ConsultantDao consultantDao;
	@Autowired
	ConsultantPopulator consultantPopulator;
	
	@Override
	public ConsultantDto getAllConsultant() {
		ConsultantDto consultantDto = new ConsultantDto();
		consultantPopulator.populate(consultantDao.getAllConsultant(),consultantDto);
		return consultantDto;
	}
	
	@Override
	public void addConsultant(ConsultantDto consultantDto) {
		ConsultantModel consultantModel = new ConsultantModel();
		consultantPopulator.populate(consultantDto, consultantModel);
		consultantDao.addConsultant(consultantModel);
		
	}
	
	
	@Override
	public ConsultantDto getConsultant(int id) {
		ConsultantDto consultantDto = new ConsultantDto();
		consultantPopulator.populate(consultantDao.getConsultant(id),consultantDto);
		return consultantDto;
	}
	
	
	@Override
	public void updateConsultant(ConsultantDto consultantDto){
		ConsultantModel consultantModel = new ConsultantModel();
		consultantPopulator.populate(consultantDto, consultantModel);
		System.out.println("inside service " +consultantModel);
		consultantDao.updateConsultant(consultantModel);
	}

	@Override
	public void deleteConsultant(int id) {
		// TODO Auto-generated method stub
		consultantDao.deleteConsultant(id);
	}
}
