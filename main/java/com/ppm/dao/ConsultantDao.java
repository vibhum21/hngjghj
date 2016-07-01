package com.ppm.dao;

import com.ppm.model.ConsultantModel;

public interface ConsultantDao {
	public ConsultantModel getAllConsultant();
	public void addConsultant(ConsultantModel consultant);
	public void updateConsultant(ConsultantModel consultant);
	public void deleteConsultant(int id);
	public ConsultantModel getConsultant(int id);
}
