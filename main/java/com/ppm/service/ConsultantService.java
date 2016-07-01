package com.ppm.service;

import com.ppm.dto.ConsultantDto;

public interface ConsultantService {
	public void addConsultant(ConsultantDto employee);
	public void updateConsultant(ConsultantDto employee);
	public ConsultantDto getAllConsultant();
	public void deleteConsultant(int id);
	public ConsultantDto getConsultant(int id);
}
