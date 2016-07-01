package com.ppm.controller;

import com.ppm.dto.ConsultantDto;

public interface ConsultantController {
	public ConsultantDto getAllConsultant();
	public ConsultantDto getConsultant(int id);
	public ConsultantDto addConsultant(ConsultantDto consultantDto);
	public ConsultantDto updateConsultant(ConsultantDto consultantDto);
	public void deleteConsultant(int projectid);
}
